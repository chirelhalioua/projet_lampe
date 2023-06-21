package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EconomieEnergie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.economie);
    }

    public void sendMessage6(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = findViewById(R.id.button6);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendMessage15(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    public void sendMessage16(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    public void sendMessage17(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }

    public void sendMessage18(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }
}