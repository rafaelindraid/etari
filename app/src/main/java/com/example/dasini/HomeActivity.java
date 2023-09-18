package com.example.dasini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class HomeActivity extends AppCompatActivity {

    public void info(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( HomeActivity.this, InfoActivity.class);
        startActivity(intent);
    }



}