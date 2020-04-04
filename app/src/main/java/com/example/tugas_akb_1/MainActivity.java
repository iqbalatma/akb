package com.example.tugas_akb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    4 April 2020, 14.25 WIB : Selesai membuat halaman welcome
//    4 April 2020, 17.33 WIB : Selesai Membuat halaman login dan memberi event onClick pada button "mulai"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    public void pindahactivity(View v){
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);

    }


}
