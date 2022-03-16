package BankPrg;

public class Customer extends Bank	{
	String custName;
	int accNo;
	Adrs address;
	public Customer (String custName, int accNo, double bal,Adrs address)	{
		this.custName = custName;
		this.accNo = accNo;
		this.bal= bal;
		this.address = address;
	}	
	void disp()
	{
		
		System.out.println("Customer Name: "+custName);
		System.out.println("Customer Account No: "+accNo);
		System.out.println("Old account balance: "+bal);
		System.out.println("Address: "+address.city+" "+address.state+" "+address.country);
		System.out.println();
		System.out.println("enter ammount which you want to Deposit or Withdrawal: ");
		double rs = sc.nextDouble();
		double cBal = bal+(rs);
		
		if	(cBal<0)	{
			System.out.println("Insufficient Funds");
			System.out.println();
		}
		else	{
		System.out.println("Updated Bal: "+cBal);
		System.out.println();
		}
	}
}