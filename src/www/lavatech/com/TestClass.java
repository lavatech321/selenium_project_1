package www.lavatech.com;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./Extensions/CFHDOJBKJHNKLBPKDAIBDCCDDILIFDDB_3_24_0_0.crx"));		
		driver = new ChromeDriver(options);
		driver.get("https://automationexercise.com/");
		
		String currentHandle = driver.getWindowHandle();
		driver.switchTo().window(currentHandle);
	}
	
	@Test(priority=0)
	public void signIn() throws InterruptedException {
		WebElement login = driver.findElement(By.partialLinkText("Signup / Login"));
		login.click();
		WebElement username = driver.findElement(By.name("name"));
		username.sendKeys("DumUser14");
		WebElement email = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]") );
		email.sendKeys("dumuser14@gmail.com");
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]"));
		signup.click();
		
		// Fill in the form
		WebElement gender = driver.findElement(By.id("id_gender2"));
		gender.click();
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sample@12345@");
		Thread.sleep(1000);
		WebElement days = driver.findElement(By.id("days"));
		days.sendKeys("25");
		Thread.sleep(1000);
		WebElement months = driver.findElement(By.id("months"));
		months.sendKeys("January");
		Thread.sleep(1000);
		WebElement years = driver.findElement(By.id("years"));
		years.sendKeys("2002");
		Thread.sleep(1000);
		
		WebElement news_letter = driver.findElement(By.id("newsletter"));
		news_letter.click();
		Thread.sleep(1000);
		
		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys("Dummy14");
		Thread.sleep(1000);
		
		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("Dumb");
		Thread.sleep(1000);
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("TCS");
		Thread.sleep(1000);
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("Hadapsar");
		Thread.sleep(1000);
		
		WebElement country = driver.findElement(By.id("country"));
		country.sendKeys("India");
		Thread.sleep(1000);
		
		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("Maharashtra");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Pune");
		Thread.sleep(1000);
		
		WebElement zipcode = driver.findElement(By.id("zipcode"));
		zipcode.sendKeys("411028");
		Thread.sleep(1000);
		
		WebElement mobile = driver.findElement(By.id("mobile_number"));
		mobile.sendKeys("9432423120");
		Thread.sleep(1000);
	
		WebElement account = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));
		account.click();
		
		Thread.sleep(3000);
		WebElement continue_btn = driver.findElement(By.linkText("Continue"));
		continue_btn.click();
	}


	@Test(priority=1)
	public void cartTest() throws InterruptedException{
		
		Thread.sleep(1000);
		WebElement cart_item1 = driver.findElement(By.xpath("//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
		cart_item1.click();
		
		Thread.sleep(1000);
		WebElement cart_add = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/button[1]"));
		cart_add.click();
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]")));
		
		Thread.sleep(1000);
		WebElement continue_btn = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
		continue_btn.click();
		
		Thread.sleep(1000);
		WebElement select_btn = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
		select_btn.click();
		
		Thread.sleep(1000);
		WebElement cart_item2 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
		cart_item2.click();
		
		Thread.sleep(1000);
		WebElement cart_add2 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/button[1]"));
		cart_add2.click();

		Thread.sleep(1000);
		WebElement continue_btn2 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]"));
		continue_btn2.click();
		
		Thread.sleep(1000);
		WebElement select_btn2 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
		select_btn2.click();
		
		Thread.sleep(3000);
		driver.get("https://automationexercise.com/view_cart");
	}
	
	@Test(priority=2)
	public void orderTest() throws InterruptedException{
		Thread.sleep(1000);
		WebElement proceed_checkout = driver.findElement(By.linkText("Proceed To Checkout"));
		proceed_checkout.click();
		
		Thread.sleep(1000);
		WebElement order = driver.findElement(By.linkText("Place Order"));
		order.click();
		
		Thread.sleep(1000);
		WebElement card_name = driver.findElement(By.name("name_on_card"));
		card_name.sendKeys("Dum User");
		
		Thread.sleep(1000);
		WebElement card_number = driver.findElement(By.name("card_number"));
		card_number.sendKeys("DMCEXZW23ZSD");
	
		Thread.sleep(1000);
		WebElement cvc_number = driver.findElement(By.name("cvc"));
		cvc_number.sendKeys("354");
		
		Thread.sleep(1000);
		WebElement cvc_month = driver.findElement(By.name("expiry_month"));
		cvc_month.sendKeys("10");

		Thread.sleep(1000);
		WebElement cvc_year = driver.findElement(By.name("expiry_year"));
		cvc_year.sendKeys("2030");
		
		Thread.sleep(1000);
		WebElement confirm = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[5]/div[1]/button[1]"));
		confirm.click();
		
		// Download invoice
		WebElement invoice = driver.findElement(By.linkText("Download Invoice"));
		invoice.click();
	}

	

	@AfterClass
	public void deleteAccount() throws InterruptedException {
		
		WebElement delete_btn = driver.findElement(By.partialLinkText("Delete Account"));
		delete_btn.click();
		
		Thread.sleep(3000);
		WebElement continue_btn = driver.findElement(By.linkText("Continue"));
		continue_btn.click();
		
		Thread.sleep(2000);
		driver.quit();		
	}
}
