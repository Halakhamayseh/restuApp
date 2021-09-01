package com.example.restuapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//1. create model entity

@Entity
public class Resturant {
    //2. create PrimaryKey
    @PrimaryKey(autoGenerate = true)
    public int resturantId;

    //2. create Column In side Table

    @ColumnInfo(name = "resName")
    public String resName;

    @ColumnInfo(name = "resPrice")
    public String resPrice;

    @ColumnInfo(name = "resIngredients")
    public String resIngredients;

    //3. create constructor
    public Resturant(String resName, String resPrice, String resIngredients) {
        this.resName = resName;
        this.resPrice = resPrice;
        this.resIngredients = resIngredients;
    }
}
