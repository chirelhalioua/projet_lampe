package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompteUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compteuser);
    }

    public void sendMessage7(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = findViewById(R.id.button9);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendMessage19(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    public void sendMessage20(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    public void sendMessage21(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }

    public void sendMessage22(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }
}