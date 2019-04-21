package com.dilip.deepak;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dilip.deepak.ApiResponse.ItFairResponse;
import com.dilip.deepak.SessionManager.SessionManager;

import java.util.ArrayList;

public class ItFairAdapter extends RecyclerView.Adapter<ItFairAdapter.MyViewHolder> {

    Context context;
    ArrayList<ItFairResponse.User> response;

    SessionManager sessionManager;


    public ItFairAdapter(Context context, ArrayList<ItFairResponse.User>response) {
        this.context = context;
        this.response = response;

    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Recycler_Tv_Day1;
        TextView Recycler_Tv_Time1;
        TextView Recycler_Tv_Venue1;
        TextView Recycler_Tv_Date1;
        TextView Recycler_Tv_Description1;


        public MyViewHolder(View view) {
            super(view);
            Recycler_Tv_Day1=itemView.findViewById(R.id.Recycler_Tv_Day1);
            Recycler_Tv_Time1=itemView.findViewById(R.id.Recycler_Tv_Time1);
            Recycler_Tv_Venue1=itemView.findViewById(R.id.Recycler_Tv_Venue1);
            Recycler_Tv_Date1=itemView.findViewById(R.id.Recycler_Tv_Date1);
            Recycler_Tv_Description1=itemView.findViewById(R.id.Recycler_Tv_Description1);
        }
    }
   /*     @NonNull
    @Override
    public ItFairAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view=layoutInflater.inflate(R.layout.recycler_list,parent,false);

           return new ;
    }*/




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycler_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Recycler_Tv_Day1.setText(response.get(position).getIDay());
        holder.Recycler_Tv_Time1.setText(response.get(position).getITime());
        holder.Recycler_Tv_Venue1.setText(response.get(position).getIVenue());
        holder.Recycler_Tv_Date1.setText(response.get(position).getIDate());
        holder.Recycler_Tv_Description1.setText(response.get(position).getIDescription());
    }

    @Override
    public int getItemCount() {
        return response.size();

    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {


        public ItemViewHolder(View itemView) {
            super(itemView);


        }
    }
}
