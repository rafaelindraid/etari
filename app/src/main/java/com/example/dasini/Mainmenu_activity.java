package com.example.dasini;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Mainmenu_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmeu);
    }

    public void home(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Mainmenu_activity.this, Mainmenu_activity.class);
        startActivity(intent);
    }
    public void info(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Mainmenu_activity.this, InfoActivity.class);
        startActivity(intent);
    }
    public void tari1(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Mainmenu_activity.this, detailtari1Activity.class);
        startActivity(intent);
    }
    public void tari2(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Mainmenu_activity.this, detailtari2Activity.class);
        startActivity(intent);
    }
    public void tari3(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Mainmenu_activity.this, detailtari3Activity.class);
        startActivity(intent);
    }
    public void tari4(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Mainmenu_activity.this, detailtari4Activity.class);
        startActivity(intent);
    }
    public void tari5(View view) {   //pindah Aktivity Info
        Intent intent = new Intent( Mainmenu_activity.this, detailtari5Activity.class);
        startActivity(intent);
    }

}
