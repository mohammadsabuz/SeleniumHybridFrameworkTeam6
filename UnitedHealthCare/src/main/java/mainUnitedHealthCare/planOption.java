package mainUnitedHealthCare;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class planOption extends CommonAPI {

    String plans = "https://www.aarpmedicareplans.com";

    public void Myplans() {
        wChromeDriver.get(plans);
        wChromeDriver.findElement(By.xpath("//*[@id='main-content']/div[3]/div[2]/div/div/div[3]/div/div/div/div/div/div/div/div/p/span")).click();
    }
    public void individualAndFamily(){
        Myplans();
        wChromeDriver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[1]/div/div[2]/div/div/p[2]/a/span")).click();
    }
    public void plans(){
        individualAndFamily();
        wChromeDriver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[1]/div/div[2]/div/div/p[2]/a/span")).click();
    }

    public void shortTerms(){
        individualAndFamily();
        wChromeDriver.findElement(By.xpath("//*[@id='leftnavmenu']/li/ul/li[2]/ul/li[2]/a")).click();
    }
    public void dentalIns(){
        individualAndFamily();
        wChromeDriver.findElement(By.xpath("//*[@id='leftnavmenu']/li/ul/li[2]/ul/li[3]/a/span")).click();

    }

    public void AArp(){
        wChromeDriver.get(plans);
        wChromeDriver.findElement(By.xpath("//*[@id='ghn_lnk_1']/span")).click();

    }
    public void OURplan(){
        AArp();
        wChromeDriver.findElement(By.xpath("//*[@id='theme/uch/mir] page/plans/landing mobile/van/closed'"));

    }

}
