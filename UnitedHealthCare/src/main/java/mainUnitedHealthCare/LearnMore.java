package mainUnitedHealthCare;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class LearnMore extends CommonAPI {

    String learn = "https://www.uhc.com/individual-and-family/member-resources/health-care-tools/virtual-visits";
    public void VirtualVisit(){
        wChromeDriver.get(learn);
        wChromeDriver.findElement(By.xpath("//*[@id='leftnavmenu']/li/ul/li[2]/a/span")).sendKeys("Health4Me");

    }

}
