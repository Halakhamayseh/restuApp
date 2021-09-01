package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button backToHome=findViewById(R.id.backHomeButtonId);

        // add event listener on add button to back to home activity using intent
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToHomeActivity=new Intent(Menu.this,MainActivity.class);
                startActivity(backToHomeActivity);
            }
        });
        RecyclerView allView=findViewById(R.id.recyclerViewidmenu);
        allView.setLayoutManager(new LinearLayoutManager(this));
        //Database
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
        AppDatabase.class, "resDatabase").allowMainThreadQueries().build();
        List<Resturant> alllist=db.resDao().getAll();
        allView.setAdapter(new ResAdaptter(alllist));
    }
}