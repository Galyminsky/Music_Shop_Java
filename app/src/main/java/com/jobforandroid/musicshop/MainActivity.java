package com.jobforandroid.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseQuantity(View view) {
        TextView count_quantity = findViewById(R.id.count_quantity);
        quantity = quantity + 1;
        count_quantity.setText("" + quantity);
    }

    public void decraseQuantity(View view) {
        TextView count_quantity = findViewById(R.id.count_quantity);
        quantity = quantity - 1;
        if (quantity < 0) {
            quantity = 0;
        }
        count_quantity.setText("" + quantity);
    }
}