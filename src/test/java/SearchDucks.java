import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class SearchDucks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/SRai/Documents/GitHub/test-google/search-automation/drivers/chromedriver/chromedriver 4");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
    }

}
