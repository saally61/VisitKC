package com.campos.saally.visitkc;


public class FilterItem {
   String filterName;
   int filterSwitch;

    public FilterItem(String filterName, int filterSwitch) {
        this.filterName = filterName;
        this.filterSwitch = filterSwitch;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public int getFilterSwitch() {
        return filterSwitch;
    }

    public void setFilterSwitch(int filterSwitch) {
        this.filterSwitch = filterSwitch;
    }




}
