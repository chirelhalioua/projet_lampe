package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Classe représentant l'activité de contact.
 * Cette classe affiche les informations de contact et les options de communication.
 */
public class Contact extends AppCompatActivity {


    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "contact".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send8" qui permet à l'utilisateur de se déconecter.
     * Elle lance une nouvelle activité "Connexion" et transmet un message en tant qu'extra.
     *
     * @param view La vue du bouton "Send8" qui a déclenché l'événement.
     */
    public void sendMessage8(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = findViewById(R.id.button8);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send23".
     * Elle lance une nouvelle activité "Fonctionnalites".
     *
     * @param view La vue du bouton "Send23" qui a déclenché l'événement.
     */
    public void sendMessage23(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send24".
     * Elle lance une nouvelle activité "EconomieEnergie".
     *
     * @param view La vue du bouton "Send24" qui a déclenché l'événement.
     */
    public void sendMessage24(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send25".
     * Elle lance une nouvelle activité "CompteUser".
     *
     * @param view La vue du bouton "Send25" qui a déclenché l'événement.
     */
    public void sendMessage25(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send26".
     * Elle lance une nouvelle activité "Contact" (actualisation de la page).
     *
     * @param view La vue du bouton "Send26" qui a déclenché l'événement.
     */
    public void sendMessage26(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }

}
