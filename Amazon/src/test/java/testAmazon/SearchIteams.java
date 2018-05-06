package testAmazon;

import mainAmazon.SearchForIteams;
import org.testng.annotations.Test;

public class SearchIteams extends SearchForIteams {

    @Test
    public void searchItem (){
        searchForItems();
    }
}
