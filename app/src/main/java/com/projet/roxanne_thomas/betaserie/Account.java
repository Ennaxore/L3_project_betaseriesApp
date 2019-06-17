package com.projet.roxanne_thomas.betaserie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_activity);
    }

    public void goToAccount(View v)
    {
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }

    public void goToSearch(View v)
    {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void goToSeries(View v)
    {
        Intent intent = new Intent(this, MySerie.class);
        startActivity(intent);
    }
}
