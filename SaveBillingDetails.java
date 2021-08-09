interface SaveBillingDetails
{
	void save();
}
interface SaveToDisc extends SaveBillingDetails
{
	void toDisc();
}
interface SaveToDatabase extends SaveBillingDetails
{
	void toDataBase();
}
class SaveBillingDetailsToLocalDisc implements SaveToDisc
{
	GenerateBill gb;
	SaveBillingDetailsToLocalDisc()
	{
		
	}
	SaveBillingDetailsToLocalDisc(GenerateBill gb)
	{
		this.gb = gb;
	}
	public void toDisc()
	{
		System.out.println("Saved to disc");
	}
	public void save()
	{
		SaveBillingDetailsToLocalDisc disc = new SaveBillingDetailsToLocalDisc();
		disc.toDisc();
	}
}
class SaveBillingDetailsToDatabase implements SaveToDatabase
{
	GenerateBill gb;
	SaveBillingDetailsToDatabase()
	{
		
	}
	SaveBillingDetailsToDatabase(GenerateBill gb)
	{
		this.gb = gb;
	}
	public void toDataBase()
	{
		System.out.println("Saved to database");
	}
	@Override
	public void save()
	{
		SaveBillingDetailsToDatabase db = new SaveBillingDetailsToDatabase();
		db.toDataBase();
	}
}