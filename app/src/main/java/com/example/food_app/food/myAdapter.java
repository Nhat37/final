package com.example.food_app.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_app.R;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    Context context;
    List<Model> items;


    public myAdapter(Context context, List<Model> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(context).inflate(R.layout.item_food, parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.price.setText(items.get(position).getPrice());
        holder.imgFood.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
