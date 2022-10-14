package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    //----------------------Fields-------------------------------------------------------------------------
    // Alisveris sepetinde, sepete eklenen urunleri CartItem sinifi cinsinden "items" isimli bir List de tutacagiz...
    // Sepete birden fazla CartItem eklenebileceginden instance degiskeninizi List seklende tanimlayiniz...
    // Ayrica sepetteki CartItem larin toplam fiyatini double cinsinden totalCartCost degiskeninde tutacagiz...tanimlayiniz..
    List<CartItem>items=new ArrayList<>();
    double totalCartCost=0;





    //----------------------Constructor---------------------------------------------------------------------
    // Alisveris sepeti olusturulurken herhangi bir degiskeni initilize etmemize gerek yoktur...


    public Cart() {
        setItems(items);
        setTotalCartcost(totalCartCost);
    }

    public Cart(List<CartItem> items, double totalCartCost) {
        this.items = items;
        this.totalCartCost = totalCartCost;
    }

    //----------------------Instance Methods----------------------------------------------------------------
    // Return tipi void olan addToCart(CartItem item) methodu tanimlayin...
    // Bu method cagirildiginda, parametre olarak aldigi CartItem'i yukarida tanimlanan "items" List ine eklesin...
    // Ayni urun daha once eklenmis ise bu urunun sadece miktarini guncellemeniz gerekmektedir...
    // Sepete yeni urun eklenmesi veya mevcut bir urunun miktarinin arttirilmasi "totalCartCost" toplam fiyati degistirecektir...
    public void addToCart(CartItem item){
        for (CartItem product : items){
            if (product.getItem().getName().equals(item.getItem().getName())){
                product.setQuantity(item.getQuantity()+ product.getQuantity());

               // item.setQuantity(product.getQuantity()+item.getQuantity());
                calculateTotalCartCost();
                return;

            }
        }
            items.add(item);
            //item.setQuantity(item.getQuantity());
            calculateTotalCartCost();

    }


    // Return tipi void olan calculateTotalCartCost() methodu tanimlayin...
    // Bu method cagirildiginda, sepete eklenen tum urunlerin adet bilgilerine gore toplam sepet fiyatini "totalCartCost" hesaplasin...
    // Instance degisken olarak tanimladigimiz "totalCartCost" degiskenini guncelleyeceksiniz...
    // addToCart() methodu icerisinde bu methodu cagirmalisiniz ki her urun eklendiginde veya miktar degistiginde toplam fiyat guncellensin...
    public void calculateTotalCartCost(){
        //setTotalCartcost(0);
        for (CartItem product: items){
           totalCartCost+= product.getQuantity()*product.getItem().getPrice();
            //setTotalCartcost(product.getQuantity()*product.getItem().getPrice());
        }

    }



    // Return tipi void olan emptyCart() isimli bir method tanimlayin...
    // Bu method cagirildiginda, "items" olarak tanimladiginiz List icerindeki -sepetinizdeki- urunleri silsin-temizlesin-bosaltsin...

    public void emptyCart(){
        items.clear();
    }



    //----------------------Getter and Setter ---------------------------------------------------------------------

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public double getTotalCartCost() {
        return totalCartCost;
    }

    public void setTotalCartcost(double totalCartcost) {
        this.totalCartCost = totalCartcost;
    }
}
