// package Splitwise_temp.PAYMENT;

// import Splitwise_temp.USER.User;
// import Splitwise_temp.PAYMENT.PaymentSplitType;
// import Splitwise_temp.PAYMENT.SPLIT.Split;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private String paymentId;
    private String description;
    private double amount;
    private User paidBy;
    private PaymentSplitType splitType;
    private List <Split> userDetailsList;

    public Payment(String paymentId, String description, double amount, User paidBy,
                   PaymentSplitType splitType, List <Split> userDetailsList){
        this.paymentId = paymentId;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splitType = splitType;
        this.userDetailsList = new ArrayList<Split>();
        this.userDetailsList.addAll(userDetailsList);
    }
}