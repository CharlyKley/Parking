package com.example.park

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    ActiviryMainBinding binding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding=ActiviryMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.parquearboton.setOnClickListener(new View.OnClickListener())
        {
        public void onClick(View view){
            startActivity(new Intent(view.getContext(),ParquearCarroActivity.class));
        }
        }
    }
}