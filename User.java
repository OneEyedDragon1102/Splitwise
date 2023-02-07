public class User{
    private String id;
    private String name;
    private String contact_Number;
    private String email;

    public User(String id, String name, String contact_Number, String email){
        this.id = id;
        this.name = name;
        this.contact_Number = contact_Number;
        this.email = email;
    }

    public void setId(String id){
        this.id = id;
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

    public String getId(){
        return id;
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
}