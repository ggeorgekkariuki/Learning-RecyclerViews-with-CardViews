package com.example.learningrecyclerviewandgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    //    The data
    List<String> titles;
    List<Integer> images;
    //    The Context
    Context mContext;
//    This Layout Inflater binds the custom_grid_layout for individual items
    LayoutInflater mLayoutInflater;
    public Adapter(List<String> titles, List<Integer> images) {
        this.titles = titles;
        this.images = images;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        This method creates a new ViewHolder
        View view = mLayoutInflater.inflate(R.layout.custom_grid_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        It holds the views of one item
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
