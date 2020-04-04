package com.example.tugas_akb_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
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
    }
}
