// package Splitwise_temp;

// import Splitwise_temp.PAYMENT.PaymentSplitType;
// import Splitwise_temp.PAYMENT.SPLIT.Split;
// import Splitwise_temp.USER.User;
// import Splitwise_temp.USER.UserManager;
// import Splitwise_temp.BalanceSheetManager;
// import Splitwise_temp.GROUP.UserGroup;
// import Splitwise_temp.GROUP.UserGroupManager;
import java.util.List;
import java.util.ArrayList;

public class Splitwise_demo {
    private UserManager userManager;
    private UserGroupManager userGroupManager;
    private BalanceSheetManager balanceSheetManager;

    public Splitwise_demo(){
        userGroupManager = new UserGroupManager();
        userManager = new UserManager();
        balanceSheetManager = new BalanceSheetManager();
    }

    public void setupUserAndGroup(){
        addUsers();

        //creating a group
        User u1 = userManager.getUser("01");
        userGroupManager.createUserGroup("001", "Buddys", u1);
    }

    private void addUsers(){ // creating users
        User u1 = new User("01", "A", "91-1", "1@gmail.com");
        User u2 = new User("02", "B", "91-2", "2@gmail.com");
        User u3 = new User("03", "C", "91-3", "3@gmail.com");
    
        userManager.addUser(u1);
        userManager.addUser(u2);
        userManager.addUser(u3);
    }

    public void demo(){
        setupUserAndGroup();

        // getting a group through groupId and adding members
        UserGroup g1 = userGroupManager.getGroup("001");
        g1.addUser(userManager.getUser("02"));
        g1.addUser(userManager.getUser("03"));

        List <Split> userSplits = new ArrayList<>();
        Split s1 = new Split(userManager.getUser("01"), 40);
        Split s2 = new Split(userManager.getUser("02"), 20);
        Split s3 = new Split(userManager.getUser("03"), 40);
        userSplits.add(s1);
        userSplits.add(s2);
        userSplits.add(s3);
        
        // Creating a Payment inside Group
        g1.createPayment("A1", "Chai", 600.0, userSplits, PaymentSplitType.PERCENT, userManager.getUser("01"));
        for(User user : userManager.getAllUsers()){
            balanceSheetManager.showBalanceSheet(user);
        }
        
    }
}