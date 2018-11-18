
package com.campos.saally.visitkc;

import java.util.ArrayList;
import java.util.List;

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
    private List<String> tags = new ArrayList<String>();
    private int MainImage;
    private List<Integer> images = new ArrayList<Integer>();

    public Activity (String name, String address, String phone_number, String website, String price, String price_range, String description) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.website = website;
        this.price = price;
        this.price_range = price_range;
        this.description = description;
    }
    public List<String> getTags(){ return tags;} //returns a list of tags
    public void addTag(List<String> newTag) {
        for (int i = 0; i < newTag.size(); i++) {
            if (tags.contains(newTag.get(i)) == false) //if tag does not exist in the list
                tags.add(newTag.get(i)); //tag doesn't exit so add it
        }
    }

    public List<Integer> getImages() {return images;}
    public void addImage(List<Integer> newImage) {
        for (int i=0; i<newImage.size(); i++){
            if (images.contains(newImage.get(i))==false)
                images.add(newImage.get(i));
        }
    }

    public int getImage(){return MainImage;}
    public void setImage(int i) {this.MainImage = i;}

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
