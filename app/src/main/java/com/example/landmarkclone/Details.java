package com.example.landmarkclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.landmarkclone.databinding.ActivityDetailsBinding;

public class Details extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent=getIntent();
        LandMark selected=(LandMark) intent.getSerializableExtra("Lands");
        binding.Country.setText(selected.country);
        binding.Text1.setText(selected.name);
        binding.CountryView.setImageResource(selected.image);
    }
}