package com.dilip.deepak;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dilip.deepak.ApiInterface.ApiInterface;
import com.dilip.deepak.ApiMenager.ApiClient;
import com.dilip.deepak.ApiResponse.SeminarResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Seminar extends Fragment {

    View s;
    RecyclerView seminar_Recycler;
    ApiInterface apiInterface;
    List<SeminarResponse.User>seminarresponse;
    SeminarAdapter seminarAdapter;
    LinearLayoutManager smanager;


    public Seminar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        s = inflater.inflate(R.layout.fragment_seminar, container, false);
        seminar_Recycler = s.findViewById(R.id.seminar_Recycler);
        seminar_Recycler.setHasFixedSize(true);

        setRecyclerView();

        return  s;
    }

    private void setRecyclerView() {
        ApiInterface apiInterface = ApiClient.createSrevice(ApiInterface.class,"");
        Call<SeminarResponse>responseCall=apiInterface.sresponse("keyseminar1");
        responseCall.enqueue(new Callback<SeminarResponse>() {
            @Override
            public void onResponse(Call<SeminarResponse> call, Response<SeminarResponse> response) {
                if (response.code()==200){
                    seminarresponse = response.body().getUsers();
                    smanager= new LinearLayoutManager(getActivity());
                    seminar_Recycler.setLayoutManager(smanager);
                    seminarAdapter = new SeminarAdapter(getActivity(), (ArrayList<SeminarResponse.User>)seminarresponse);
                    seminar_Recycler.setAdapter(seminarAdapter);
                }
            }

            @Override
            public void onFailure(Call<SeminarResponse> call, Throwable t) {

            }
        });
    }
}
