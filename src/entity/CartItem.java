package entity;

public class CartItem {

    //----------------------Fields ---------------------------------------------------------------------

    // 2 adet private field tanimlayin, Item cinsinden bir item ve int cinsinden bir quantity...
    // Item ayri bir sinif olarak tanimlanmistir.. Ilgili siniftaki odevlerinizi tamamlayin...
    private Item item;
    private int quantity;






    //----------------------Constructor ---------------------------------------------------------------------
    // Constructorda tum degiskenlerinizi initilize edin...

    public CartItem(Item item, int quantity) {
        setItem(item);
        setQuantity(quantity);
    }


    //----------------------Getter and Setter ---------------------------------------------------------------------


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
