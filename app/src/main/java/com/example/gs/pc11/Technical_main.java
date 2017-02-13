package com.example.gs.pc11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by GS on 12-10-2016.
 */
public class Technical_main extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.technical);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_technical);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    public void ieeeon(View a) {
        if (a.getId() == R.id.ieee2) {
            Intent intent = new Intent(Technical_main.this, Technical_ieee.class);
            startActivity(intent);
        }
    }
    public void roboticson(View a) {
        if (a.getId() == R.id.robotics2) {
            Intent intent = new Intent(Technical_main.this, Technical_robotics.class);
            startActivity(intent);
        }
    }
    public void saeon(View a) {
        if (a.getId() == R.id.sae2) {
            Intent intent = new Intent(Technical_main.this, Technical_sae.class);
            startActivity(intent);
        }
    }
    public void sesion(View a) {
        if (a.getId() == R.id.sesi2) {
            Intent intent = new Intent(Technical_main.this, Technical_sesi.class);
            startActivity(intent);
        }
    }
    public void asceon(View a) {
        if (a.getId() == R.id.asce2) {
            Intent intent = new Intent(Technical_main.this, Technical_asce.class);
            startActivity(intent);
        }
    }
}