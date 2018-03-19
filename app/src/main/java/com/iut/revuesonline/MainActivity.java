package com.iut.revuesonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText mail, mot_de_passe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bjaune); // j'initialise les widgets
        mail = findViewById(R.id.etemail);
        mot_de_passe = findViewById(R.id.etmot);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // je mets en place le toast demandé pour l'exercice
                Toast.makeText(getApplicationContext(),(String.format("tentative de connexion de %s", mail.getText().toString())),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
