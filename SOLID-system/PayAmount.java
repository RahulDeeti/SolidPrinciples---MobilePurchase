interface PayAmount 
{
	void pay();
}
interface PayOnDelivery extends PayAmount
{
	void payOnReceiving();
}
interface PayOnline extends PayAmount
{
	void payUsingNetBanking();
}
class PurchaseProuductOnline implements PayOnline
{
	public void payUsingNetBanking()
	{
		System.out.println("Amount paid online");
	}
	public void pay()
	{
		PurchaseProuductOnline p = new PurchaseProuductOnline();
		p.payUsingNetBanking();
	}
}
class PurchasePayOnDelivery implements PayOnDelivery
{
	public void payOnReceiving()
	{
		System.out.println("Amount paid on delivery");
	}
	public void pay()
	{
		PurchasePayOnDelivery p = new PurchasePayOnDelivery();
		p.payOnReceiving();
	}
}