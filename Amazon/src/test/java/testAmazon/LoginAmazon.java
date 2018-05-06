package testAmazon;

import mainAmazon.LoginToAmazon;
import org.testng.annotations.Test;

public class LoginAmazon extends LoginToAmazon{

    @Test
    public void loginAmazon(){
        mainAmazonLogin();
    }
}
