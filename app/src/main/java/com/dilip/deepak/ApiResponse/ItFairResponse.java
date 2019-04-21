package com.dilip.deepak.ApiResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItFairResponse {

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

        @SerializedName("i_id")
        @Expose
        private String iId;
        @SerializedName("i_image")
        @Expose
        private String iImage;
        @SerializedName("i_day")
        @Expose
        private String iDay;
        @SerializedName("i_time")
        @Expose
        private String iTime;
        @SerializedName("i_venue")
        @Expose
        private String iVenue;
        @SerializedName("i_date")
        @Expose
        private String iDate;
        @SerializedName("i_description")
        @Expose
        private String iDescription;

        public String getIId() {
            return iId;
        }

        public void setIId(String iId) {
            this.iId = iId;
        }

        public String getIImage() {
            return iImage;
        }

        public void setIImage(String iImage) {
            this.iImage = iImage;
        }

        public String getIDay() {
            return iDay;
        }

        public void setIDay(String iDay) {
            this.iDay = iDay;
        }

        public String getITime() {
            return iTime;
        }

        public void setITime(String iTime) {
            this.iTime = iTime;
        }

        public String getIVenue() {
            return iVenue;
        }

        public void setIVenue(String iVenue) {
            this.iVenue = iVenue;
        }

        public String getIDate() {
            return iDate;
        }

        public void setIDate(String iDate) {
            this.iDate = iDate;
        }

        public String getIDescription() {
            return iDescription;
        }

        public void setIDescription(String iDescription) {
            this.iDescription = iDescription;
        }

    }

}


