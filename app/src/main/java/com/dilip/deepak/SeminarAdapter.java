package com.dilip.deepak;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dilip.deepak.ApiResponse.SeminarResponse;

import java.util.ArrayList;


public class SeminarAdapter extends RecyclerView.Adapter<SeminarAdapter.MyViewHolder> {

    Context context;
    ArrayList<SeminarResponse.User>semiresponse;

    public SeminarAdapter(Context context , ArrayList<SeminarResponse.User>semiresponse){
        this.context=context;
        this.semiresponse=semiresponse;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Recycler_Tv_Day1;
        TextView Recycler_Tv_Time1;
        TextView Recycler_Tv_Venue1;
        TextView Recycler_Tv_Date1;
        TextView Recycler_Tv_Description1;


        public MyViewHolder(View View) {
            super(View);

            Recycler_Tv_Day1=itemView.findViewById(R.id.Recycler_Tv_Day1);
            Recycler_Tv_Time1=itemView.findViewById(R.id.Recycler_Tv_Time1);
            Recycler_Tv_Venue1=itemView.findViewById(R.id.Recycler_Tv_Venue1);
            Recycler_Tv_Date1=itemView.findViewById(R.id.Recycler_Tv_Date1);
            Recycler_Tv_Description1=itemView.findViewById(R.id.Recycler_Tv_Description1);
        }
    }


    @NonNull
    @Override
    public SeminarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_list ,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeminarAdapter.MyViewHolder holder, int position) {
        holder.Recycler_Tv_Day1.setText(semiresponse.get(position).getSDay());
        holder.Recycler_Tv_Time1.setText(semiresponse.get(position).getSTime());
        holder.Recycler_Tv_Venue1.setText(semiresponse.get(position).getSVenue());
        holder.Recycler_Tv_Date1.setText(semiresponse.get(position).getSDate());
        holder.Recycler_Tv_Description1.setText(semiresponse.get(position).getSDescription());
    }

    @Override
    public int getItemCount() {
        return semiresponse.size();
    }
  /*  public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }*/
}
