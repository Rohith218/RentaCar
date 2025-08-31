package SetAttributes;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Resources.JSONReader;
import SetUp.SetUp;

public class SetAttributes extends SetUp{
	public String name;
	String num;
	String Address;
	String TravelDt;
	public WebDriver driver;;
	Boolean carDriver;
	String CarType;
	String duration;
	String lnum;
	String pmode;
	public void confirm() {
		driver.findElement(By.id("submit")).click();;
	}
	public Boolean getCarDriver() {
		return carDriver;
	}
	public void setCarDriver(Boolean carDriver) {
		this.carDriver = carDriver;
		if(carDriver) {
			driver.findElement(By.id("driver")).click();
		}
	}
	public SetAttributes(WebDriver driver) {
		this.driver = driver;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		driver.findElement(By.id("name")).sendKeys(name);
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
		driver.findElement(By.id("number")).sendKeys(num);
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
		driver.findElement(By.id("address")).sendKeys(address);
	}
	public String getTravelDt() {
		return TravelDt;
	}
	public void setTravelDt(String travelDt) {
		this.TravelDt = travelDt;
		driver.findElement(By.id("traveldate")).sendKeys(TravelDt);
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		this.CarType = carType;
		WebElement ctype = driver.findElement(By.id("cartype"));
		Select set = new Select(ctype);
		set.selectByVisibleText(carType);
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
		driver.findElement(By.id("duration")).sendKeys(duration);
	}
	public String getLnum() {
		return lnum;
	}
	public void setLnum(String lnum) {
		this.lnum = lnum;
		driver.findElement(By.id("license")).sendKeys(lnum);
	}
	public String getPmode() {
		return pmode;
	}
	public void setPmode(String pmode) {
		this.pmode = pmode;
		if(pmode.equalsIgnoreCase("netbanking")){
			driver.findElement(By.id("netbanking")).click();
		}else if(pmode.equalsIgnoreCase("cod")) {
			driver.findElement(By.id("cod")).click();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		
	}

}
