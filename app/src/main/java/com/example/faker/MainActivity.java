package com.example.faker;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.faker.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();//Remove Action Ba

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), homeActivity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable,4*1000);

    }
}