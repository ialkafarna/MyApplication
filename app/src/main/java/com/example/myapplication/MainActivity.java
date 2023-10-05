package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
ArrayList<Prdetr> prdetrs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String name=   binding.editTextTextPersonName.getText().toString();
             String clau=   binding.editTextTextPersoncAtgatgory.getText().toString();
             double price= Double.parseDouble(binding.editTextTextPersonPrict.getText().toString());
             prdetrs.add(new Prdetr(name,clau,price));
            }
        });
        binding.buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,RecyclerView.class);
                startActivity(intent);
            }
        });

    }
}