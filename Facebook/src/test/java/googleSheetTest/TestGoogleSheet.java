package googleSheetTest;

import googleSheetMain.GoogleSheetMain;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class TestGoogleSheet extends GoogleSheetMain {

    @Test
    public void testGoogleSheet() throws IOException, GeneralSecurityException {
        GoogleSheetMain gsm = new GoogleSheetMain();
        gsm.googleSheetReader();
    }
}
