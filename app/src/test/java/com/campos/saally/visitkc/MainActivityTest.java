package com.campos.saally.visitkc;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void filterActivities() {
        Activity a1 = new Activity("n", "a", "pn", "w", "p", "pr", "d");
        a1.addTag(Arrays.asList("2", "4", "6", "8"));
        Activity a2 = new Activity("na", "ad", "phn", "we", "pr", "pri", "de");
        a2.addTag(Arrays.asList("3", "6", "9", "12"));
        Activity a3 = new Activity("na", "ad", "phn", "we", "pr", "pri", "de");
        a3.addTag(Arrays.asList("4", "8", "2", "12"));
        ArrayList<Activity> a = new ArrayList<>(); //Create activity list
        a.add(a1);
        a.add(a2);
        a.add(a3);

        FilterItem f1 = new FilterItem("2", 0);
        FilterItem f2 = new FilterItem("4", 0);
        ArrayList<FilterItem> f = new ArrayList<>(); //create filter list
        f.add(f1);
        f.add(f2);

        ArrayList<Activity> expected = new ArrayList<>(); //expected return value
        expected.add(a1);
        expected.add(a3);
        ArrayList<Activity> actual = FilterActivities(f, a); //actual value when calling function

        assertEquals(expected, actual);

    }

    public ArrayList<com.campos.saally.visitkc.Activity> FilterActivities (ArrayList<FilterItem> filters, ArrayList<com.campos.saally.visitkc.Activity> TheActivities){

        return TheActivities;
    }
}