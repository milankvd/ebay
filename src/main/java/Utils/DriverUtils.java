package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriverUtils {


    public static void navigateToUrl(String url)
        {
            DriverFactory.driver.navigate().to(url);
        }


        public static void pageRefresh()
        {
            DriverFactory.driver.navigate().refresh();
        }


        public String getPageTitle()
        {
            return DriverFactory.driver.getTitle();
        }


        public  void selectUsingVisibility(WebElement element, String text)
        {
            Select select = new Select(element);
            select.selectByVisibleText(text);

        }

        public  void selectUsingValue(WebElement element, String text)
        {
            Select select = new Select(element);
            select.selectByValue(text);

        }

        public  void selectUsingIndex(WebElement element, int index)
        {
            Select select = new Select(element);
            select.selectByIndex(index);

        }


        public  String getEleText(WebElement element)
        {
            return element.getText();
        }
    }


