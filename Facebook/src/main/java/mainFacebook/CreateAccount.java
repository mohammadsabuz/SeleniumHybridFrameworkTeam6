package mainFacebook;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class CreateAccount extends CommonAPI{


    public void createAccount(){

        typeByXpathNEnter("//*[@id='u_0_o']]","Team6");
        typeByXpathNEnter("//*[@id='u_0_q']","abcd");
        typeByXpathNEnter("//*[@id='u_0_t']", "abcd@gmail.com");
    }
}
