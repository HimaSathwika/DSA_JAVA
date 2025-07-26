//Inheritance
package java_projects;
class BankAccount {
	int accountNumber;
	double balance;

	BankAccount(int ac,double bal) {
		accountNumber=ac;
		balance=bal;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(balance>amount) {
			balance-=amount;
		}
	}
	public void displayBalance() {
		System.out.println("Balance:"+balance);
	}

}
class SavingsAccount extends BankAccount {
	double interestRate;

	SavingsAccount(int ac,double bal,double iR) {
		super(ac,bal);
		interestRate=iR;
	}

	public void addInterest() {
		double interest=balance*(interestRate/100);
				System.out.println("Balance:"+balance);
		balance+=interest;
	
		System.out.println("After Interest :"+balance);

	}
}

class CheckingAccount extends BankAccount {
	double overdraftLimit;
	CheckingAccount(int ac,double bal,double odl) {
		super(ac,bal);

		overdraftLimit=odl;
	}
	public void withdraw(double amount) {
	    System.out.println("Balance:"+balance);
	    System.out.println("Withdraw:"+amount);
		if (amount > balance + overdraftLimit) {
			System.out.println("Overdraft limit exceeded.");
		} else {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
			System.out.println("Remaining balance: " + balance);
		}
	}
}

class FDAccount extends BankAccount {
	int terminyears;
	double fdInterestRate;
	FDAccount(int ac,double bal,int tiy,double fir) {
		super(ac,bal);
		terminyears=tiy;
		fdInterestRate=fir;

	}
	public void calculateMaturityAmount() {
	    System.out.println("Balance:"+balance);
		double maturity=balance+(balance*fdInterestRate*terminyears/100);
		System.out.println("Maturity Amount(after 2 years at 6%:"+maturity);
	}
}


public class bank_pro {
	public static void main(String[] args) {

		
		System.out.println();
		SavingsAccount sa = new SavingsAccount(123,4000,5);
		System.out.println("savings account");
		sa.addInterest();
		System.out.println();

		CheckingAccount ca = new CheckingAccount(123,4000,500);
			System.out.println("Checking account");
		ca.withdraw(500);
		System.out.println();

		FDAccount fda = new FDAccount(123,4000,2,6);
			System.out.println("FD account");
		fda.calculateMaturityAmount();

	}
}