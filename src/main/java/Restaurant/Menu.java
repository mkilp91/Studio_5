package Restaurant;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

import static jdk.nashorn.internal.objects.NativeDate.getDate;
import static jdk.nashorn.internal.objects.NativeDate.toDateString;

public class Menu {
    public static ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date date;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setFullMenu(ArrayList<MenuItem> fullMenu) {
        this.menuItems = fullMenu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        menuItems.add(aMenuItem);
        this.date = new Date();

    }

    public void removeMenuItem(MenuItem aMenuItem) {
        int menuItemIndex = menuItems.indexOf(aMenuItem);
        menuItems.remove(menuItemIndex);
        this.date = new Date();
    }

    public void printMenuItems() {
        for (MenuItem menuItem: menuItems){
//            System.out.println("*****");
//            System.out.println("Name: " + menuItem.getName());
//            System.out.println("Price: $" + menuItem.getPrice());
//            System.out.println("Category: " + menuItem.getCategory());
//            System.out.println("Description: " + menuItem.getDescription());
//            System.out.println("Date: " + menuItem.getDate());
//            System.out.println("*****\n");
//            menuItem.toString();
            System.out.println("The Gag Reflex Menu");
            System.out.println("\nAppetizers\n");
//            for (MenuItem item: menuItems) {
            if (menuItem.getCategory().equals("Appetizer")){
                System.out.println(menuItem);
            }
            System.out.println("\nEntrees\n");
            if (menuItem.getCategory().equals("Entree")){
                System.out.println(menuItem);
            }
        }

//        @Override
//        public String toString() {
//            System.out.println("The Gag Reflex Menu");
//            System.out.println("\nAppetizers\n");
//            for (MenuItem item: menuItems) {
//                if (item.getCategory().equals("appetizer")){
//                    System.out.println(item);
//                }


    }



}
