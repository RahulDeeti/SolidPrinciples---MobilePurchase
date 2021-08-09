class ValidateCard
{
	String name;
	Integer number;
	ValidateCard(String name, Integer number)
	{
		this.name = name;
		this.number = number;
	}
	void checkForNull()
	{
		if(name == null || name.length() == 0)
		{
			System.out.println("Card name is invalid");
			System.exit(0);
		}
	}
}
class ValidateCreditCard extends ValidateCard
{
	ValidateCreditCard(String name, Integer number)
	{
		super(name, number);
	}
	@Override
	void checkForNull()
	{
		if(number == null)
		{
			super.checkForNull();
			System.out.println("Card number is invalid");
			System.exit(1);
		}
	}
}