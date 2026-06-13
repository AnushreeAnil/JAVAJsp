class Facebook
{
	static void signup() 
	{
		System.out.println("sign up!");
	}
	static void login() 
	{
		System.out.println("login");
	}
	static void homepage() 
	{
		System.out.println("homepage");
	}
	static void cart() 
	{
		System.out.println("cart");
	}
	static void logout() 
	{
		System.out.println("logout");
	}
	public static void main(String[] args)
	{
		System.out.println("welcome to Facebook!");
		signup();
		login();
		homepage();
		cart();
		logout();
		System.out.println("thank you!");
	}
}
