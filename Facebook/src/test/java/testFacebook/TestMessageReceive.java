package testFacebook;

import mainFacebook.MessageReceive;
import org.testng.annotations.Test;

public class TestMessageReceive extends MessageReceive {

    @Test
    public void receiveMessage(){
        messageReceive();
    }
}
