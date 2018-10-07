package com.campos.saally.visitkc;

public class Activity {
    private String name;
    private String address;
    private String phone_number;
    private String website;
    private String price;
    private String price_range;
    private String description;
    private String email; //optional
    private String hours; //optional


    public Activity (String name, String address, String phone_number, String website, String price, String price_range, String description) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.website = website;
        this.price = price;
        this.price_range = price_range;
        this.description = description;
    }

    public void setName(String name) {this.name = name;}
    public String getName(){return name;}

    public void setAddress (String address){this.address = address;}
    public String getAddress(){return address;}

    public void setPhone_number(String phone_number){this.phone_number = phone_number;}
    public String getPhone_number(){return phone_number;}

    public void setWebsite(String website){this.website =website;}
    public String getWebsite(){return website;}

    public void setHours(String hours){this.hours = hours;}
    public String getHours(){ return hours;}

    public void setPrice(String price){this.price = price;}
    public String getPrice(){return price;}

    public void setPrice_range(String price_range){this.price_range = price_range;}
    public String getPrice_range(){return price_range;}

    public void setDescription(String description){this.description = description;}
    public String getDescription(){return description;}

    public void setEmail(String email){this.email = email;}
    public String getEmail(){return email;}

}
