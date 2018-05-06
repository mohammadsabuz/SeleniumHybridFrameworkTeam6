package googleSheetMain;

import GoogleAPI.GoogleSheet;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

public class GoogleSheetMain extends CommonAPI {
    //call api methods
    public void googleSheetReader() throws IOException, GeneralSecurityException {
        List<List<Object>> expectedResults = GoogleSheet.getGoogleSheetValues();
    }
    public void searchItems(){
        driver.findElement(By.name("field-keywords")).sendKeys("Selenium Books", Keys.ENTER);
    }
}




