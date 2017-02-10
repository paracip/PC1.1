package com.example.gs.pc11;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);


        drawer.setDrawerListener(toggle);
        toggle.syncState();

        Intent i = getIntent();
        String text = i.getStringExtra ("TextBox");

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View hview = navigationView.getHeaderView(0);
        TextView nav_user = (TextView)hview.findViewById(R.id.username1);
        nav_user.setText("Hi! " + text);
      /*  TextView username1 = (TextView) findViewById(R.id.username1);

        username1.setText(text);*/
    }
    private boolean shouldLoadHomeFragOnBackPress = true;
    private Handler mHandler;
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (id == R.id.home) {
        } else if (id == R.id.map) {
            Intent sched1 = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(sched1);
        } else if (id == R.id.contacts) {
            Intent sched1 = new Intent(MainActivity.this,Menu_contacts.class);
            startActivity(sched1);
        } else if (id == R.id.alumni) {
            Intent sched1 = new Intent(MainActivity.this, Menu_alumni.class);
            startActivity(sched1);
        } else if (id == R.id.developers) {
            Intent sched1 = new Intent(MainActivity.this, Menu_developers.class);
            startActivity(sched1);
        } else if (id == R.id.academic_calender) {

        } else if (id == R.id.links) {
            Intent sched1 = new Intent(MainActivity.this, Menu_links.class);
            startActivity(sched1);
        }
        else if (id == R.id.action_settings) {
            Intent sched1 = new Intent(MainActivity.this, Menu_developers.class);
            startActivity(sched1);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//button config.
    public void schedon(View a){
        if (a.getId() == R.id.sched) {
            Intent sched1 = new Intent(MainActivity.this, Sched1.class);
            startActivity(sched1);
        }
    }
    public void eventon(View a){
            if (a.getId() == R.id.sched) {
           /* Intent sched1 = new Intent(MainActivity.this, events.class);
            startActivity(sched1);*/
        }
    }
    public void noticeon(View a){
        if (a.getId() == R.id.notice) {
            Intent sched1 = new Intent(MainActivity.this, Notices1.class);
            startActivity(sched1);
        }
    }
    public void clubson(View a){
        if (a.getId() == R.id.clubs) {
           Intent sched1 = new Intent(MainActivity.this, Clubs1.class);
           startActivity(sched1);
        }
    }
   /* public void resulton(View a){
        if (a.getId() == R.id.result) {
           Intent sched1 = new Intent(MainActivity.this, events.class);
            startActivity(sched1);
        }

    }*/
}