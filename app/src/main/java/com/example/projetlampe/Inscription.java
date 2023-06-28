package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Inscription extends AppCompatActivity {


    public void sendMessage3(View view) {
        Intent intent = new Intent(this, OnOffLampe.class);
        Button editText = (Button) findViewById(R.id.button3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    private EditText nomEditText, prenomEditText, mailEditText, telEditText;
    private Button buttonInscription;
    private RequestQueue requestQueue;
    private static final String URL = "http://localhost/my-app/insert_user.php"; // Remplacez par l'URL de votre script PHP

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);

        nomEditText = findViewById(R.id.editTextTextPersonName2);
        prenomEditText = findViewById(R.id.editTextTextPersonName3);
        mailEditText = findViewById(R.id.editTextTextPersonName4);
        buttonInscription = findViewById(R.id.button3);
        requestQueue = Volley.newRequestQueue(this);

        buttonInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les valeurs des champs de saisie
                String nom = nomEditText.getText().toString();
                String prenom = prenomEditText.getText().toString();
                String mail = mailEditText.getText().toString();

                // Appeler la méthode pour effectuer la requête POST
                inscrireUtilisateur(nom, prenom, mail);
            }
        });
    }



    private void inscrireUtilisateur(String nom, String prenom, String mail) {
        // Créer une requête POST avec les paramètres
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Gérer la réponse du serveur
                        // Vous pouvez mettre ici le code pour traiter la réponse du serveur après l'insertion de l'utilisateur
                        // Par exemple, afficher un message de réussite ou une erreur
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Gérer les erreurs de la requête
                        // Vous pouvez mettre ici le code pour afficher un message d'erreur en cas d'échec de la requête
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                // Ajouter les paramètres à la requête POST
                Map<String, String> params = new HashMap<>();
                params.put("nom", nom);
                params.put("prenom", prenom);
                params.put("mail", mail);
                return params;
            }
        };

        // Ajouter la requête à la file d'attente de Volley
        requestQueue.add(stringRequest);
    }

}