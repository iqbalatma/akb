package com.example.tugas_akb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Hai extends AppCompatActivity {

    String KEY_NAME = "NAMA";
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hai);

//        untuk menerima data yang dikirim dari aktivity sebelumnya melalui ekstra
        Bundle extra = getIntent().getExtras();

//        Untuk menyimpan data yang ada di ekstra kedalam variabel
        String nama = extra.getString(KEY_NAME);
        text = findViewById(R.id.textView4);
        text.setText("Beres!  Sekarang "+nama+" udah bisa ngecek penggunaan HP "+nama+" tiap hari buat bantu " +nama+" ngatur waktu :)");



    }
    public void pindahkeawal(View v){
        Intent i = new Intent(Hai.this, MainActivity.class);
        startActivity(i);
    }
}
