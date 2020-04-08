package com.example.tugas_akb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BiodataActivity extends AppCompatActivity {
    String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void pindahactivity(View v){
        EditText inputan_nama = findViewById(R.id.editText);
        nama = inputan_nama.getText().toString();
        try{
            if (nama != null && nama != ""){
                Intent i = new Intent(BiodataActivity.this, Hai.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            } else {
                Toast.makeText(getApplication(), "Kamu harus mengisi nama dan umur kamu.", Toast.LENGTH_SHORT);
            }

        } catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
        }
    }

}
