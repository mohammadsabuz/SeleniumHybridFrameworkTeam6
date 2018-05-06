package mainFacebook;

import base.CommonAPI;



public class FriendSearch extends CommonAPI {

    public void searchFriends(){
        typeByXpathNEnter("//*[@id='email']", " Team6.selenium@gmail.com");
        typeByXpathNEnter("//*[@id='pass']", "team612345");
        typeByXpath("//*[@id='u_0_4']", "login");
        clickById("#findFriendsNav");
    }
}
