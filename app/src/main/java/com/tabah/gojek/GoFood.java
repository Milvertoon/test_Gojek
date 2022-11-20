package com.tabah.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GoFood extends AppCompatActivity {

    EditText etnama,etalamat,etpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        getSupportActionBar().setTitle("Go Food");

        etnama = (EditText) findViewById(R.id.y_nama);
        etalamat = (EditText) findViewById(R.id.y_alamat);
        etpesan = (EditText) findViewById(R.id.y_pesan);
    }

    public void kirimPesanan (View view){
        Intent intent = new Intent(GoFood.this, OrderFood.class);
        intent.putExtra("etnama",etnama.getText().toString());
        intent.putExtra("etalamat",etalamat.getText().toString());
        intent.putExtra("etpesan",etpesan.getText().toString());
        startActivity(intent);
    }
}