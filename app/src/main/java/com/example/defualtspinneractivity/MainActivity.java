package com.example.defualtspinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.defualtspinneractivity.databinding.ActivityMainBinding;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    String[]  courses = { "C", "Data structures", "Interview prep", "Algorithms", "DSA with java", "OS" };

    String[]   coursesArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initView();
    }

    private void initView() {

        binding.txtSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter spinner = new ArrayAdapter(this, R.layout.custome_spinner_activity,R.id.CustomSpinner,courses);

        binding.txtSpinner.setAdapter(spinner);


    }
}