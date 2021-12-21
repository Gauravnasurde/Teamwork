package TeamDemo;

public class TestCases 
{
	public void M1()
	{
		System.out.println("Please write the test Cases For Mercury Login One by one");
		System.out.println("Start from Userid");
		
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.mercury-tours.com/");
		System.out.println("Webpage open Successfully");
	}

}
