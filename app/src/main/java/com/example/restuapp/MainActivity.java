package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.get add button by id
        Button addButton=findViewById(R.id.addButtonIDHome);

        //2.get menu button by id
        Button menuButton=findViewById(R.id.menuIdHomePage);

        //3. add event listener on add button to move to add activity using intent
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToAddActivity=new Intent(MainActivity.this,AddDish.class);
                startActivity(moveToAddActivity);
            }
        });

        //4. add event listener on menu button to move to menu activity using intent
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToMenuActivity=new Intent(MainActivity.this,Menu.class);
                startActivity(moveToMenuActivity);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}