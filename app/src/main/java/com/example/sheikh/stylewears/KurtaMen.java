package com.example.sheikh.stylewears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KurtaMen extends AppCompatActivity {

    TextView tvChangeKurta;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurta_men);

        tvChangeKurta = (TextView) findViewById(R.id.tvChangeKurta);

        Bundle getvalue = getIntent().getExtras();
        String returnedValue = getvalue.getString("database_value");

        tvChangeKurta.setText(returnedValue);

        button = (Button) findViewById(R.id.ThanksButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvChangeKurta.setText("Request Received" + "\n" + "Thank You For Shopping");
            }
        });

    }
}
