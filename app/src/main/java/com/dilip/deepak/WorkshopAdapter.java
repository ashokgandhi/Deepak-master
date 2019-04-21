package com.dilip.deepak;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dilip.deepak.ApiResponse.WorkshopResponse;
import java.util.ArrayList;

public class WorkshopAdapter extends RecyclerView.Adapter<WorkshopAdapter.MyViewHolder> {

    Context context;
    ArrayList<WorkshopResponse.User> responses;

    public WorkshopAdapter(Context context, ArrayList<WorkshopResponse.User> responses) {
        this.context = context;
        this.responses = responses;
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

    @NonNull
    @Override
    public WorkshopAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_list, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WorkshopAdapter.MyViewHolder holder, int position) {
        holder.Recycler_Tv_Day1.setText(responses.get(position).getWDate());
        holder.Recycler_Tv_Time1.setText(responses.get(position).getWTime());
        holder.Recycler_Tv_Venue1.setText(responses.get(position).getWVenue());
        holder.Recycler_Tv_Date1.setText(responses.get(position).getWDate());
        holder.Recycler_Tv_Description1.setText(responses.get(position).getWDescription());
    }

    @Override
    public int getItemCount() {
        return responses.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {


        public ItemViewHolder(View itemView) {
            super(itemView);


        }
    }
}