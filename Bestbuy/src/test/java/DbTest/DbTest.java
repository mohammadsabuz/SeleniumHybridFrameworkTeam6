package DbTest;

import Database.ConnectDB;
import commonAPI.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class DbTest extends CommonAPI {
    String SearchItem = "laundry";
    WebElement search;
    @BeforeTest
    public void dbConnection() throws SQLException, IOException, ClassNotFoundException {
        ConnectDB.connectToMySql();
    }

    @Test
    public void readData() throws Exception {
        List <String> searchItems = ConnectDB.readDataBase("testdata","searchItems");
        System.out.println(searchItems);
    }

    @Test
    public void searchItem() throws InterruptedException {
        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        wGeckoDriver.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys(SearchItem);
        Thread.sleep(2000);
        wGeckoDriver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[2]/span")).click();
        Thread.sleep(2000);

    }

@Test
    public void insertDataFromStringToMySql() throws Exception {
        ConnectDB.insertDataFromStringToMySql(SearchItem,"testdata","searchItems");
    readData();
}

   }
