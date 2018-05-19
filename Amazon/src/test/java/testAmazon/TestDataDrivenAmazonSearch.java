package testAmazonDataDriven;

import mainAmazonDataDriven.DataDrivenAmazonSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestDataDrivenAmazonSearch extends DataDrivenAmazonSearch {

    @Test(dataProvider = "inputs")
    public void testDataDrivenSearch( String amazonSearch) {
        clickByXpath("//option[@value='search-alias=mi']");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(amazonSearch, Keys.ENTER);
    }
}
