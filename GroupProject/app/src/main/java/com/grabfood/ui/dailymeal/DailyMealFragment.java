package com.grabfood.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.grabfood.R;
import com.grabfood.adapters.DailyMealAdapter;
import com.grabfood.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily_meal,container,false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% Off","Don't skip your meals","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","20% Off","Don't skip your meals","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","50% Off","Don't skip your meals","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Sweets","39% Off","Let's have tea time!","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffee","20% Off","Just have a cup of cofeee!","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();




        return root;

    }
}