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
 * Created by GS on 18-10-2016.
 */

public class Scc extends AppCompatActivity {
    TextView scc_content;
    TextView scc_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_scc);
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
        DatabaseReference message1Ref = mRootRef.child("scc_content");
        DatabaseReference message2Ref = mRootRef.child("scc_contact");

        scc_content = (TextView) findViewById(R.id.scc_content);
        scc_contact = (TextView) findViewById(R.id.scc_contact);

        message1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                scc_content.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        message2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                scc_contact.setText(message);
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
