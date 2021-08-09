import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		PayAmount amt;
		
		String purchaseType;
		
		String payType;
		
		int quantity;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What do you want to purchase?");
		
		purchaseType = sc.nextLine();
		
		Item item = ItemFactory.getInstance(purchaseType.trim());
		
		System.out.println("Enter payment type (online/cash on delivery)");
		
		payType = sc.nextLine();
		
		amt = PayFactory.getInstance(payType.trim());
		
		System.out.println("Enter your Card details (name and card number)");
		
		String name = sc.nextLine();
		
		Integer num = sc.nextInt();
		
		new ValidateCreditCard(name, num).checkForNull();
		
		System.out.println("Card Validation Successuful");
		
		amt.pay();
		
		sc.close();
	}
	
}