package com.example.tugas_akb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        TextView view = (TextView)findViewById(R.id.textView8);
        String formattedText = "<b>Ketentuan Pengguna</b> dan <b>Kebijakan Data</b> Kami";
// or getString(R.string.htmlFormattedText);
        view.setText(Html.fromHtml(formattedText));
        EditText et = findViewById(R.id.editText5);
        et.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
    }
    public void pindahbiodataactivity(View v){
        Intent i = new Intent(LoginActivity.this, BiodataActivity.class);
        startActivity(i);
    }
//    public void pindahsayhaiactivity(View v){
//
//        Intent i = new Intent(LoginActivity.this, Hai.class);
//        startActivity(i);
//    }

}
