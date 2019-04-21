package com.dilip.deepak.ApiInterface;

import com.dilip.deepak.ApiResponse.ItFairResponse;
import com.dilip.deepak.ApiResponse.SeminarResponse;
import com.dilip.deepak.ApiResponse.WorkshopResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    //Workshop
    @FormUrlEncoded
    @POST("workshop.php")
    Call<WorkshopResponse>Wresponse(
            @Field("keyworkshop1")String tag

    );
    //ItFairResponse
    @FormUrlEncoded
    @POST("itfair.php")
    Call<ItFairResponse>itresponse(
            @Field("it_fair1")String tag

    );


    //Seminar
    @FormUrlEncoded
    @POST("seminar.php")
    Call<SeminarResponse>sresponse(
            @Field("keyseminar1")String tag

    );

}
