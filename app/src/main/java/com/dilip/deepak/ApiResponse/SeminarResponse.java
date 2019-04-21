package com.dilip.deepak.ApiResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeminarResponse {


    @SerializedName("users")
    @Expose
    private List<User> users = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


public class User {

    @SerializedName("s_id")
    @Expose
    private String sId;
    @SerializedName("s_image")
    @Expose
    private String sImage;
    @SerializedName("s_day")
    @Expose
    private String sDay;
    @SerializedName("s_time")
    @Expose
    private String sTime;
    @SerializedName("s_venue")
    @Expose
    private String sVenue;
    @SerializedName("s_date")
    @Expose
    private String sDate;
    @SerializedName("s_description")
    @Expose
    private String sDescription;

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getSImage() {
        return sImage;
    }

    public void setSImage(String sImage) {
        this.sImage = sImage;
    }

    public String getSDay() {
        return sDay;
    }

    public void setSDay(String sDay) {
        this.sDay = sDay;
    }

    public String getSTime() {
        return sTime;
    }

    public void setSTime(String sTime) {
        this.sTime = sTime;
    }

    public String getSVenue() {
        return sVenue;
    }

    public void setSVenue(String sVenue) {
        this.sVenue = sVenue;
    }

    public String getSDate() {
        return sDate;
    }

    public void setSDate(String sDate) {
        this.sDate = sDate;
    }

    public String getSDescription() {
        return sDescription;
    }

    public void setSDescription(String sDescription) {
        this.sDescription = sDescription;
    }

}


}
