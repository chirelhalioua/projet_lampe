package com.example.projetlampe;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Classe représentant l'activité de connexion.
 * Cette classe gère le processus de connexion de l'utilisateur.
 */
public class Connexion extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.projetlampe.EXTRA_MESSAGE";

    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "connexion".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send4".
     * Elle lance une nouvelle activité "OnOffLampe" et transmet un message en tant qu'extra.
     *
     * @param view La vue du bouton "Send4" qui a déclenché l'événement.
     */
    public void sendMessage4(View view) {
        Intent intent = new Intent(this, OnOffLampe.class);
        Button editText = findViewById(R.id.button4);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
