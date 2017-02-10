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

public class Cultural_dramatics extends AppCompatActivity {
    TextView dramatics_content;
    TextView dramatics_contact;
    private static FirebaseDatabase mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cultural_dramatics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_dramatics);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mDatabase = FirebaseDatabase.getInstance();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
    @Override
    protected void onStart() {
        super.onStart();
        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://pecconnect-d2c5f.firebaseio.com");
        DatabaseReference message1Ref = mRootRef.child("dramatics_content");
        DatabaseReference message2Ref = mRootRef.child("dramatics_contact");

        dramatics_content = (TextView) findViewById(R.id.dramatics_content);
        dramatics_contact = (TextView) findViewById(R.id.dramatics_contact);

        message1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                dramatics_content.setText(message);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        message2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                dramatics_contact.setText(message);

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
