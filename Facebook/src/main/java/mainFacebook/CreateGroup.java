package mainFacebook;

import base.CommonAPI;

public class CreateGroup extends CommonAPI {

    public void createNewGroup(){
        clickOnCss("#userNavigationLabel");
        clickOnCss("#js_wo > div > div > ul > li:nth-child(3) > a > span > span");
    }
}
