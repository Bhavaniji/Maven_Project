package com.simplecapture;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screencapture {

		
		static WebDriver driver;
	  public String Screenshot(WebDriver driver,String screenname) throws IOException {
		 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//  File file = element.getScreenshotAs(OutputType.FILE);
		  String dateName = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		  File dest = new File("./Screens/"+screenname+dateName+".png");
		  String destpath = dest.getAbsolutePath();
		  FileUtils.copyFile(file, dest);
		  return destpath;
		  
	  }
	}


