package com.example.sheikh.stylewears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KurtaMen extends AppCompatActivity {

    TextView tvChangeKurta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurta_men);

        tvChangeKurta = (TextView) findViewById(R.id.tvChangeKurta);

        Bundle getvalue = getIntent().getExtras();
        String returnedValue = getvalue.getString("database_value");

        tvChangeKurta.setText(returnedValue);

    }
}
