package org.launchcode.java.restaurant;

//look up how to actually use local date
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String lastUpdate;
    private ArrayList<MenuItem> itemsInMenu;

    public Menu(String lastUpdate, ArrayList<MenuItem> itemsInMenu) {
        this.lastUpdate = lastUpdate;
        this.itemsInMenu = itemsInMenu;
    }

    public Menu (){

    }

    //getters and setters
    public String getLastUpdate(){

        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate){

        this.lastUpdate = lastUpdate;
    }

    public ArrayList<MenuItem> getItemsInMenu(){

        return itemsInMenu;
    }

    public void setgetItemsInMenu (ArrayList<MenuItem> itemsInMenu){

        this.itemsInMenu = itemsInMenu;
    }

    //instance methods
    public void addItemToMenu (){

        //initializing new instance of menuItem class
        MenuItem newItem = new MenuItem();

        Scanner itemDescription = new Scanner(System.in);
        System.out.println("What is the name of the new menu item?");
        String userSelectedItemDescription = itemDescription.nextLine();

        newItem.setDescription(userSelectedItemDescription);


        Scanner itemPrice = new Scanner(System.in);
        System.out.println("What is the price?");
        Double userSelectedItemPrice = itemPrice.nextDouble();

        newItem.setPrice(userSelectedItemPrice);


        Scanner itemCategory = new Scanner(System.in);
        System.out.println("What category does the it belong to?");
        String userSelectedCategory = itemCategory.nextLine();

        newItem.setCategory(userSelectedCategory);


        newItem.setNewItem(true);
    }

//    public void removeMenuItemFromMenu (MenuItem menuItemToRemove){
//        for(item : menuItemsInMenu){
//            if()
//        }
    //}
}
