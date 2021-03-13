package com.example.grebannyirecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {


    ArrayList<ItemModel> listFromIntent;
    Button btn;
    EditText name, number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.btn_back);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            String a = name.getText().toString();
            String b = number.getText().toString();
            intent.putExtra("1", a);
            intent.putExtra("2", b);
            startActivity(intent);

    });
    }
}