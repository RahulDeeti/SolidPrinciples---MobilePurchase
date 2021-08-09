interface Purchase
{
	void payOnline();
	void cashOnDelivery();
}
class PurchaseProduct implements Purchase
{
	public void payOnline()
	{
		//empty implementation
	}
	public void cashOnDelivery()
	{
		System.out.println("Pay the money when it is delivered to you");
	}
}