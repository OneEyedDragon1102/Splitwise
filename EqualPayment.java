// package Splitwise_temp.PAYMENT.SPLIT;

// import Splitwise_temp.USER.User;
import java.util.List;

public class EqualPayment implements PaymentInterface{
    
    @Override
    public boolean validatePaymentSplit(List <Split> userSplits, double amount){
        double equalAmount = amount/userSplits.size();
        // for each user amount stored in List; 
        for(Split split : userSplits){ 
            if(split.getAmountPaid() != equalAmount){
                System.out.println("Entered amount not valid");
                return false;
            }
        }

        return true;
    }
}
