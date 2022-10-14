package entity;

import enums.Color;

public class Item {

    //----------------------Fields ---------------------------------------------------------------------
    // 4 adet private field tanimlayin - int cinsinden id, String cinsinden name, Color cinsinden color, double cinsinden price
    // Color sinifi bir ENUM olarak tanimlandigindan ilgili sinifdaki odevlerinizi kontrol edin...
    private int id;
    private String name;
    private Color color;
    private double price;




    //---------------------- Constructor ---------------------------------------------------------------------
    // Tum degiskenleri constructorda initilize edin...

    public Item(int id, String name, Color color, double price) {

        setId(id);
        setName(name);
        setColor(color);
        setPrice(price);
    }


    //----------------------Getter and Setter ---------------------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //---------------------- ToString ---------------------------------------------------------------------


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
