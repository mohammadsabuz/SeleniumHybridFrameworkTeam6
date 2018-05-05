package testUnitedHealthCare;

import mainUnitedHealthCare.BrowseToUHC;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowseUHC extends BrowseToUHC {

        String uhcURL = "https://www.uhc.com/";
        String plans = "https://www.aarpmedicareplans.com";
        String logTomyuch = "https://www.myuhc.com/member/prewelcome.do";

        @BeforeMethod
        public void before() {
            System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
            wChromeDriver = new ChromeDriver();
            wChromeDriver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            wChromeDriver.get(uhcURL);
            wChromeDriver.manage().window().maximize();

        }
            @Test
            public void uhcLogin () {
                wChromeDriver.get(uhcURL);
//                wChromeDriver.findElement(By.xpath("//div[@class='login section']//button[@id='loginmenubutton']")).click();
                System.out.println("working 1" );
            }

           @Test
            public void homein () {
                wChromeDriver.get(uhcURL);
//                wChromeDriver.findElement(By.xpath("//div[@class='login section']//button[@id='loginmenubutton']")).click();
               System.out.println("working 2");

            }

            @Test
            public void home () {
                wChromeDriver.get(uhcURL);
                System.out.println("working 3");

            }


            @Test
            public void getinToMyuch () {
                wChromeDriver.get(logTomyuch);
                System.out.println("working 4");

            }

        }


