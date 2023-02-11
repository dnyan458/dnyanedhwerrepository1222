package TestNGpractice;

import java.io.IOException;

public class TestUtil 
{
   private static ExcelHandler  handler =new ExcelHandler();
   public boolean isTestRunnable(String Testname) throws IOException 
   {
	   String sheetname ="testSuit";
	   return handler.executeTest();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
