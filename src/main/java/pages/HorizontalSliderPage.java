package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

  private WebDriver driver;
  private By slider = By.xpath("//*[@id=\"content\"]/div/div/input");
  private By range = By.id("range");

  public HorizontalSliderPage(WebDriver driver) {
    this.driver = driver;
  }

  public void moveSlider(int sliderValue){
   while(!getSliderValue().equals(String.valueOf(sliderValue))){
     driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
   }
  }

  public String getSliderValue(){
    return driver.findElement(range).getText();
  }

}
