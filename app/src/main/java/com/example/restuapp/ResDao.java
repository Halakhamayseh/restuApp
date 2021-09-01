package com.example.restuapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
//1.create dao interface
public interface ResDao {

    //2. select all from table
    @Query("SELECT * FROM resturant")
    List<Resturant>getAll();

    @Insert
    void insertAll(Resturant... resturants);

    @Delete
    void delete(Resturant resturant);

}
