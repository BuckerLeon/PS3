package MainPackage;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= balance){
			balance -= amount;
		}
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public double getMonthlyInterestRate(double annuaInteresRate){
		double MonthlyInterestRate = annuaInteresRate /12;
		return MonthlyInterestRate;
	}
	
	public Date getdateCreated(){
		return dateCreated;
	}
	
	public void setid(int i){
		this.id = id;
	}
	
	public double getid(){
		return id;
	}
	
	public void setbalance(double balance){
		this.balance = balance;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public void setannualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getannualInteresRat(){
		return annualInterestRate;
	}	
}

