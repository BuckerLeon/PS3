package MainPackage;

public class Text {
	public static void main(String[] args){
		Account c = new Account(1122, 20000);
		c.deposit(2500);
		try {
			c.withdraw(3000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.getMonthlyInterestRate(4.5);
		
		System.out.println("the blance is"+c.getbalance()+"the MIR is"+c.getMonthlyInterestRate(4.5)+"the account is " );
	}
}
