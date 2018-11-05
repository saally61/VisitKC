package com.campos.saally.visitkc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void addTag(){
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.addTag(Arrays.asList("1","2","1","3"));
        List<String> actual = Arrays.asList("1","2","3");
        assertEquals("1", actual.get(0));
        assertEquals("2", actual.get(1));
        assertEquals("3", actual.get(2));

    }
    @Test
    public void setName() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setName("name");

        assertEquals("name", a.getName());
    }


    @Test
    public void setAddress() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setAddress("address");

        assertEquals("address", a.getAddress());
    }


    @Test
    public void setPhone_number() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setPhone_number("phone number");

        assertEquals("phone number", a.getPhone_number());
    }

    @Test
    public void setWebsite() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setWebsite("website");

        assertEquals("website", a.getWebsite());
    }

    @Test
    public void setHours() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setHours("hours");

        assertEquals("hours", a.getHours());
    }

    @Test
    public void setPrice() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setPrice("price");

        assertEquals("price", a.getPrice());
    }

    @Test
    public void setPrice_range() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setPrice_range("price range");

        assertEquals("price range", a.getPrice_range());
    }

    @Test
    public void setDescription() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setDescription("description");

        assertEquals("description", a.getDescription());
    }

    @Test
    public void setEmail() {
        Activity a = new Activity("n","a","pn","w","p","pr","d");
        a.setEmail("email");

        assertEquals("email", a.getEmail());
    }
}