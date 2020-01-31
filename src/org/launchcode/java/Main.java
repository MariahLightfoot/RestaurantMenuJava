package org.launchcode.java;

import org.launchcode.java.restaurant.Menu;
import org.launchcode.java.restaurant.MenuItem;

public class Main {

    public static void main(String[] args) {

        MenuItem soup = new MenuItem(2.00, "Soup of the Day", "Appetizer", false);
        MenuItem salad = new MenuItem(3.00, "House Salad", "Appetizer", false);
        MenuItem steakDinner = new MenuItem(10.00, "Steak Dinner", "Main Course", false);
        MenuItem porkChopDinner = new MenuItem(12.00, "Pork Chop Dinner", "Main Course", false);
        MenuItem lemonPie = new MenuItem(5.00, "Lemon Pie", "Dessert", false);
        MenuItem chocolateMousse = new MenuItem(5.00, "Chocolate Mousse", "Dessert", true);

        Menu menuOne = new Menu();

        menuOne.addMenuItem(soup);

        menuOne.printMenu();

//        menuOne.addMenuItem(salad);
//        menuOne.addMenuItem(steakDinner);
//        menuOne.addMenuItem(porkChopDinner);
//        menuOne.addMenuItem(lemonPie);
//        menuOne.addMenuItem(chocolateMousse);

       // menuOne.printMenu();

//        Student sally = new Student("Sally",1,1,4.0);
//        System.out.println("The Student class works! " + sally.getName() + " is a student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);


    }
}
