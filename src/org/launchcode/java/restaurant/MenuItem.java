package org.launchcode.java.restaurant;

import java.util.ArrayList;

public class MenuItem {

    private float price;
    private String description;
    private ArrayList category;
    private boolean newItem;

    public MenuItem (float price, String description, ArrayList category, boolean newItem){
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }

    public ArrayList getCategory (){
        return category;
    }

    public void setCategory(ArrayList category){
        this.category = category;
    }

    public boolean getNewItem(){
        return newItem;
    }

    public void setNewItem(boolean newItem){
        this.newItem = newItem;
    }

}
