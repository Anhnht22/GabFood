package com.grabfood.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.grabfood.R;
import com.grabfood.models.HomeHorModel;
import com.grabfood.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {


    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizon_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.fav1, "Salad", "10:10-23:00", "4.9", "Min - $34"));
            homeVerModels.add(new HomeVerModel(R.drawable.fav3, "Noodle", "10:10-23:00", "4.9", "Min - $34"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "10:10-23:00", "4.9", "Min - $34"));
            homeVerModels.add(new HomeVerModel(R.drawable.sweets, "Donut", "10:10-23:00", "4.9", "Min - $34"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if(position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.banhmi1,"Hawaii wave","02:10-01:00","5.0","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.banhmi2,"Forest breeze","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.banhmi3,"Octupus bellpepper","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.banhmi4,"Freshly Homemade","10:10-23:00","4.9","Min - $34"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Party time on stick","10:10-23:00","4.9","Min - $34"));
                        //homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Burger 2","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Triple extra","10:10-23:00","4.9","Min - $34"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }
                    else if (position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.phobo,"Pho Bo","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bunbohue,"Bun Bo Hue","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bunrieu,"Bun Rieu","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bundau,"Bun Dau","10:10-23:00","4.9","Min - $34"));
                        updateVerticalRec.callBack(position,homeVerModels);

                    }
                    else if (position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1,"Chocolate Ice cream","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2,"Cookies Ice cream","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3,"Vanilla Ice cream","10:10-23:00","4.9","Min - $34"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1,"Sunshine !","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2,"Fromages et Toma","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3,"Basic Ham Cheese","10:10-23:00","4.9","Min - $34"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4,"Full meals sandwich combo","10:10-23:00","4.9","Min - $34"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if(select){
                if(position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;

                }
            }
            else {
                if(row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }

        }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}