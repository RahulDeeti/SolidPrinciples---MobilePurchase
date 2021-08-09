class GenerateBill
{
	Item item;
	int quantity;
	double discountPercent;
	double gst;
	double totalBill;
	GenerateBill(Item item, int quantity, double discountPercent, double gst)
	{
		this.item = item;
		this.quantity = quantity;
		this.discountPercent = discountPercent;
		this.gst = gst;
	}
	public double totalAmount()
	{
		totalBill = (item.price - item.price * (discountPercent/100))*quantity;
		totalBill += gst;
		return totalBill;
	}
}