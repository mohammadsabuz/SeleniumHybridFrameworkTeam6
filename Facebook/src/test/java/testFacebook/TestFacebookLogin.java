package testFacebook;

import mainFacebook.FacebookLogin;
import org.testng.annotations.Test;

public class TestFacebookLogin extends FacebookLogin{

    @Test
    public void facebookLogin(){
        login();
    }
}
