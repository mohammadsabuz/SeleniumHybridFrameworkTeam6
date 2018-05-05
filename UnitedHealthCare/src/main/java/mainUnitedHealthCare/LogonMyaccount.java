package mainUnitedHealthCare;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LogonMyaccount extends CommonAPI {

    String uhcURL = "https://www.uhc.com/";

    public void uhcLogin() {
        wChromeDriver.get(uhcURL);
        wChromeDriver.findElement(By.xpath("//div[@class='login section']//button[@id='loginmenubutton']")).click();
    }
        public void searchItems(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='q']")).sendKeys("Pharmacy", Keys.ENTER);
        }

        public void medicareSearch(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[4]/a")).click();
        }
        public void findingDoctor(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id=\"topnavmenu\"]/li[5]/a")).click();
        }
        public void individualAndFamily(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[2]/a")).click();
        }


        public void answerFinding(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='main-content']/div[3]/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/p/span/a")).click();
        }


    }


