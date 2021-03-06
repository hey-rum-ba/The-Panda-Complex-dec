package com.example.thepandacomplex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.thepandacomplex.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list =new ArrayList<>();
        list.add(new MainModel(R.drawable.ic_launcher_foreground , 56, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 55, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 54, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 53, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 52, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 51, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 50, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 59, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 58, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 57, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 577, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 5779, 60, 89, 56, "Madhu SK"));
        list.add(new MainModel(R.drawable.ic_launcher_foreground, 589, 60, 89, 56, "Madhu SK"));
        MainAdapter adapter = new MainAdapter(list,this);
        binding.renteesRecView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.renteesRecView.setLayoutManager(layoutManager);
    }


}