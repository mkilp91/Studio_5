package Restaurant;



public class Restaurant {

    public static void main(String[] args){
        Menu menu = new Menu();

        MenuItem testFood = new MenuItem(4.99, "Jalapeno Poppers", "Spicy pop stars", "Appetizer");
        MenuItem testFood2 = new MenuItem(4.98, "Cheese Sticks", "Get ready to choke", "Appetizer");
        MenuItem testFood3 = new MenuItem(4.97, "Zaaaaa", "Goodbye Tastebuds", "Entree");

        menu.addMenuItem(testFood);
        menu.addMenuItem(testFood2);
        menu.addMenuItem(testFood3);
        menu.printMenuItems();
        System.out.println(testFood.toString());

        System.out.println(menu.getMenuItems().size());
    }
}
