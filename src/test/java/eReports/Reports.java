package eReports;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public ExtentReports er;
	public String path = System.getProperty("user.dir") + "\\Reports";
	ExtentTest test;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ExtentTest reportInitialize(String s) {
		er = new ExtentReports();
		String reportPath = path + "\\" + s + ".html";
		ExtentSparkReporter esr = new ExtentSparkReporter(reportPath);
		er.attachReporter(esr);
		test = er.createTest(s);
		return test;
	}
	public void flushReport() {
		er.flush();
		path = path + "\\test.html";
//		File f = new File(path);
//		Desktop d = d.getDesktop().browseFileDirectory(f);
	}

}
