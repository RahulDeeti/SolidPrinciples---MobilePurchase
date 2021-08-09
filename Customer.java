class Customer
{
	int c_id;
	int purchaseId;
	CustomerRepository cr = new CustomerRepository();
	public void save()
	{
		System.out.println("Customer Details saved");
	}
}
class CustomerRepository
{
	public void save()
	{
		System.out.println("Details are saved to MySqlDb");
	}
}