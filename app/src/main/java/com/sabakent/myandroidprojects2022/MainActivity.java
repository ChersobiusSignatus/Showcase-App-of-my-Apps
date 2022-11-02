package com.sabakent.myandroidprojects2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "'Hello word' type beat app", R.drawable.getting_started),
                new Project("Coder Quotes", "Quotes for coders", R.drawable.quote),
                new Project("BMI Calculator", "Simplistic BMI calculator where I did learn about Variables, Methods and Conditional Logic", R.drawable.tape),
                new Project("Inches Convertor", "Simple inches convertor so I could understand my american friends", R.drawable.calculator),
                new Project("Tami", "Fictional restaurant menu wannabe app (Also did learn about Activities, Classes, Objects, Arrays, Intents and ListView)", R.drawable.hungry_developer)


        };
        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);


    }
}