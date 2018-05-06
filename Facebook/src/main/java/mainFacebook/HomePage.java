package mainFacebook;

import base.CommonAPI;

public class HomePage extends CommonAPI{

    public void goHome(){
        typeByXpathNEnter("//*[@id='email']", " Team6.selenium@gmail.com");
        typeByXpathNEnter("//*[@id='pass']", "team612345");
        typeByXpathNEnter("//*[@id='u_0_4']", "login");
        typeByXpathNEnter("//*[@id='u_0_c']/a","Home");
    }
}
