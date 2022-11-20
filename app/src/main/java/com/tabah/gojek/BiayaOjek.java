package com.tabah.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BiayaOjek extends AppCompatActivity {

    EditText etKilometer;
    Button btnTotal;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biaya_ojek);

        etKilometer = (EditText) findViewById(R.id.et_kilometer);
        btnTotal = (Button) findViewById(R.id.btn_total_biaya);
        tvTotal = (TextView) findViewById(R.id.tv_total);

    }

    public void totalBiaya(View view){
        if (etKilometer.getText().toString().isEmpty()){
            etKilometer.setError("Error");
            return;
        }

        String jarak = etKilometer.getText().toString().trim();
        int hargaPerKilometer = 5000;

        int jarakAngka = Integer.parseInt(jarak);

        int hasilHitung = jarakAngka*hargaPerKilometer;
        Toast.makeText(this,""+hasilHitung, Toast.LENGTH_SHORT);

        tvTotal.setText(""+hasilHitung);

    }


}