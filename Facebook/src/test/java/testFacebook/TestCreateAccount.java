package testFacebook;

import mainFacebook.CreateAccount;
import org.testng.annotations.Test;

public class TestCreateAccount extends CreateAccount {

    @Test
    public void accountSetUp(){
        createAccount();
    }
}
