package com.example.projetlampe;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(this, OnOffLampe.class);
        Button editText = (Button) findViewById(R.id.button3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}