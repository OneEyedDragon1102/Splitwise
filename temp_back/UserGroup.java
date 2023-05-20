// package Splitwise_temp.GROUP;

// import Splitwise_temp.PAYMENT.SPLIT.Split;
// import Splitwise_temp.USER.User;
// import Splitwise_temp.PAYMENT.PaymentSplitType;
// import Splitwise_temp.PAYMENT.Payment;
// import Splitwise_temp.PAYMENT.PaymentManager;

import java.util.ArrayList;
import java.util.List;

public class UserGroup {
    private String groupId;
    private String groupName;
    private List <User> groupMembers;
    private List <Payment> paymentList;
    private PaymentManager paymentManager;

    public UserGroup(){ // Constructor
        groupMembers = new ArrayList<>();
        paymentList = new ArrayList<>();
        paymentManager = new PaymentManager();
    }

    // adding members
    public void addUser(User friend){
        groupMembers.add(friend);
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }
    public void setGroupId(String groupId){
        this.groupId = groupId;
    }

    public String getGroupName(){
        return groupName;
    }
    public String getGroupId(){
        return groupId;
    }
    public List <User> getGroupUsers(){
        return groupMembers;
    }
    // creating payment in a group
    public Payment createPayment(String paymentId, String description, double amount,
                                 List <Split> UserSplitDetails, PaymentSplitType splitType,
                                 User paidBy){
        Payment payment = paymentManager.createPayment(paymentId, description, amount, UserSplitDetails, paidBy, splitType);
        paymentList.add(payment);

        return payment;
    }
}