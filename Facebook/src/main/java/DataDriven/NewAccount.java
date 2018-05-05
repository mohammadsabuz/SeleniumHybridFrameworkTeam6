package DataDriven;

import base.CommonAPI;
import utility.Xls_Reader;

public class NewAccount extends CommonAPI {

    // Reading data from Exel sheet

    public void newAccount(){
        Xls_Reader reader = new Xls_Reader("\\Users\\shafiq\\IdeaProjects\\New Project\\SeleniumHybridFrameworkTeam6\\Facebook\\src\\main\\java\\TestData\\facebook.xlsx");

        String firstName = reader.getCellData("Sheet1","FirstName", 1);
        System.out.println(firstName);

        String lastName = reader.getCellData("Sheet1","LastName", 1);
        System.out.println(lastName);

        String email = reader.getCellData("Sheet1","email", 1);
        System.out.println(email);

        String birthday = reader.getCellData("Sheet1","Birthday", 1);
        System.out.println(birthday);

        String gender = reader.getCellData("Sheet1","Gender", 1);
        System.out.println(gender);

        //  Enter data to WebPage
    }
}
