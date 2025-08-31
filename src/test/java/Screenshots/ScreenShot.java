package Screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import SetUp.SetUp;

public class ScreenShot extends SetUp{
	public WebDriver driver;
	public ScreenShot(WebDriver driver) {
		this.driver= driver;	
		}
	public String takeScreenShot(String fileName) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		String src = ss.getScreenshotAs(OutputType.BASE64);
		String path = System.getProperty("user.dir");
        
        File des = new File(path+"\\src\\test\\java\\Screenshotspng\\"+ fileName + ".png");
        
//        String reportPath = System.getProperty("user.dir") + "\\reports\\test.html";
		
        
        return src;
		
		}
}
