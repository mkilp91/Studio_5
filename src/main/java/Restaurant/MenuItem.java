package Restaurant;

import java.util.Date;

public class MenuItem {

    private double price;
    private String name;
    private String description;
    private String category;
//    private Boolean isNew = true;
    private Boolean isVisible;
    private Date dateAdded;

    public Date getDate() {
        return dateAdded;
    }

    public void setDate(Date date) {
        this.dateAdded = date;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public Boolean getNew() {
//        return isNew;
//    }

//    public void setNew(Boolean aNew) {
//        isNew = aNew;
//    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    public MenuItem(double price, String name, String description, String category) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
    }


//    public MenuItem(double price, String name, String description, String category, Boolean isNew, Boolean isVisible, Date date) {
//        this.price = price;
//        this.name = name;
//        this.description = description;
//        this.category = category;
//        this.isNew = isNew;
//        this.isVisible = isVisible;
//        this.date = date;
//    }
//    public MenuItem(double price, String name, String description, String category){
//        this(price, name, description, category);
//        this.isNew=true;
//        this.isVisible=true;
//    }


}
