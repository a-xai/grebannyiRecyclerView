package com.example.grebannyirecyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    MainAdapter adapter;
    Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        adapter = new MainAdapter();
        btnAdd = findViewById(R.id.btn_add);
        recyclerView.setAdapter(adapter);



        Intent intent = getIntent();


        if ( intent.getExtras() != null){
            String a = intent.getStringExtra("1");
            String b = intent.getStringExtra("2");
            Storage.shared.list.add(new ItemModel(a, b));
            adapter.notifyDataSetChanged();
        }

        btnAdd.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent2);
            Log.e("TAG", "2");
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String a = data.getStringExtra("1");
        String b = data.getStringExtra("2");
    }
}