interface SaveBillingDetails
{
	void save();
}
class SaveBillingDetailsToLocalDisc implements SaveBillingDetails
{
	GenerateBill gb;
	double bill;
	SaveBillingDetailsToLocalDisc(GenerateBill gb)
	{
		this.gb = gb;
		bill = gb.totalAmount();
	}
	@Override
	public void save()
	{
		System.out.println("Total bill Saved to local disc");
	}
}
class SaveBillingDetailsToDatabase implements SaveBillingDetails
{
	GenerateBill gb;
	SaveBillingDetailsToDatabase(GenerateBill gb)
	{
		this.gb = gb;
		double bill;
		bill = gb.totalAmount();
	}
	@Override
	public void save()
	{
		System.out.println("Total bill Saved to database");
	}
}