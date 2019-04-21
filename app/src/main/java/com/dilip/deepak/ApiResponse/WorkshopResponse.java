package com.dilip.deepak.ApiResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkshopResponse {

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

        @SerializedName("w_id")
        @Expose
        private String wId;
        @SerializedName("w_image")
        @Expose
        private String wImage;
        @SerializedName("w_day")
        @Expose
        private String wDay;
        @SerializedName("w_time")
        @Expose
        private String wTime;
        @SerializedName("w_venue")
        @Expose
        private String wVenue;
        @SerializedName("w_date")
        @Expose
        private String wDate;
        @SerializedName("w_description")
        @Expose
        private String wDescription;

        public String getWId() {
            return wId;
        }

        public void setWId(String wId) {
            this.wId = wId;
        }

        public String getWImage() {
            return wImage;
        }

        public void setWImage(String wImage) {
            this.wImage = wImage;
        }

        public String getWDay() {
            return wDay;
        }

        public void setWDay(String wDay) {
            this.wDay = wDay;
        }

        public String getWTime() {
            return wTime;
        }

        public void setWTime(String wTime) {
            this.wTime = wTime;
        }

        public String getWVenue() {
            return wVenue;
        }

        public void setWVenue(String wVenue) {
            this.wVenue = wVenue;
        }

        public String getWDate() {
            return wDate;
        }

        public void setWDate(String wDate) {
            this.wDate = wDate;
        }

        public String getWDescription() {
            return wDescription;
        }

        public void setWDescription(String wDescription) {
            this.wDescription = wDescription;
        }

    }

}



