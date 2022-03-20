package Base;

import PageObject.HomePage;
import Utils.DriverFactory;
import Utils.DriverUtils;

public class BasePage {

   public static HomePage homePage;

   public static DriverUtils driverUtils;

public static void initPages(){
        homePage =new HomePage(DriverFactory.driver);

        driverUtils=new DriverUtils();
}

}

