public abstract class Item
{
	String brandName;
	int price;
	Item(String brandName, int price)
	{
		this.brandName = brandName;
		this.price = price;
	}
}
class Mobile extends Item
{
	String model;
	Mobile(String brandName, String model, int price)
	{
		super(brandName, price);
		this.model = model;
	}
}