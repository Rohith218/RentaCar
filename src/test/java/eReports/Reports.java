package eReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public ExtentReports er;
	public String path = System.getProperty("user.dir") + "\\Reports";
	ExtentTest test;
	public String time = timemethod();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		timemethod();
	}
	public String timemethod() {
		LocalDateTime dt = LocalDateTime.now();
		String date = (String.valueOf(dt));
		System.out.println(date);
		return date.replaceAll("\\D", "");
	}
	public ExtentTest reportInitialize(String s) {
		er = new ExtentReports();
		String reportPath = path + "\\" + s +"_"+time + ".html";
		System.out.println(reportPath);
		ExtentSparkReporter esr = new ExtentSparkReporter(reportPath);
		er.attachReporter(esr);
		test = er.createTest(s);
		return test;
	}
	public void flushReport(String s) throws IOException {
		er.flush();
		String reportPath = path + "\\" + s +"_"+ time + ".html";
		System.out.println(reportPath);
		Desktop.getDesktop().browse(new File(reportPath).toURI());
	}

}
