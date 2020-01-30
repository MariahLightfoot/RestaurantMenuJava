package org.launchcode.java.restaurant;

import java.util.Date;

public class Menu {
    private Date lastUpdate;
    private MenuItem newMenuItem;

    public Menu (Date lastUpdate, MenuItem newMenuItem){
        this.lastUpdate = lastUpdate;
        this.newMenuItem = newMenuItem;
    }

    public Date getLastUpdate(){
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public MenuItem getNewMenuItem(){
        return newMenuItem;
    }

    public void setNewMenuItem (MenuItem newMenuItem){
        this.newMenuItem = newMenuItem;
    }
}
