package mainFacebook;

import base.CommonAPI;

public class SetCoverPic extends CommonAPI {

    public void setCoverPhoto(){
        clickOnCss("#u_0_a > div:nth-child(1) > div:nth-child(1) > div > a > span > span");
        clickOnCss("#u_fetchstream_6_7 > i");
    }
}
