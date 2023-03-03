// package Splitwise_temp.USER;

// import Splitwise_temp.UserPaymentBalanceSheet;

public class User{
    private String uid;
    private String name;
    private String contact_Number;
    private String email;
    
    // unique balance Sheet for every user
    private UserPaymentBalanceSheet userPaymentBalanceSheet; 
    
    // User details
    public User(String uid, String name, String contact_Number, String email){
        this.uid = uid;
        this.name = name;
        this.contact_Number = contact_Number;
        this.email = email;
        userPaymentBalanceSheet = new UserPaymentBalanceSheet();
    }

    public void setId(String uid){
        this.uid = uid;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContactNumber(String contact_Number){
        this.contact_Number = contact_Number;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setUserPaymentBalanceSheet(UserPaymentBalanceSheet userPaymentBalanceSheet){
        this.userPaymentBalanceSheet = userPaymentBalanceSheet;
    }

    public String getId(){
        return uid;
    }
    public String getName(){
        return name;
    }
    public String getContactNumber(){
        return contact_Number;
    }
    public String getEmail(){
        return email;
    }
    public UserPaymentBalanceSheet getUserPaymentBalanceSheet(){
        return userPaymentBalanceSheet;
    }
}