package com.tabah.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderFood extends AppCompatActivity {

    TextView tvnama, tvalamat, tvpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        tvnama = (TextView) findViewById(R.id.tvnama);
        tvalamat = (TextView) findViewById(R.id.tvalamat);
        tvpesan = (TextView) findViewById(R.id.tvpesan);

        tvnama.setText(getIntent().getExtras().getString("etnama"));
        tvalamat.setText(getIntent().getExtras().getString("etalamat"));
        tvpesan.setText(getIntent().getExtras().getString("etpesan"));
    }

    public void batalOrder(View view){
        this.finish();
    }
}