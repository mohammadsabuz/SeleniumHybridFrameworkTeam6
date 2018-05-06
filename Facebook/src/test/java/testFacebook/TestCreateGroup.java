package testFacebook;

import mainFacebook.CreateGroup;
import org.testng.annotations.Test;

public class TestCreateGroup extends CreateGroup {

    @Test
    public void newGroup(){
        createNewGroup();
    }
}
