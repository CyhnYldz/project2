package entity;

public class User {

    //----------------------Fields ---------------------------------------------------------------------
    // 5 adet private degisken tanimlayin... String cinsinden firstName, lastName, userName, password.. Address cinsinden address
    // Address sinifi ayri bir sinif olarak tanimlanmistir... Address sinifindaki odevlerinizi yapiniz..
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Address address;



    //----------------------Constructor ---------------------------------------------------------------------
    // Tum degiskenleri constructor ile initilize ediniz...


    public User(String firstName, String lastName, String userName, String password, Address address) {

        setFirstName(firstName);
        setLastName(lastName);
        setUserName(userName);
        setPassword(password);
        setAddress(address);


    }




    //----------------------Getter and Setter ---------------------------------------------------------------------


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
