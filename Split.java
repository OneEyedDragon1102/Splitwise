// package Splitwise_temp.PAYMENT.SPLIT;

// import Splitwise_temp.USER.User;
public class Split {
    private User user;
    double amountPaid;
    
    // amount and user who paid
    public Split(User user, double amountPaid){ 
        this.user = user;
        this.amountPaid = amountPaid;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public void setAmountPaid(double amountPaid){
        this.amountPaid = amountPaid;
    }

    public double getAmountPaid(){
        return amountPaid;
    }
}
