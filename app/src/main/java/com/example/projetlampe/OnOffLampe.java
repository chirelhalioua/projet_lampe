package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Classe représentant l'activité de contrôle On/Off de la lampe.
 * Cette classe permet d'allumer ou d'éteindre la lampe en utilisant différents boutons.
 */
public class OnOffLampe extends AppCompatActivity {

    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "onofflampe".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onofflampe);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send10" il s'agit donc d'une déconnexion, l'utilisateur est renvoyé vers l'activité "connexion".
     * Elle lance une nouvelle activité "Connexion" et transmet un message en tant qu'extra.
     *
     * @param view La vue du bouton "Send10" qui a déclenché l'événement.
     */
    public void sendMessage10(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = (Button) findViewById(R.id.button7);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send27".
     * Elle lance une nouvelle activité "Fonctionnalites".
     *
     * @param view La vue du bouton "Send27" qui a déclenché l'événement.
     */
    public void sendMessage27(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send28".
     * Elle lance une nouvelle activité "EconomieEnergie".
     *
     * @param view La vue du bouton "Send28" qui a déclenché l'événement.
     */
    public void sendMessage28(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send29".
     * Elle lance une nouvelle activité "CompteUser".
     *
     * @param view La vue du bouton "Send29" qui a déclenché l'événement.
     */
    public void sendMessage29(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }


    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send30".
     * Elle lance une nouvelle activité "Contact".
     *
     * @param view La vue du bouton "Send30" qui a déclenché l'événement.
     */
    public void sendMessage30(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }
}