package com.example.pinview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.example.pinview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.pin1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count==1){
                    binding.pin2.requestFocus();
                }else {
                    binding.pin1.setHint("*");
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        binding.pin2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count>0){
                    binding.pin3.requestFocus();
                }else {
                    binding.pin1.requestFocus();
                    binding.pin2.setHint("*");
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.pin3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count>0){
                    binding.pin4.requestFocus();
                }else {
                    binding.pin2.requestFocus();
                    binding.pin3.setHint("*");
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.pin4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count>0){
                    binding.pin5.requestFocus();
                }else {
                    binding.pin3.requestFocus();
                    binding.pin4.setHint("*");
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.pin5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count>0){
                    binding.pin6.requestFocus();
                }else {
                    binding.pin4.requestFocus();
                    binding.pin5.setHint("*");
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.pin6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count==0){
                    binding.pin5.requestFocus();
                    binding.pin6.setHint("*");
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        }

}