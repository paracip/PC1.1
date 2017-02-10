package com.example.gs.pc11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by GS on 15-10-2016.
 */

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);
    }
        public void loginbutton(View a){
            if(a.getId() == R.id.button123){
                EditText username = (EditText) findViewById(R.id.username);
                Intent login = new Intent(Login.this, MainActivity.class);
                login.putExtra ( "TextBox", username.getText().toString() );
                startActivity(login);
            }
        }
}
