package com.grabfood.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grabfood.R;
import com.grabfood.adapters.FeaturedAdapter;
import com.grabfood.adapters.FeaturedVerAdapter;
import com.grabfood.models.FeaturedModel;
import com.grabfood.models.FeaturedVerModel;

import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {


    /////////////////////Featured Hor Recyclerview
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;


    /////////////////////Featured Ver Recyclerview
    List<FeaturedVerModel> featuredVerModelsList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter  featuredVerAdapter;


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        /////////////////////Featured Hor Recyclerview
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.fav1,"Cereal","Cereal with fresh berries everyday"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav3,"Pasta","Freshly made paste for everyday"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav2,"Fastfood","Try new dish"));


        featuredAdapter = new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);


        /////////////////////Featured Ver Recyclerview
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelsList = new ArrayList<>();

        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1,"Cappucino","Made from high quality coffee beans", "4.8","10:00 - 23:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2,"Combo Bon Apetit","Toast with cup of tea ", "5.0","6:00 - 10:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3,"Berries splash toaster","French toast style serve with honny and berries ", "5.0","10:00 - 23:00"));
        //featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 1","Description1", "4.8","10:00 - 23:00"));
        //featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2,"Featured 2","Description2", "4.8","10:00 - 23:00"));
        //featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3,"Featured 3","Description3", "4.8","10:00 - 23:00"));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelsList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}