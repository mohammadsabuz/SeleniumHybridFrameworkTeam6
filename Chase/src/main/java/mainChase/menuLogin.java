package mainChase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class menuLogin extends CommonAPI {

    String chaseURL = "https://www.chase.com/";

    public void loginToChase(){
       clickByXpath("//header[@data-feature='header']//a[@id='skip-sidemenu']");
       clickOnCss(".chaseanalytics-track-link.signInBtn");


    }
}



