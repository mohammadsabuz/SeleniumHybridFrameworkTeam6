package mainAmazon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MusicalInstruments extends CommonAPI {

    public void CategoriesMusical(){
        clickByXpath("//option[@value='search-alias=mi']");
        typeByCssNEnter("#twotabsearchtextbox", "Musical Instruments");
    }
}
