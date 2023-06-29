package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Classe représentant l'activité des fonctionnalités de la lampe connectée.
 * Cette classe affiche les différentes fonctionnalités disponibles pour l'application.
 */

public class Fonctionnalites extends AppCompatActivity {

    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "fonctionnalite".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fonctionnalite);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send5" qui permet à l'utilisateur de se déconnecter.
     * Elle lance une nouvelle activité "Connexion" et transmet un message en tant qu'extra.
     *
     * @param view La vue du bouton "Send5" qui a déclenché l'événement.
     */

    public void sendMessage5(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = findViewById(R.id.button7);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send11".
     * Elle lance une nouvelle activité "Fonctionnalites" (actualisation de la page).
     *
     * @param view La vue du bouton "Send11" qui a déclenché l'événement.
     */
    public void sendMessage11(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send12".
     * Elle lance une nouvelle activité "EconomieEnergie".
     *
     * @param view La vue du bouton "Send12" qui a déclenché l'événement.
     */
    public void sendMessage12(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send13".
     * Elle lance une nouvelle activité "CompteUser".
     *
     * @param view La vue du bouton "Send13" qui a déclenché l'événement.
     */
    public void sendMessage13(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send14".
     * Elle lance une nouvelle activité "Contact".
     *
     * @param view La vue du bouton "Send14" qui a déclenché l'événement.
     */
    public void sendMessage14(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }

}