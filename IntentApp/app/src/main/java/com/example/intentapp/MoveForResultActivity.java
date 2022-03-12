package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveForResultActivity extends AppCompatActivity {
    private TextView txtKet, txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_for_result);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        txtKet = (TextView) findViewById(R.id.txt_ket);
        Bundle b = getIntent().getExtras();
        txtKet.setText(b.getString("ket"));
        txtHasil.setText(b.getString("hasil"));
    }
}