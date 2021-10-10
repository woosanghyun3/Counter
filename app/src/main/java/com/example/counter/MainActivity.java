package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> plusCount());
        binding.button2.setOnClickListener(v -> minusCount());

    }

    private void plusCount(){
        count++;
        binding.textView.setText(Integer.toString(count));
    }

    private void minusCount(){
        count--;
        if (count < 0){
            count = 0;
        }
        binding.textView.setText(Integer.toString(count));
    }

}