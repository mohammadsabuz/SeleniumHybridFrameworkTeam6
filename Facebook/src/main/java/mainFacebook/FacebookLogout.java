package mainFacebook;

import base.CommonAPI;

public class FacebookLogout extends CommonAPI {

    public void facebookSignOut(){
        clickOnCss("#userNavigationLabel");
        clickOnCss("#js_v7 > div > div > ul > li._54ni.navSubmenu._6398._64kz.__MenuItem > a > span > span");
    }
}
