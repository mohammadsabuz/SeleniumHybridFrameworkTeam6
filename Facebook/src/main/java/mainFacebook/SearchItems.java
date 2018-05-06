package mainFacebook;

import base.CommonAPI;

public class SearchItems extends CommonAPI {

    public void itemSearch(){

        clickByXpath("//*[@id='u_g_2']/input[2]");
        clickByXpath("//*[@id='navItem_2344061033']/a/div");
    }
}
