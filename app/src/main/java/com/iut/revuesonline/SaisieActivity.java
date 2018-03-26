package com.iut.revuesonline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SaisieActivity extends AppCompatActivity {

    private Button button;
    private EditText text, text2, text3, text4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saisie_activity);

        initialize();


        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SaisieActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.name));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }


    public void buttonClicked(View view) {
        String getText = text2.getText().toString();
        String getText2 = text4.getText().toString();
        String toast = getString(R.string.all_missing);
        String toast2 = String.format(getString(R.string.ok),getText,getText2);

        if(getText.equals("") || getText2.equals("")){
            Toast.makeText(getApplicationContext(), toast,
                    Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText((getApplicationContext()),
                    toast2, Toast.LENGTH_LONG).show();
        }
    }


    public void initialize(){
        button = findViewById(R.id.bAdd);
        text = findViewById(R.id.etref);
        text2 = findViewById(R.id.ettit);
        text3 = findViewById(R.id.etdes);
        text4 = findViewById(R.id.etfrais);

    }

}
