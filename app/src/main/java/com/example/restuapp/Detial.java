package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detial);
        Intent intent=getIntent();
          //get key input//

        String resName=intent.getExtras().getString("name");
        String resPrice=intent.getExtras().getString("price");
        String resIngredients=intent.getExtras().getString("Ingredients");

        //get element view by id
        TextView textViewName=findViewById(R.id.textViewNameDetailsPageId);
        TextView textViewprice=findViewById(R.id.textViewPriceDetailsPageId);
        TextView textViewIngredients=findViewById(R.id.textViewIngredientsDetailsPageId);

        //set element
        textViewName.setText("Name "+resName);
        textViewprice.setText("Price "+resPrice);
        textViewIngredients.setText("Ingredients " +resIngredients);
    }
}