package mainAmazon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class OfficeProducts extends CommonAPI {

    public void CategoriesOfficeProducts(){
        clickByXpath("//option[@value='search-alias=office-products']");
        typeByCssNEnter("#twotabsearchtextbox", "Office Products");
    }
}
