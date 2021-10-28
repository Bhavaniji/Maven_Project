package listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listenercapture {
  
  public String capture(ITestResult results,WebDriver driver,String screenname) throws IOException {
	  if(ITestResult.FAILURE==results.getStatus()){
		  try {
	  File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String simpledate = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
	  File dest = new File("./Screens/"+screenname+simpledate+".png");
	  String destpath = dest.getAbsolutePath();
	  FileUtils.copyFile(file, dest);
	  return destpath;
	  
  }
catch(IOException ex) {
	ex.getMessage();
}
}
	return screenname;
}
}