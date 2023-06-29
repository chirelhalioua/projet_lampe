package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Classe représentant l'activité d'économie d'énergie.
 * Cette classe affiche les fonctionnalités liées à l'économie d'énergie de l'application : l'utilisateur pourra programmer l'allumage de la lampe, et voir combien de temps la lampe a été allumée par jour, si c'est élevé l'application lui enverra un message de réduire le temps de consommation.
 */
public class EconomieEnergie extends AppCompatActivity {

    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "economie".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.economie);
    }


    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send6" qui permet à l'utilisateur de se déconnecter.
     * Elle lance une nouvelle activité "Connexion" et transmet un message en tant qu'extra.
     *
     * @param view La vue du bouton "Send6" qui a déclenché l'événement.
     */
    public void sendMessage6(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = findViewById(R.id.button6);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send15".
     * Elle lance une nouvelle activité "Fonctionnalites".
     *
     * @param view La vue du bouton "Send15" qui a déclenché l'événement.
     */
    public void sendMessage15(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send16".
     * Elle lance une nouvelle activité "EconomieEnergie" (actualisation de la page).
     *
     * @param view La vue du bouton "Send16" qui a déclenché l'événement.
     */
    public void sendMessage16(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send17".
     * Elle lance une nouvelle activité "CompteUser".
     *
     * @param view La vue du bouton "Send17" qui a déclenché l'événement.
     */
    public void sendMessage17(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send18".
     * Elle lance une nouvelle activité "Contact".
     *
     * @param view La vue du bouton "Send18" qui a déclenché l'événement.
     */
    public void sendMessage18(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }
}