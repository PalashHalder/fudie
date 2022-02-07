package com.example.fudie;

public class LoanProducts {
    private String loanproduct;
    private String serial;
    private String lservice;
    private int image;

    public LoanProducts() {
    }

    public LoanProducts(String loanproduct, String serial, String lservice, int image) {
        this.loanproduct = loanproduct;
        this.serial = serial;
        this.lservice = lservice;
        this.image = image;
    }

    public String getLoanproduct() {
        return loanproduct;
    }

    public void setLoanproduct(String loanproduct) {
        this.loanproduct = loanproduct;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getLservice() {
        return lservice;
    }

    public void setLservice(String lservice) {
        this.lservice = lservice;
    }



    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {return image;}
}
