package com.example.win10.nyobaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity2 extends AppCompatActivity
{
    private RelativeLayout pemilik1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Akan menampilkan page/layout activity_main3
        setContentView(R.layout.activity_main3);

        // Value pemilik1 yang berisi id    = pemilik1
        pemilik1 =(RelativeLayout) findViewById(R.id.pemilik1);

        // Apabila Value pemilik di click maka akan melakukan method buka pemilik
        pemilik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaPemilik();
            }
        });

    }
    public void bukaPemilik(){

        // Memasukan konten dan fungsion yang berapa pada mainactivity3
        Intent pemilik1 = new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(pemilik1);
    }
}
