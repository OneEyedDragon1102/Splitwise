// package Splitwise_temp.USER;

import java.util.List;
import java.util.ArrayList;

public class UserManager {
    private List <User> userList;

    public UserManager(){
        userList = new ArrayList<User>();
    }

    public void addUser(User user){
        userList.add(user);
    }

    public User getUser(String uId){ // searchs list of users using thier id
        for(User u: userList){
            if(u.getId().equals(uId)){
                return u;
            }
        }

        return null;
    }

    public List <User> getAllUsers(){
        return userList; 
    }
}
