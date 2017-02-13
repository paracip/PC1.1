package com.example.gs.pc11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by GS on 29-09-2016.
 */
public class Clubs1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_mainest);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void culturalon(View a) {
        if (a.getId() == R.id.cultural2) {
            Intent culturalin = new Intent(Clubs1.this, Cultural_main.class);
            startActivity(culturalin);
        }
    }

    public void technicalon(View a) {
        if (a.getId() == R.id.technical2) {
            Intent culturalin = new Intent(Clubs1.this, Technical_main.class);
            startActivity(culturalin);
        }
    }

    public void eicon(View a) {
        if (a.getId() == R.id.eic2) {
            Intent culturalin = new Intent(Clubs1.this, EIC.class);
            startActivity(culturalin);
        }
    }

    public void sccon(View a) {
        if (a.getId() == R.id.scc2) {
             Intent culturalin = new Intent(Clubs1.this, Scc.class);
             startActivity(culturalin);
        }
    }

    public void edboardon(View a) {
        if (a.getId() == R.id.edboard2) {
            Intent culturalin = new Intent(Clubs1.this, Edboards.class);
            startActivity(culturalin);
        }
    }

    public void nsson(View a) {
        if (a.getId() == R.id.nss2) {
            Intent culturalin = new Intent(Clubs1.this, NSS.class);
            startActivity(culturalin);
        }
    }
}