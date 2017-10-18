package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class BasePage {
  public static WebDriver driver;
  public static boolean bResult;

  public BasePage(WebDriver driver){
    BasePage.driver = driver;
    BasePage.bResult = true;
  }

  public static boolean isElementPresent(WebElement element){
    try{
      //driver.findElement(element)
      element.isDisplayed();
      return true;
    }catch(NoSuchElementException e){
      return false;
    }
  }
}
