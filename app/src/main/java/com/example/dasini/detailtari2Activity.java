package com.example.dasini;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class detailtari2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailtari2_activity);
    }
    public void tontontari2(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bv8vrrX4lYM"));
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
}
