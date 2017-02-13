package com.example.gs.pc11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by GS on 04-09-2016.
 */
public class Cultural_main extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cultural);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_cultural);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    public void dramaticson(View a) {
        if (a.getId() == R.id.dramatics2) {
            Intent intent = new Intent(Cultural_main.this, Cultural_dramatics.class);
            startActivity(intent);
        }
    }
    public void musicon(View a) {
        if (a.getId() == R.id.music2) {
            Intent intent = new Intent(Cultural_main.this, Cultural_music.class);
            startActivity(intent);
        }
    }
    public void saascon(View a) {
        if (a.getId() == R.id.saasc2) {
            Intent intent = new Intent(Cultural_main.this, Cultural_saasc.class);
            startActivity(intent);
        }
    }
    public void apcon(View a) {
        if (a.getId() == R.id.apc2) {
            Intent intent = new Intent(Cultural_main.this, Cultural_apc.class);
            startActivity(intent);
        }
    }
    public void pdcon(View a) {
        if (a.getId() == R.id.pdc2) {
            Intent intent = new Intent(Cultural_main.this, Cultural_pdc.class);
            startActivity(intent);
        }
    }
}