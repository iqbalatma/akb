package com.example.tugas_akb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/*
NIM     : 10117124
Nama    : Iqbal Atma Muliawan
Kelas   : IF4
Matkul  : Aplikasi Komputasi Bergerak
Tugas   : AKB-Tugas-1


 */
//    4 April 2020, 14.25 WIB : Selesai membuat halaman welcome
//    4 April 2020, 17.33 WIB : Selesai Membuat halaman login dan memberi event onClick pada button "mulai"
//    4 April 2020, 20.30 WIB : Selesai Membuat halaman biodata dan halaman hay, dan juga tombolnya sudah berfungsi semua dengan baik untuk pinda activity
//    Tugas sudah selesai tinggal finishing dengan merapikan beberapa codingan 22.35
//    7 April Revisi Mengganti Button Kode menjadi EditText, kemudian mengirimkan data yang dutilis pada activity biodata dan di terima di activity hai
//    8 April Membuat apk rilis dan mengirim file ke email

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
