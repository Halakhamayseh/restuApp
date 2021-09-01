package com.example.restuapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//create database
@Database(entities = {Resturant.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ResDao resDao();
}
