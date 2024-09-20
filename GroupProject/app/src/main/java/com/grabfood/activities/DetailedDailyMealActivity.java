package com.grabfood.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.grabfood.R;
import com.grabfood.adapters.DetailedDailyAdapter;
import com.grabfood.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);


        if(type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Cereal with fruits","description","5.0","35000","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Burger","description","4.4","40000","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Creamy Pasta","description","4.4","35$","1am"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Breakfast","description","4.4","35$","10am"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bundaumet,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Breakfast","description","4.4","35$","10am"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.coffe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Breakfast","description","4.4","35$","10am"));
            dailyAdapter.notifyDataSetChanged();


        }

        if(type != null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Breakfast","description","4.4","35$","10am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Breakfast","description","4.4","35$","10am"));
            dailyAdapter.notifyDataSetChanged();


        }
    }
}