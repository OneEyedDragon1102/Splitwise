package com.splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
	private Map<String, Balance> userBalance; // Friend's {id, Balance}
	private double totalAmountUserPaid; // User lifetime payments 
	private double amountForPayment;  // User's current payment
	private double amountToGet; // User's amount to receive
	private double amountToPay; // User's amount to pay
	
	public UserExpenseBalanceSheet() {
		userBalance = new HashMap<>();
		totalAmountUserPaid = 0;
		amountToGet = 0;
		amountToPay = 0;
	}
	
	public Map <String, Balance> getUserBalance(){
        return userBalance;
    }
    public double getUserTotalAmountPaid(){
        return totalAmountUserPaid;
    }
    public double getAmountToPay(){
        return amountToPay;
    }
    public double getAmountToGet(){
        return amountToGet;
    }
    public double getAmountForPayment(){
        return amountForPayment;
    }

    public void setAmountToPay(double amountToPay){
        this.amountToPay = amountToPay;
    }
    public void setAmountToGet(double amountToGet){
        this.amountToGet = amountToGet;
    }
    public void setAmountForPayment(double amountForPayment){
        this.amountForPayment = amountForPayment;
    }
    public void setTotalAmountUserPaid(double totalAmountUserPaid){
        this.totalAmountUserPaid = totalAmountUserPaid;
    }
	
	
}
