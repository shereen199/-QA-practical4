package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {

	public static void main(String[] args) throws InterruptedException {
		String testEmail = "shereen1212@gmail.com";//enter a real email
		String testPassword = "ilovemyself";
		String testPassword2 = "mansaf";

		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(testEmail);
		driver.findElement(By.id("pass")).sendKeys(testPassword);
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
//		driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();

	}

}
