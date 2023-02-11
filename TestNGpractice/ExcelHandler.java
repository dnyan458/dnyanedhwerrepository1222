package TestNGpractice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;

import org.testng.annotations.Test;

public class ExcelHandler 
{
 private static ExcelHandler handler = new ExcelHandler();
 public boolean  isTestRunnable(String Testname) throws IOException
 {
	 String sheetname = "testSuite";
	 return handler.executeTest(sheetname,Testname);
 }
 public String  genertaeFullPath(String[]path)
 {
	 if("win".equals(getOs1()));
	 {
		 String var = System.getProperty("user.dir"+   getfinalPath(path, "\\"));
	     return var;
	 }
	 else
	 {
		 return System.getProperty("user.dir"+ getfinalpath(path,"/"));
	 }	 
	public String getdriverpath(String browser)
	{
	   String os= getOs1();
	   String[] path;
	switch (browser.toLowerCase())
	{
	case "chrome": Path = new String[]{"src","Binary","chromedriver.exe"};
	break;
	case "edge": Path  =new String[]{"src","Binary","msedgedriver.exe"};
	
	}
		return genertaeFullPath(path);
	}
		
	private String getOs1() 
	{
		if(System.getProperty("os.name").toLowerCase().contains("win"));
		return null;
	
	
	
	
	
 }	 
		 
	 
	 
private String getfinalPath(String[] path, String string) {
	// TODO Auto-generated method stub
	return null;
}
private Object getOs() {
	// TODO Auto-generated method stub
	return null;
}
private String getfinalpath(String[] path, String string) {
	// TODO Auto-generated method stub
	return null;
}
	 
	 
 }
 
 
 

