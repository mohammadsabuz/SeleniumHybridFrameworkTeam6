package mainAmazon;

import base.CommonAPI;
import org.openqa.selenium.By;

import java.sql.Driver;

public class CategoriesDropDown extends CommonAPI {

    public void mainCategoriesdrop(){
        clickByXpath("//select[@aria-describedby='searchDropdownDescription']");
    }
}
