package mainAmazon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MoviesTV extends CommonAPI {
    public void CategoriesMovies(){
        clickByXpath("//option[@value='search-alias=movies-tv']");
        typeByCssNEnter("#twotabsearchtextbox", "Movies & TV");
    }
}
