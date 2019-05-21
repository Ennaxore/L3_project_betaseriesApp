package com.projet.roxanne_thomas.betaserie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{
    private Button conButton;
    private Button insButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conButton = findViewById(R.id.con_button);
        conButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String url = "";
                new HttpsRequester(url).get();
                openConnectionActivity();
            }
        });

        insButton = findViewById(R.id.ins_button);
        insButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                openInscriptionActivity();
            }
        });
    }

    public void openConnectionActivity()
    {
        Intent conActivity = new Intent(this, com.projet.roxanne_thomas.betaserie.ConnectionActivity.class);
        startActivity(conActivity);
    }

    public void openInscriptionActivity()
    {
        Intent insActivity = new Intent(this, com.projet.roxanne_thomas.betaserie.InscriptionActivity.class);
        startActivity(insActivity);
    }
}
