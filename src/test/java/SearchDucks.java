import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class SearchDucks {
	
	@Parameters({"Chrome"})
	@Test
		public static void verifyDuckOnSearchResult (String url) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/SRai/Documents/GitHub/test-google/search-automation/drivers/chromedriver/chromedriver 4");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchField = driver.findElement(By.xpath("//input[@title='Search']"));
		
		searchField.sendKeys("Ducks" + "\n");
		
		Thread.sleep(5000);
		
		String actualString = driver.findElement(By.xpath("//span[normalize-space()='Duck']")).getText();
		
		Assert.assertTrue(actualString.contains("Duck"));
		
		driver.quit();
		
		
    }

}
