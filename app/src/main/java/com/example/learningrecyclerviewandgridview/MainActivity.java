package com.example.learningrecyclerviewandgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    The variables
    RecyclerView mRecyclerView;
//    The data
    List<String> titles;
    List<Integer> images;

    String []places = {"The Beach", "The Cake", "The Fitness Centre", "The Hot Tub", "The Kitchen"
            ,"The Pool", "The Pregnant Woman", "The Room Service"};
    Integer[] id = {R.drawable.ic_beach_access_black_24dp, R.drawable.ic_cake_black_24dp
            ,R.drawable.ic_fitness_center_black_24dp, R.drawable.ic_hot_tub_black_24dp
            , R.drawable.ic_kitchen_black_24dp ,R.drawable.ic_pool_black_24dp,
            R.drawable.ic_pregnant_woman_black_24dp, R.drawable.ic_room_service_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Reference for the recycler view
        mRecyclerView = findViewById(R.id.dataList);

//        Populate the Lists for Titles
        titles = new ArrayList<>();
        for (String place:places){
            titles.add(place);
        }

//        Populate the Lists for Images
        images = new ArrayList<>();
        for (Integer i: id){
            images.add(i);
        }

//        Create a New Adapter from its constructor
        Adapter adapter = new Adapter(this, titles, images);

//        A layout manager for the GridLayout
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);

//        Set the layout Manager to the RecyclerView
        mRecyclerView.setLayoutManager(gridLayoutManager);

//        Set the RecyclerView to the RecyclerView
        mRecyclerView.setAdapter(adapter);
    }
}
