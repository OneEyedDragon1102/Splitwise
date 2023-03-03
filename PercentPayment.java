// package Splitwise_temp.PAYMENT.SPLIT;

// import Splitwise_temp.USER.User;
import java.util.List;

public class PercentPayment implements PaymentInterface{
    
    @Override
    public boolean validatePaymentSplit(List<Split> userSplits, double amountPaid) {
        double totalPercent = 0;
        for(Split split : userSplits){
            totalPercent += split.getAmountPaid();
        }

        if(totalPercent == 100.0){
            for(Split split : userSplits){
                double tempPercent = split.getAmountPaid(); 
                split.setAmountPaid((tempPercent / 100.0)*amountPaid);
            }

            return true;
        }

        System.out.println("Entered amount percent not valid");
        return false;
    }
}
