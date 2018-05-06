package testFacebook;

import mainFacebook.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{

    @Test
    public void home(){
        goHome();
    }
}
