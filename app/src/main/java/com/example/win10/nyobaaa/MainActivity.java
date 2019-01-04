package com.example.win10.nyobaaa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    View view;
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view    =   this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.hitam);

        // Menginisasi Drawer Layout dan ActionBarToggle
        drawer = findViewById(R.id.drawer_layout);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                bukaTambah();
//            }
//        });

        // Menginisiasi  NavigationView
        NavigationView navigationView = findViewById(R.id.nav_view);
        //Mengatur Navigasi View Item yang akan dipanggil untuk menangani item klik menu navigasi
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new dasbor_fragment()).commit();

            // Membuat halaman pertama yang dibuka adalah nav_dasbor
            navigationView.setCheckedItem(R.id.nav_dasbor);
        }
    }

    public void bukaPertanian(){
        Intent pertanian = new Intent(getApplicationContext(),MainActivity4.class);
        startActivity(pertanian);
    }

//    public void bukaTambah(){
//        Intent tambah = new Intent(getApplicationContext(),TambahActivity.class);
//        startActivity(tambah);
//    }


    // Mengatur Button Warna setelah di pencet (On Click)
    public void birutua(View view){
        view.setBackgroundResource(R.color.bagtoolbar);
    }
    // Metod ini akan memicu item Klik menu navigasi
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        //Memeriksa untuk melihat item yang akan dilklik dan melalukan aksi
        switch (item.getItemId()) {
            // pilihan menu item navigasi akan menampilkan sesuai halaman pilihan ketika di klik
            case R.id.nav_dasbor:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new dasbor_fragment()).commit();
                break;
            case R.id.nav_pertanian:
                Intent page2 = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(page2);
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
        // Kode di sini akan merespons setelah drawer menutup disini kita biarkan kosong
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        //  Kode di sini akan merespons setelah drawer terbuka disini kita biarkan kosong
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
