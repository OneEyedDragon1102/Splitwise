// package Splitwise_temp.PAYMENT.SPLIT;

// import Splitwise_temp.USER.User;
import java.util.List;

public class ExactPayment implements PaymentInterface {

    @Override
    public boolean validatePaymentSplit(List<Split> userSplits, double amountPaid) {
        double amount = 0;
        for(Split split : userSplits){
            amount += split.getAmountPaid();
        }

        if(amountPaid == amount){
            return true;
        }

        System.out.println("Entered amount not valid");
        return false;
    }
}
