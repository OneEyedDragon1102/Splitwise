// package Splitwise_temp;

// import Splitwise_temp.USER.User;
// import Splitwise_temp.PAYMENT.SPLIT.Split;

import java.util.List;
import java.util.Map;

public class BalanceSheetManager {
    public void updateUserPaymentBalanceSheet(User paidBy, List <Split> userSplits, double amountForPayment){
        // updating the balance sheet of user who paid
        UserPaymentBalanceSheet paidByUserPaymentBalanceSheet = paidBy.getUserPaymentBalanceSheet();
        paidByUserPaymentBalanceSheet.setTotalAmountUserPaid(paidByUserPaymentBalanceSheet.getUserTotalAmountPaid() + amountForPayment);
        
        for(Split s : userSplits){
            User generalUser = s.getUser(); // general User
            // getting balance sheet of user
            UserPaymentBalanceSheet generalUserPaymentBalanceSheet = generalUser.getUserPaymentBalanceSheet();
            // getting amount owed to pay
            double amountToPay = s.getAmountPaid();

            // checking if the current user is the same user who paid for all
            if(paidBy.getId().equals(generalUser.getId())){
                // paidByUserPaymentBalanceSheet.setTotalAmountUserPaid(paidByUserPaymentBalanceSheet.getUserTotalAmountPaid() + amountToPay);
            }
            else{ // User  who paid the amount
                paidByUserPaymentBalanceSheet.setAmountToGet(paidByUserPaymentBalanceSheet.getAmountToGet() + amountToPay);

                Balance generalUserBalance; // Balance of GeneralUser
                if(paidByUserPaymentBalanceSheet.getUserBalance().containsKey(generalUser.getId())){
                    // checking if there is any balance of user
                    generalUserBalance = paidByUserPaymentBalanceSheet.getUserBalance().get(generalUser.getId());
                }
                else{
                    // creating new balance and map entry
                    generalUserBalance = new Balance();
                    paidByUserPaymentBalanceSheet.getUserBalance().put(generalUser.getId(), generalUserBalance);
                }

                generalUserBalance.setAmountToGet(generalUserBalance.getAmountToGet() + amountToPay);

                // updating BalanceSheet of user what he pays or get
                generalUserPaymentBalanceSheet.setAmountToPay(generalUserPaymentBalanceSheet.getAmountToPay() + amountToPay);
                generalUserPaymentBalanceSheet.setTotalAmountUserPaid(generalUserPaymentBalanceSheet.getUserTotalAmountPaid() + amountToPay);


                // friend for whom user paid 
                Balance friendBalance;
                if(generalUserPaymentBalanceSheet.getUserBalance().containsKey(paidBy.getId())){
                    // checking if user has some previous data
                    friendBalance = generalUserPaymentBalanceSheet.getUserBalance().get(paidBy.getId());
                }
                else{
                    // creating new map entry
                    friendBalance = new Balance();
                    generalUserPaymentBalanceSheet.getUserBalance().put(paidBy.getId(), friendBalance);
                }

                friendBalance.setAmountToPay(friendBalance.getAmountToPay() + amountToPay);
            }
        }
    }    

    public void showBalanceSheet(User user){
        System.out.println();
        System.out.println("Balance Sheet of " + user.getId());
        UserPaymentBalanceSheet userPaymentBalanceSheet = user.getUserPaymentBalanceSheet();
        
        System.out.println("----x----x----x----x----x----x----x----x----x----x");
        
        System.out.println("Total lifetime amount paid : " + userPaymentBalanceSheet.getUserTotalAmountPaid());
        System.out.println("Total amount owed : " + userPaymentBalanceSheet.getAmountToPay());
        System.out.println("Amount to get back : " + userPaymentBalanceSheet.getAmountToGet());
        System.out.println("Payments made : ");
        
        for(Map.Entry <String ,Balance> i : userPaymentBalanceSheet.getUserBalance().entrySet()){
            String userId = i.getKey();
            Balance userBalance = i.getValue();

            System.out.println("User Id : " + userId + " owes : " + userBalance.getAmountToGet() + " You owe : " + userBalance.getAmountToPay());
        }
        System.out.println("----x----x----x----x----x----x----x----x----x----x");
    }
}