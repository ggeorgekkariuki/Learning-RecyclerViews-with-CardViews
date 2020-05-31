package com.example.learningrecyclerviewandgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    public Adapter(Context context,List<String> titles, List<Integer> images) {
        this.titles = titles;
        this.images = images;
        mLayoutInflater = LayoutInflater.from(context);
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
//        This method binds the data by using the ViewHolder using the data stored at certain position
        holder.mTextView.setText(titles.get(position));
        holder.mImageView.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
//        The titles and images are placed in the same ViewHolder. We can count both as 1
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        It holds the views of one item which we can manipulate
        TextView mTextView;
        ImageView mImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.textView);
            mImageView = itemView.findViewById(R.id.image);
        }
    }
}
