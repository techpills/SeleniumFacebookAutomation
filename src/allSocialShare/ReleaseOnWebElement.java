package allSocialShare;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ReleaseOnWebElement
{
public static void main(String... args) throws InterruptedException
{

//Invoke FirefoxBrowser	
WebDriver dr = new FirefoxDriver();

//Login drive.google.com with user id and password
dr.get("https://www.drive.google.com");
dr.findElement(By.id("Email")).sendKeys("onlytest628");
dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
dr.findElement(By.id("next")).click();
dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
dr.findElement(By.id("Passwd")).sendKeys("steverock@123");
Thread.sleep(1000);
dr.findElement(By.id("signIn")).click(); 
Thread.sleep(5000);

//Assign the webelement into variables
WebElement xyAxisPoint = dr.findElement(By.className("k-v-ta-za-Ln-vd"));
WebElement moveHere = dr.findElement(By.className("k-v-M"));

//click and hold the file(webelement) then move to the folder(on another webelement)
Actions builder = new Actions(dr);
builder.clickAndHold(xyAxisPoint)
.release(moveHere)
.perform();

}
}