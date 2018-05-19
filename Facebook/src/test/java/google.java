package testFacebook;

import org.testng.annotations.Test;
import reporting.TestLogger;
import spreadsheetAutiomation.Google;

import java.io.IOException;

public class google extends Google {
    @Test
    public void testSearchTopic() throws IOException, InterruptedException {
        TestLogger.log(convertToString("C: " + getClass().getSimpleName()) + " - M: " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        int i = 0;
        String spreadsheetId = "1hW1k4_NTvA4KODFxojVmczmU-T3qLgAiwLlc359-mAM";
        String range = "Sheet1!A1:A5";
        searchItemByName(spreadsheetId, range);

    }

}