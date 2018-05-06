package testFacebook;

import mainFacebook.FriendSearch;
import org.testng.annotations.Test;

public class TestFriendSearch extends FriendSearch{

    @Test
    public void searchForFriends(){
        searchFriends();
    }
}
