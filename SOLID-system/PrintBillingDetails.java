class PrintBillingDetails
{
	static void printBill(GenerateBill gb)
	{
		double bill = gb.totalAmount();
		System.out.println("Total bill is: "+bill);
	}
}