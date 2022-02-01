package com.jobforandroid.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    Spinner spinner;
    ArrayList spinnerArrayList;
    ArrayAdapter spinnerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.main_spinner);

        spinnerArrayList = new ArrayList();
        spinnerArrayList.add("Guitar");
        spinnerArrayList.add("Skripka");
        spinnerArrayList.add("Baraban");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArrayList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(spinnerAdapter);


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