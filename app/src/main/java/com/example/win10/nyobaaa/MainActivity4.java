package com.example.win10.nyobaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity4 extends AppCompatActivity
{
    // Bikin value padi
    private RelativeLayout padi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Value padi yang berisi id = padi
        padi = (RelativeLayout) findViewById(R.id.onclickpad);
        // Apabila value padi di click maka akan menjalakan method bukapadi
        padi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaPadi();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukaTambah();
            }
        });

    }

    public void bukaTambah(){
        Intent tambah = new Intent(getApplicationContext(),TambahActivity.class);
        startActivity(tambah);
    }

    public void bukaPadi(){

        // Memasukan konten dan fungsion yang berapa pada mainactivity2
        Intent page2 = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(page2);
    }
}
