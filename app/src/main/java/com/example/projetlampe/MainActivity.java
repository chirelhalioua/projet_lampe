package com.example.projetlampe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Classe principale de l'application.
 * Cette classe représente l'activité principale qui est affichée au démarrage de l'application.
 */

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.projetlampe.EXTRA_MESSAGE";


    /**
     * Méthode appelée lors de la création de l'activité.
     * Elle initialise l'interface utilisateur en utilisant le layout "activity_main".
     *
     * @param savedInstanceState L'état enregistré de l'activité.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Il s'agit d'une page de bienvenue avec un bouton inscription et un bouton connexion qui dirigent vers l'activité "Inscription" et l'activité "Connexion" si l'utilisateur a déjà un compte. */

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Inscription.class);
        Button editText = (Button) findViewById(R.id.button);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = (Button) findViewById(R.id.button2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}