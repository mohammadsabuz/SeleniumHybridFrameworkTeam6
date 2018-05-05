package testUnitedHealthCare;

import mainUnitedHealthCare.planOption;
import org.testng.annotations.Test;


public class findmyplansTest extends planOption {


    @Test
    public void plans(){
        Myplans();
 System.out.println(" P test 1");
    }
    @Test
    public void AArpTest(){
        AArp();
        System.out.println(" P test 2");
    }

    @Test
    public void OURplanTest(){
        OURplan();
        System.out.println(" P test 3");
    }
}
