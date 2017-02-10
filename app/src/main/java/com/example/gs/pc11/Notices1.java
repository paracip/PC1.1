package com.example.gs.pc11;

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
 * Created by GS on 29-09-2016.
 */
public class Notices1 extends AppCompatActivity {

    TextView N1;
    TextView N2;
    TextView N3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notices);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_notices);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
    @Override
    protected void onStart() {
        super.onStart();
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://pecconnect-d2c5f.firebaseio.com");
        DatabaseReference message1Ref = mRootRef.child("N1");
        DatabaseReference message2Ref = mRootRef.child("N2");
        DatabaseReference message3Ref = mRootRef.child("N3");

        N1 = (TextView) findViewById(R.id.N1);
        N2 = (TextView) findViewById(R.id.N2);
        N3 = (TextView) findViewById(R.id.N3);

        message1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                N1.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                N2.setText(message);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                N3.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}