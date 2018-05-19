package mainAmazonCommonsEmail;

import base.CommonAPI;

public class AmazonTestFail extends CommonAPI {

    public void failTestOnPurpose(){
        clickByXpath("wrongPath");
    }
}
