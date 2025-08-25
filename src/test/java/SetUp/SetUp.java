package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import eReports.Reports;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUp {
	public static WebDriver driver;
	public static String reportName() {
		String s = SetUp.class.getSimpleName();
		System.out.println(s);
		return SetUp.class.getSimpleName();
	}
	public static WebDriver initialize()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Reports r = new Reports();
		ExtentTest test = r.reportInitialize(reportName());
		setUp();
		Thread.sleep(5000);
		test.pass("driver initialized");
		test.info("page loaded");
		r.flushReport();
		tearDown();
	}
	public static void setUp() {
		driver = initialize();
		driver.manage().window().maximize();
		driver.get("https://webapps.tekstac.com/RentaCar/");
	}
	public static void tearDown() {
		driver.close();
	}

}
