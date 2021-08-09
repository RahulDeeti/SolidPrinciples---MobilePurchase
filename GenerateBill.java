class GenerateBill
{
	Mobile mobile;
	int quantity;
	double discountPercent;
	double gst;
	double totalBill;
	GenerateBill(Mobile mobile, int quantity, double discountPercent, double gst)
	{
		this.mobile = mobile;
		this.quantity = quantity;
		this.discountPercent = discountPercent;
		this.gst = gst;
	}
	public double totalAmount()
	{
		totalBill = (mobile.price - mobile.price * (discountPercent/100))*quantity;
		totalBill += gst;
		return totalBill;
	}
	public void printBillingDetails()
	{
		System.out.println(totalAmount());
	}
	public void saveToLocalDisc()
	{
		System.out.println("Saved to local disc");
	}
}