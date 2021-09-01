package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dish);
        //get edit text resName by id
        EditText resName=findViewById(R.id.dishNameInputId);
        //get edit text resPrice by id
        EditText resPrice=findViewById(R.id.dishPriceInputId);
        //get edit text resIngredients by id
        EditText resIngredients=findViewById(R.id.ingredientsInputId);

        //get submitButton by id
        Button submit=findViewById(R.id.submitbuttonIdAddPage);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //assign the userinput to instanse of model
                Resturant resturant=new Resturant(resName.getText().toString(),resPrice.getText().toString(),resIngredients.getText().toString());

                AppDatabase db = Room.databaseBuilder(getApplicationContext(),

                        AppDatabase.class, "resDatabase").allowMainThreadQueries().build();


//                ResDao resDao=db.resDao();

                //insert database
                db.resDao().insertAll(resturant);
            }
        });

    }
}