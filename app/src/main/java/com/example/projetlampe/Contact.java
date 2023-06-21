package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Contact extends AppCompatActivity {

    private ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        myImageButton = findViewById(R.id.imageButton8);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Actions à effectuer lorsque le bouton est appuyé

                // Changer la couleur de l'image
                myImageButton.getDrawable().setColorFilter(getResources().getColor(R.color.purple), PorterDuff.Mode.MULTIPLY);

                // Redessiner l'image pour appliquer la couleur modifiée
                myImageButton.invalidate();

                // Ajoutez ici le code que vous souhaitez exécuter lorsque le bouton est appuyé
                // Par exemple, ouvrir une autre activité :
                Intent intent = new Intent(Contact.this, Fonctionnalites.class);
                startActivity(intent);
            }
        });
    }











public void sendMessage8(View view) {
        Intent intent = new Intent(this, Connexion.class);
        Button editText = findViewById(R.id.button8);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendMessage23(View view) {
        Intent intent = new Intent(this, Fonctionnalites.class);
        startActivity(intent);
    }

    public void sendMessage24(View view) {
        Intent intent = new Intent(this, EconomieEnergie.class);
        startActivity(intent);
    }

    public void sendMessage25(View view) {
        Intent intent = new Intent(this, CompteUser.class);
        startActivity(intent);
    }

    public void sendMessage26(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }





}