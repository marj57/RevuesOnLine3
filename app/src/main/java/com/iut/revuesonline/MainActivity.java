package com.iut.revuesonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText mail, motDePasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bjaune); // j'initialise les widgets
        mail = findViewById(R.id.etemail);
        motDePasse = findViewById(R.id.etmot);

    }

    public void myButton(View view) {
        String toast = String.format(getString(R.string.text)) + mail.getText().toString();
        Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_LONG).show();
    }


}
