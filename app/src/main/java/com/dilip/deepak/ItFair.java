package com.dilip.deepak;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dilip.deepak.ApiInterface.ApiInterface;
import com.dilip.deepak.ApiMenager.ApiClient;
import com.dilip.deepak.ApiResponse.ItFairResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ItFair extends Fragment {

    View v;
    RecyclerView itfair_Recycler;
    ApiInterface apiInterface;
    ItFairAdapter itFairAdapter;
    List<ItFairResponse.User> fairResponses;
    LinearLayoutManager manager;



    public ItFair() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_it_fair, container, false);
        itfair_Recycler=v.findViewById(R.id.itfair_Recycler);
        itfair_Recycler.setHasFixedSize(true);

      
        setRecyclerView();
        return v;

    }

    private void setRecyclerView() {
        ApiInterface apiInterface=ApiClient.createSrevice(ApiInterface.class,"");
        Call<ItFairResponse> responseCall=apiInterface.itresponse("it_fair1");
        responseCall.enqueue(new Callback<ItFairResponse>() {
            @Override
            public void onResponse(Call<ItFairResponse> call, Response<ItFairResponse> response) {
                if(response.code()==200)
                {
                    fairResponses=response.body().getUsers();
                    manager=new LinearLayoutManager(getActivity());
                    itfair_Recycler.setLayoutManager(manager);
                    itFairAdapter=new ItFairAdapter(getActivity(), (ArrayList<ItFairResponse.User>) fairResponses);
                    itfair_Recycler.setAdapter(itFairAdapter);
                }
            }

            @Override
            public void onFailure(Call<ItFairResponse> call, Throwable t) {

            }
        });
    }

}
