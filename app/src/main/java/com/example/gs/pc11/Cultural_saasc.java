package com.example.gs.pc11;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by GS on 15-10-2016.
 */

public class Cultural_saasc extends AppCompatActivity {
    TextView saasc_content;
    TextView saasc_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cultural_saasc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_saasc);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://pecconnect-d2c5f.firebaseio.com");
        DatabaseReference message1Ref = mRootRef.child("saasc_content");
        DatabaseReference message2Ref = mRootRef.child("saasc_contact");

        saasc_content = (TextView) findViewById(R.id.saasc_content);
        saasc_contact = (TextView) findViewById(R.id.saasc_contact);

        message1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                saasc_content.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                saasc_contact.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}