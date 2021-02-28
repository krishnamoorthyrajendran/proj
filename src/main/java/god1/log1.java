package god1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log1 implements login{
	WebDriver driver;
	@Override
	public void function() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnamoorthy\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}

	@Override
	public void login1() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("email")).sendKeys("8015982316");
		driver.findElement(By.name("pass")).sendKeys("Abinya@2015");
	}

	@Override
	public void click() {
		driver.findElement(By.name("login")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log1 l=new log1();
		l.function();
		l.login1();
		l.click();
	}

}
