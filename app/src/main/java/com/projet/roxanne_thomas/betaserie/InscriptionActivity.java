package com.projet.roxanne_thomas.betaserie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InscriptionActivity extends AppCompatActivity
{

    private Button goBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_activity);

        goBackButton = findViewById(R.id.go_back_button);
        goBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goBack();
            }
        });
    }

    public void goBack()
    {
        Intent goBackActivity = new Intent(this, MainActivity.class);
        startActivity(goBackActivity);
    }
}
