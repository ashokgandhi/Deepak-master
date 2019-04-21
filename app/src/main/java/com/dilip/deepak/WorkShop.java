package com.dilip.deepak;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.dilip.deepak.ApiInterface.ApiInterface;
import com.dilip.deepak.ApiMenager.ApiClient;
import com.dilip.deepak.ApiResponse.WorkshopResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class WorkShop extends Fragment  {

    View w;
    RecyclerView Workshop_Recycler;
    ApiInterface apiInterface;
    List<WorkshopResponse.User>workshopresponse;
    WorkshopAdapter workshopAdapter;
    LinearLayoutManager wmanager;


    public WorkShop() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        w= inflater.inflate(R.layout.fragment_work_shop,container,false);
        Workshop_Recycler=w.findViewById(R.id.Workshop_Recycler);
        Workshop_Recycler.setHasFixedSize(true);

        setRecyclerView();
        return  w;

    }

    private void setRecyclerView() {
        ApiInterface apiInterface= ApiClient.createSrevice(ApiInterface.class,"");
        Call<WorkshopResponse>responseCall=apiInterface.Wresponse("keyworkshop1");
        responseCall.enqueue(new Callback<WorkshopResponse>() {
            @Override
            public void onResponse(Call<WorkshopResponse> call, Response<WorkshopResponse> response) {
                if (response.code()==200){
                    workshopresponse=response.body().getUsers();
                    wmanager=new LinearLayoutManager(getActivity());
                    Workshop_Recycler.setLayoutManager(wmanager);
                    workshopAdapter=new WorkshopAdapter(getActivity(),(ArrayList<WorkshopResponse.User>)workshopresponse);
                    Workshop_Recycler.setAdapter(workshopAdapter);
                }
            }

            @Override
            public void onFailure(Call<WorkshopResponse> call, Throwable t) {

            }
        });
    }
}
