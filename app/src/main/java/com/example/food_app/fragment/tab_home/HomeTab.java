package com.example.food_app.fragment.tab_home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_app.MainActivity;
import com.example.food_app.R;
import com.example.food_app.food.Model;
import com.example.food_app.food.myAdapter;
import com.example.food_app.scroll.TranslateAnimation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeTab extends Fragment {
    private View myView;
    private BottomNavigationView myBottomNavigation;
    private myAdapter adapter;
    private RecyclerView rcv;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.tab_home, container, false);
        return myView;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rcv = view.findViewById(R.id.rv1);
        List<Model> items = new ArrayList<Model>();

        items.add(new Model("Humberger", "80.000", R.drawable.humber));
        items.add(new Model("Bánh cuốn", "40.000", R.drawable.banh_cuon));
        items.add(new Model("Bánh bao", "0.000", R.drawable.banhbao));
        items.add(new Model("Cơm tấm", "80.000", R.drawable.comtam));
        items.add(new Model("Sườn xào", "80.000", R.drawable.suonxao));
        items.add(new Model("Phở cuốn", "80.000", R.drawable.phocuon));
        items.add(new Model("Cá kho", "80.000", R.drawable.ca_kho));

        adapter = new myAdapter(getContext(),items);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rcv.setLayoutManager(linearLayoutManager);
        rcv.setAdapter(adapter);

    }
}
