package com.projet.roxanne_thomas.betaserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ConnectionActivity extends AppCompatActivity {

    private Button goBackButton;
    private Button goSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection_activity);

        goBackButton = findViewById(R.id.go_back_button);
        goBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goBack();
            }
        });

        goSearchButton = findViewById(R.id.go_to_search_button);
        goSearchButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                goSearchBase();
            }
        });
    }

    public void goBack()
    {
        onBackPressed();
    }

    public void goSearchBase()
    {
        Intent ficheSerieActivity = new Intent(this, FicheSerieActivity.class);
        Bundle b = new Bundle();
        b.putString("token","ksdfjheakjvhnlkvjnalfekvjn");
        startActivity(ficheSerieActivity);
    }
}
