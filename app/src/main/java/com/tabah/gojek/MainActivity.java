package com.tabah.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void biayaOjek(View view){
        Intent intent = new Intent(MainActivity.this, BiayaOjek.class);
        startActivity(intent);
    }

    public void goFood(View view){
        Intent intent = new Intent(MainActivity.this, GoFood.class);
        startActivity(intent);
    }
}