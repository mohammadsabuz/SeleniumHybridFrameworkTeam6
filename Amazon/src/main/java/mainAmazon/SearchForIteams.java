package mainAmazon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.sql.Driver;

public class SearchForIteams extends CommonAPI {

    public void searchForItems(){
        typeByCssNEnter("#twotabsearchtextbox", "ps4 games");
    }
}
