package maven.selenium.testng.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenScript {
	@Test
	public void test() throws InterruptedException {
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.gecko.driver","/home/edureka/Downloads/geckodriver");
		// WebDriver driver = new FirefoxDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\maven.selenium.testng.project\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://newtours.demoaut.com/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		// launch Chrome and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();
		Thread.sleep(3000);

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		// close Chrome
		driver.quit();
	}
}
