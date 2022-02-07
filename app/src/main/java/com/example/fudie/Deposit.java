package com.example.fudie;

public class Deposit {

    private String profile_img_url; //
    private String profile_name;     //
    private String profile_status;   //
    private String pdf_url;   //

    public Deposit(String profile_img_url, String profile_name, String profile_status, String pdf_url) {
        this.profile_img_url = profile_img_url;
        this.profile_name = profile_name;
        this.profile_status = profile_status;
        this.pdf_url = pdf_url;
    }

    public Deposit() {
    }

    public String getProfile_img_url() {
        return profile_img_url;
    }

    public void setProfile_img_url(String profile_img_url) {
        this.profile_img_url = profile_img_url;
    }

    public String getProfile_name() {
        return profile_name;
    }

    public void setProfile_name(String profile_name) {
        this.profile_name = profile_name;
    }

    public String getProfile_status() {
        return profile_status;
    }

    public void setProfile_status(String profile_status) {
        this.profile_status = profile_status;
    }

    public String getPdf_url() {
        return pdf_url;
    }

    public void setPdf_url(String pdf_url) {
        this.pdf_url = pdf_url;
    }
}

