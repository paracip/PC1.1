package com.example.gs.pc11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by GS on 08-01-2017.
 */

public class Menu_settings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent mainIntent = new Intent(Menu_settings.this, Menu_contacts.class);
        Menu_settings.this.startActivity(mainIntent);
        Menu_settings.this.finish();
    }
}