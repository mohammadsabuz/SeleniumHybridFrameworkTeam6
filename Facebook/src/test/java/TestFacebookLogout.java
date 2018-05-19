package testFacebook;

import mainFacebook.FacebookLogout;
import org.testng.annotations.Test;

public class TestFacebookLogout extends FacebookLogout{

    @Test
    public void logOut(){
        facebookSignOut();
    }
}
