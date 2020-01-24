package org.launchcode.java.restaurant;

import java.util.Date;

public class Menu {
    private Date lastUpdate;

    public Menu (Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdate(){
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }
}
