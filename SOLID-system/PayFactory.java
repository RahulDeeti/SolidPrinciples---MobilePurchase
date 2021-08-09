class PayFactory
{
	public static PayAmount getInstance(String str)
	{
		if(str.equalsIgnoreCase("online"))
		{
			return new PurchaseProuductOnline();
		}
		else
		{	
			return new PurchasePayOnDelivery();
		}
	}
}