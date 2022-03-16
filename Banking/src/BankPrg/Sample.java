package BankPrg;

class sample	{
	
	public static void main(String[] args) {
		
		Adrs address1 = new Adrs("Agra","UP","India");
		Adrs address2 = new Adrs("Aligarh","UP","India");
		
		Customer c1 = new Customer("ram",101,10000.0,address1);
		Customer c2 = new Customer("Shyam",102,20000.0,address2);
		
		Bank b =new Bank();
		
		b.bk();
		c1.disp();
		
		b.bk();
		c2.disp();
		}
}