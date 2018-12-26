package com.example.win10.nyobaaa;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    View view;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Super code goes here..
            for (int a = 0; a < 10; a++)
                // do something cool here
            {
                //Someone else fix my bugs
            }

        view    =   this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.hitam);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new dasbor_fragment()).commit();
            navigationView.setCheckedItem(R.id.nav_dasbor);
        }
    }

    public void hijau(View view){
        view.setBackgroundResource(R.color.colorPrimary);
    }
    public void biru_l(View view){
        view.setBackgroundResource(R.color.blue_light);
    }
    public void birutua(View view){
        view.setBackgroundResource(R.color.bagtoolbar);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_dasbor:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new dasbor_fragment()).commit();
                break;
            case R.id.nav_pertanian:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new pertanian_fragment()).commit();
                break;
            case R.id.nav_perkebunan:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new perkebunan_fragment()).commit();
                break;
            case R.id.nav_perhutanan:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new perhutanan_fragment()).commit();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
