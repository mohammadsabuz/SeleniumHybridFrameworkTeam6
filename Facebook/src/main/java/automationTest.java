package spreadsheetAutiomation;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import spreadsheetAutiomation.GoogleSheetAPI;

public class automationTest {

    public WebDriver driver;
    public WebDriverWait wait;
    String appURL = "www.facebook.com";

    private String spreadsheetId = "1SQigo_OfhRI2jbMwSjzzGD0DIvfdvPzbbBS4tmzWEkc";
    private String range = "Sheet1!A2:D";
    String userName = "team6.selenium@gmail.com";
    String password = "team612345";

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","/Users/shafiq/IdeaProjects/NewWebAutomationTeam6/Generic/browser-driver/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    //Verify user profile information after login
    @Test
    public void verifyProfileInfo() throws IOException {
//        login(userName,password);
        String[] userProfileInfo = getProfileInfo();
        List<String> userData = Arrays.asList(userProfileInfo);
        //Get data from sheet  and verify first profile info of john
        GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
        List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);
        for (List<Object> row : values) {
            if(row.get(0).equals(userName)) {
                Assert.assertEquals(userData, row);
                break;
            }
        }
    }

    public String[] getProfileInfo() {
        //Navigate to Profile page
//        driver.findElement(By.id("user-profile")).click();
        String firstName = driver.findElement(By.id("Firstname")).getText();
        String lastName = driver.findElement(By.id("Lastname")).getText();
        String StudentID = driver.findElement(By.id("StudentID")).getText();
        String Email = driver.findElement(By.id("Email")).getText();
        String[] arrayUserInfo = {firstName, lastName,StudentID,Email};
        return arrayUserInfo;
    }

//    public void login(String userName, String password) {
//        driver.findElement(By.id("session_key-login")).sendKeys(userName);
//        driver.findElement(By.id("session_password-login")).sendKeys(password);
//        driver.findElement(By.id("signin")).click();
//    }

//    @AfterClass
//    public void tearDown() {
//        if(driver!=null) {
//            driver.quit();
//        }
//    }

}