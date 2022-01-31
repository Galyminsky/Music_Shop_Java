package com.jobforandroid.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void increaseQuantity (View view) {
        TextView count_quantity = findViewById(R.id.count_quantity);
        count_quantity.setText("1");

    }
}