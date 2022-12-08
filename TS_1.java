package Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import Genericscripts.Base_Test;
import Genericscripts.Genericfetchdatafromexcel;
import Pomscripts.Pomfb;

public class TS_1 extends Base_Test {
    
	 @Test
     public void script() throws EncryptedDocumentException, IOException
     {
  	   String username = Genericfetchdatafromexcel.getData("sheet1",0,0);
  	   String password = Genericfetchdatafromexcel.getData("sheet1",1,0);
  	   
  	 
       Pomfb pmc = new Pomfb(driver);
  	   pmc.username(username);
  	   pmc.pwdbox(password);
  	   Assert.fail();
  	   pmc.clicklogin();
  
    	   
    	   
       }
       
	
	
	
}
