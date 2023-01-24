package Restaurant;

import java.util.ArrayList;
import java.util.Date;

import static jdk.nashorn.internal.objects.NativeDate.getDate;
import static jdk.nashorn.internal.objects.NativeDate.toDateString;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
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
    }

    public void removeMenuItem(MenuItem aMenuItem) {


    }

}
