package mainUnitedHealthCare;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class BrowseToUHC extends  CommonAPI{

    String uhcURL = "https://www.uhc.com/";
//    String plans = "https://www.aarpmedicareplans.com";



    public void uhcBrowserLaunch(){
            wChromeDriver.get(uhcURL);

    }
        public void employer() {
        uhcBrowserLaunch();
        wChromeDriver.findElement(By.xpath("//*[@id[span]Employers/span>")).click();

            }

        public void loginpage(){
        uhcBrowserLaunch();
        wChromeDriver.findElement(By.xpath("//*[@id='loginmenubutton']")).click();

        }

        public void home(){
        uhcBrowserLaunch();
        wChromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[1]/a")).click();

        }


}

