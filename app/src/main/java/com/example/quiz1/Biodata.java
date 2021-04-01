package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void btnBack(View view) {
        Intent j = new Intent(Biodata.this, MainActivity.class);
        startActivity(j);
    }

    public void btnLogout(View view) {
        MainActivity.logout(this);
    }
}