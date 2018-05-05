package mainAmazon;

import base.CommonAPI;
import org.openqa.selenium.By;

public class Search extends CommonAPI{

    public void FindSearchbar(){
        getTextById("twotabsearchtextbox");
    }
}
