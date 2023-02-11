package TestNGpractice;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddCustomerTest extends BastTest
{
   private static final String alertmessage = null;
private TestUtil testutils=new TestUtil();
   @Test(dataProvider  ="addcustomer",dataProviderClass = DataProviderClass.class,
		   priority= 2	,description ="diffrenr type of customers")
   public AddCustomerTest(String FirstName,String LastName,String PastCode,String ID)
   {
	   click("btnLoginManager_XPATH");
	   wait.until(ExpectedConditions.elementToBeClickable(super.getselector("tabAddCustomer_XPATH")));
	   click("tabAddCustomer_XPATH");
	   if(driver.findElement(super.getselcetor("inputFirstName_XPATH")).isDisplayed());
	   type("inputFirstName_XPATH_XPATH",FirstName);
	   type("inputLastNAme_XPATH",LastName);
	   type("inputPostCode_XPATH",PastCode);
	   click("inputID_XPATH");
	   Alert alert =wait.until(ExpectedConditions.alertIsPresent());
	   String alertmessage = alert.getText();
	  Assert.assertTrue(validtealertmessage (alertmessage),"the customer  that you are  trying to register"+"couild not be created"+alertmessage);
	  Log.info(alertmessage); 
	   click("btnHome_XPATH");
	   testUtils.updateDatasheet(confiProperties.getProperty("filename")),confiProperties.getProperty("sheetname.custmor",getID(alertmessage));
   }
   else
   private boolean validtealertmessage(String alertmessage2) {
	// TODO Auto-generated method stub
	return false;
}
private void type(String string, String firstName) {
	// TODO Auto-generated method stub
	
}
private void click(String string) {
	// TODO Auto-generated method stub
	
}
{
	   String errorMessage ="the form  to a add customer not be found";
		  Log.info(errorMessage); 
       Assert.fail(errorMessage);
   }
}
