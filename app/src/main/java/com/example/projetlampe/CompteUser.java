package com.example.projetlampe;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Classe représentant l'activité du compte utilisateur.
 * Cette classe affiche les informations et les options liées au compte utilisateur.
 */
public class CompteUser extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.projetlampe.EXTRA_MESSAGE";
    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "compteuser".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compteuser);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send7" qui permet à l'utilisateur de se déconnecter.
     * Elle lance une nouvelle activité "Connexion" et transmet un message en tant qu'extra.
     *
     * @param view La vue du bouton "Send7" qui a déclenché l'événement.
     */
    public void sendMessage7(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = findViewById(R.id.button9);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send19".
     * Elle lance une nouvelle activité "Fonctionnalites".
     *
     * @param view La vue du bouton "Send19" qui a déclenché l'événement.
     */
    public void sendMessage19(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send20".
     * Elle lance une nouvelle activité "EconomieEnergie".
     *
     * @param view La vue du bouton "Send20" qui a déclenché l'événement.
     */
    public void sendMessage20(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send21".
     * Elle lance une nouvelle activité "CompteUser" (actualisation de la page).
     *
     * @param view La vue du bouton "Send21" qui a déclenché l'événement.
     */
    public void sendMessage21(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }

    /**
     * Méthode appelée lorsque l'utilisateur appuie sur le bouton "Send22".
     * Elle lance une nouvelle activité "Contact".
     *
     * @param view La vue du bouton "Send22" qui a déclenché l'événement.
     */
    public void sendMessage22(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }

}
