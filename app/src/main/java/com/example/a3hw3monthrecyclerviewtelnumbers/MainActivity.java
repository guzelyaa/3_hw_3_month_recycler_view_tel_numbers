package com.example.a3hw3monthrecyclerviewtelnumbers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        numbers.add("0 500 500 500");
        numbers.add("0 678 567 456");
        numbers.add("0 293 484 629");
        numbers.add("0 593 629 648");
        numbers.add("0 969 266 395");
        numbers.add("0 165 026 498");
        numbers.add("0 608 037 284");
        numbers.add("0 173 957 396");
        numbers.add("0 383 937 385");
        numbers.add("0 173 960 735");
        NumberAdapter numberAdapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(numberAdapter);
    }
}