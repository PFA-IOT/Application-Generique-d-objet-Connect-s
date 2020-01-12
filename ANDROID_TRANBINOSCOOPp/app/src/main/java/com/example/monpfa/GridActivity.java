package com.example.monpfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GridActivity extends AppCompatActivity {

    TextView nom,prenom,email,tel,classe;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        image = findViewById(R.id.image);
        email = findViewById(R.id.email);
        classe = findViewById(R.id.classe);
        tel = findViewById(R.id.tel);


        Intent intent = getIntent();
        nom.setText(intent.getStringExtra("nom"));
        prenom.setText(intent.getStringExtra("prenom"));
        image.setImageResource(intent.getIntExtra("image",0));
        email.setText(intent.getStringExtra("email"));
        tel.setText(intent.getStringExtra("tel"));
        classe.setText(intent.getStringExtra("classe"));
    }
}
