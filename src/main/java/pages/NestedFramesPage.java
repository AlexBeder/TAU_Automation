package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
  WebDriver driver;
  private String topFrame = "frame-top";
  private String leftFrame = "frame-left";
  private String bottomFrame = "frame-bottom";
  private By textInFrame = By.xpath("/html/body");

  public NestedFramesPage(WebDriver driver){
    this.driver=driver;
  }

  public String getTextFromLeftFrame(){
    driver.switchTo().frame(topFrame);
    driver.switchTo().frame(leftFrame);
    String text = driver.findElement(textInFrame).getText();
    driver.switchTo().parentFrame();
    driver.switchTo().parentFrame();
    return text;
  }

  public String getTextFromBottomFrame(){
    driver.switchTo().frame(bottomFrame);
    String text = driver.findElement(textInFrame).getText();
    driver.switchTo().parentFrame();
    return text;
  }


}
