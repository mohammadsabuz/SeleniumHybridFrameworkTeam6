package Excel;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Xls_Reader;

public class chaseExcel extends CommonAPI {
    static WebDriverWait wait = new WebDriverWait(wGeckoDriver, 10, 500);

    public static void createAccount() {
//Reading data from Excel sheet
        Xls_Reader reader = new Xls_Reader("C:\\Users\\apoor\\IdeaProjects\\SeleniumHybridFrameworkTeam6\\Bestbuy\\src\\main\\java\\TestData\\bestbuy.xlsx");

        String firstName = reader.getCellData("Sheet1", "First Name", 2);
        System.out.println(firstName);

        String lastName = reader.getCellData("Sheet1", "Last Name", 2);
        System.out.println(lastName);

        String email = reader.getCellData("Sheet1", "E-Mail Address", 2);
        System.out.println(email);

        String password = reader.getCellData("Sheet1", "Password", 2);
        System.out.println(password);

        String confirmPass = reader.getCellData("Sheet1", "Confirm Password", 2);
        System.out.println(confirmPass);

        String phone = reader.getCellData("Sheet1", "Phone Number", 2);
        System.out.println(phone);
//Enter Data to WebPage
        WebElement createAccount = null;
        wGeckoDriver.findElement(By.cssSelector("#fld-firstName")).sendKeys(firstName);
        HomePage.sleep();

        wGeckoDriver.findElement(By.cssSelector("#fld-lastName")).sendKeys(lastName);
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-e")).sendKeys(email);
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-p1")).sendKeys(password);
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-p2")).sendKeys(confirmPass);
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-phone")).sendKeys(phone);
        HomePage.sleep();
        createAccount = wGeckoDriver.findElement(By.cssSelector(".cia-form__submit-button"));
        wait.until(ExpectedConditions.visibilityOf(createAccount)); //this will wait for elememt to be visible for 20 seconds
        // createAccount.click();
    }
}



}
