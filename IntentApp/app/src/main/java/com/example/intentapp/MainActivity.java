package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nama, umur, hobi;
    private TextView hasil;
    private Button search;
    private Button execute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText) findViewById(R.id.name);
        umur = (EditText) findViewById(R.id.old);
        hobi = (EditText) findViewById(R.id.hobby);
        execute = (Button) findViewById(R.id.btn_execute);
        hasil = (TextView) findViewById(R.id.hasil);
        search = (Button) findViewById(R.id.btn_search);

        nama.setOnClickListener(this);
        umur.setOnClickListener(this);
        hobi.setOnClickListener(this);
        search.setOnClickListener(this);
        execute.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_execute){
            String name = nama.getText().toString().trim();
            String old = umur.getText().toString().trim();
            String hobby = hobi.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(name)){
                isEmptyFields = true;
                nama.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(old)){
                isEmptyFields = true;
                umur.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(hobby)){
                isEmptyFields = true;
                hobi.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields){
                String a = name;
                Integer b = Integer.parseInt(old);
                String c = hobby;
                hasil.setText("Nama saya " + a + ". Saya Berumur " + b + " dan Hobi saya adalah " + c + ".");
                i = new Intent(this, MoveForResultActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "HASIL INPUT");
                startActivity(i);
            }
        }

        else if (view.getId() == R.id.btn_search) {
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
            startActivity(i);
        }
    }
}