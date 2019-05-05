package com.example.databindexample;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databindexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MyViewModel viewM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewM = new MyViewModel();
        ActivityMainBinding myBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myBinding.setLifecycleOwner(this);
        myBinding.setViewmodel(viewM);
    }
}
