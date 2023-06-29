package com.example.projetlampe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Inscription extends AppCompatActivity {

    private static final String API_URL = "http://192.168.1.47:3000/users";
    private RequestQueue requestQueue;
    private EditText nomEditText, prenomEditText, mailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);

        nomEditText = findViewById(R.id.editTextTextPersonName2);
        prenomEditText = findViewById(R.id.editTextTextPersonName3);
        mailEditText = findViewById(R.id.editTextTextPersonName4);

        requestQueue = Volley.newRequestQueue(this);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(this, OnOffLampe.class);
        Button editText = findViewById(R.id.button3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    public void inscrireUtilisateur(View view) {
        String nom = nomEditText.getText().toString().trim();
        String prenom = prenomEditText.getText().toString().trim();
        String mail = mailEditText.getText().toString().trim();

        if (!nom.isEmpty() && !prenom.isEmpty() && !mail.isEmpty()) {
            ajouterUtilisateur(nom, prenom, mail);
        } else {
            Toast.makeText(Inscription.this, "Les champs sont vides", Toast.LENGTH_SHORT).show();
        }
    }


    public void ajouterUtilisateur(String nom, String prenom, String mail) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url = "http://192.168.1.47:3000/users";

        // Créer les paramètres de la requête POST
        Map<String, String> params = new HashMap<>();
        params.put("nom", nom);
        params.put("prenom", prenom);
        params.put("mail", mail);

        // Créer une requête POST
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url, new JSONObject(params),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // Traitement de la réponse du serveur en cas de succès
                        Toast.makeText(Inscription.this, "Utilisateur ajouté avec succès", Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Gérer les erreurs de la requête
                        Toast.makeText(Inscription.this, "Erreur lors de l'ajout de l'utilisateur", Toast.LENGTH_SHORT).show();
                    }
                });

        // Ajouter la requête à la file d'attente de Volley
        requestQueue.add(request);
    }

}
