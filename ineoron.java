package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ineoron {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		boolean result1= driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		System.out.println("Before filling details: "+result1);
		
		driver.findElement(By.id("name")).sendKeys("Sanjeet");
		driver.findElement(By.name("email")).sendKeys("mno@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		
		
		driver.findElement(By.xpath("//div[contains(@class, 'interests-div')]/div[3]")).click();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		WebElement stateValue=driver.findElement(By.xpath("//select[@id='state']"));
		Select state=new Select(stateValue);
		state.selectByVisibleText("Bihar");
		
		boolean result2= driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		System.out.println("After filling all details: "+result2);
		
		Thread.sleep(6000);
		driver.findElement(By.className("submit-btn")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mnc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd123");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		Thread.sleep(7000);
		
		
		
		
		
		/*WebElement yearDropDown=driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(yearDropDown);
		year.selectByValue("1997");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']"));
		Thread.sleep(5000);*/
		
	
		
		
		

	}

}
