package com.example.android3lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.android3lesson1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CountersContracts.CounterView {

    ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = new CounterPresenter();
        presenter.attachView(this);
        initListenner();
    }

    private void initListenner() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
                presenter.change();
            }
        });

        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrease();
                presenter.change();
            }
        });

    }

    @Override
    public void updateCounter(int count) {
        binding.numberTv.setText(String.valueOf(count));

    }

    @Override
    public void greenText() {
        binding.numberTv.setTextColor(Color.parseColor("#07E510"));


    }
}