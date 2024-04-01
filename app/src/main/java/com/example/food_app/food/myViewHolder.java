package com.example.food_app.food;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_app.R;

public class myViewHolder  extends RecyclerView.ViewHolder {
    ImageView imgFood;
    TextView name;
    TextView price;
    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        imgFood = itemView.findViewById(R.id.imgfood);
        name = itemView.findViewById(R.id.name);
        price = itemView.findViewById(R.id.cart);
    }
}
