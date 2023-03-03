// package Splitwise_temp.PAYMENT;

// import Splitwise_temp.USER.User;
// import Splitwise_temp.PAYMENT.SPLIT.Split;
// import Splitwise_temp.PAYMENT.PaymentSplitType;
// import Splitwise_temp.PAYMENT.SPLIT.PaymentInterface;
// import Splitwise_temp.BalanceSheetManager;

import java.util.List;
public class PaymentManager {
    private BalanceSheetManager balanceSheetManager; 

    public PaymentManager(){
        balanceSheetManager = new BalanceSheetManager();
    }

    public Payment createPayment(String paymentID, String description, double amount,
                                List <Split> userDetailsList, User paidBy, 
                                PaymentSplitType splitType){
        PaymentInterface paymentInterface = SplitCase.getSplitType(splitType);

        if(paymentInterface.validatePaymentSplit(userDetailsList, amount)){
            Payment payment = new Payment(paymentID, description, amount, paidBy, splitType, userDetailsList);
            balanceSheetManager.updateUserPaymentBalanceSheet(paidBy, userDetailsList, amount);
            
            return payment;
        }

        // System.out.println("Entered amount not valid");
        return null;
    }
}