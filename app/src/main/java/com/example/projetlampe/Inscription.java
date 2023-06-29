package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Classe représentant l'activité d'inscription.
 * Cette classe permet aux utilisateurs de s'inscrire en fournissant leurs informations.
 */
public class Inscription extends AppCompatActivity {

    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "inscription".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send3".
     * Elle lance une nouvelle activité "OnOffLampe" et transmet un message en tant qu'extra.
     *
     * @param view La vue du bouton "Send3" qui a déclenché l'événement.
     */
    public void sendMessage3(View view) {
        Intent intent = new Intent(this, OnOffLampe.class);
        Button editText = (Button) findViewById(R.id.button3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}