package com.example.win10.nyobaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Akan menampilkan page/layout pada activity_main4
        setContentView(R.layout.activity_main4);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukaTambah();
            }
        });

    }
    public void bukaTambah (){
        Intent tambah = new Intent(getApplicationContext(),TambahActivity.class);
        startActivity(tambah);
    }
}
