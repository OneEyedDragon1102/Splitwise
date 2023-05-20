// package Splitwise_temp.PAYMENT;

// import Splitwise_temp.PAYMENT.PaymentSplitType;
// import Splitwise_temp.PAYMENT.SPLIT.EqualPayment;
// import Splitwise_temp.PAYMENT.SPLIT.ExactPayment;
// import Splitwise_temp.PAYMENT.SPLIT.PercentPayment;
// import Splitwise_temp.PAYMENT.SPLIT.PaymentInterface;

public class SplitCase {
    public static PaymentInterface getSplitType(PaymentSplitType splitType){
        switch(splitType){
            case EQUAL : 
                return new EqualPayment();
            case EXACT :
                return new ExactPayment();
            case PERCENT :
                return new PercentPayment();
            default:
                System.out.println("Invalid Split Type!!!");
                return null;
        }
    }     
}