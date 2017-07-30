package FB_AutoPost_Groups;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.lang.reflect.InvocationTargetException; 
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.openqa.selenium.*;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

import org.openqa.selenium.firefox.FirefoxDriver;

//import com.gargoylesoftware.htmlunit.BrowserVersion;

 
public class fb_group_post {
	private static XSSFCell cell;
	private static XSSFRow row;
	private static WebDriver driver = null;
 private static String path = "C://Selenium//sheets//fbgrouplist.xlsx";

  
 public static void main(String[] args) throws InterruptedException {   
 //Create a new instance of the Chrome driver   s
 //System.setProperty("webdriver.chrome.driver", "C://Selenium_Training//chromedriver.exe");
	// Create a new instance of the Chrome driver   w
		//System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); 

	// File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	// FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	// FirefoxProfile firefoxProfile = new FirefoxProfile();       
	// WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
	 System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");
 //WebDriver driver=new FirefoxDriver();
 
 ProfilesIni profile = new ProfilesIni();

	FirefoxProfile myprofile = profile.getProfile("Buffer");

	driver = new FirefoxDriver(myprofile);
 
 //WebDriver driver=new ChromeDriver();
driver.get("https://goo.gl/PyBJdN");
 
//alert.dismiss();
 //WebDriverWait wait = new WebDriverWait(driver, 20);
//driver.switchTo().activeElement().click();

//driver.switchTo().alert().accept();
 //Accepting alert.
 //alert.accept();
//driver.findElement(null).sendKeys(Keys.ESCAPE);
// Random randomGenerator = new Random();
 //int randomInt = randomGenerator.nextInt(100);
 
 //Thread.sleep(randomInt);	
 //Thread.sleep(1000);
 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 
 try { 
 FileInputStream file = new FileInputStream(new File(path)); 
 XSSFWorkbook workbook = new XSSFWorkbook(file); 
 XSSFSheet sheet = workbook.getSheetAt(0); 
  
   //for (int i =101; i <= sh	eet.ge	tLastRowNum(); i++)
	   for (int i=62; i <=80; i++)
    	 {
		   String keyword = sheet.getRow(i).getCell(0).getStringCellValue( );
		     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


		   driver.navigate().to("https://www.facebook.com/v2.4/dialog/share?redirect_uri=https%3A%2F%2Fwww.youtube.com%2Ffacebook_redirect&display=popup&href=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DqN6JzIzL_tI%26feature%3Dshare%26list%3DPLLKmTFb-30Onzcxa-T-mc_pAyOnxywDAJ%26index%3D30&client_id=87741124305&ret=login&ext=1500960027&hash=AeZIVnS5_0Lk48GW");

		   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		   WebElement selectGroup = (new WebDriverWait(driver, 100))
				   .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._p._55pi._5vto._55_p._2agf._4jy0._4jy3._517h._51sy._42ft")));
		   selectGroup.click();
		   //driver.findElement(By.cssSelector("._p._55pi._5vto._55_p._2agf._4jy0._4jy3._517h._51sy._42ft")).click();
		   //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   WebElement selectMenuItem = (new WebDriverWait(driver, 100))
				   .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._54ni._42ym._2n3i.__MenuItem"))); 
		   selectMenuItem.click();
		   //driver.findElement(By.cssSelector("._54ni._42ym._2n3i.__MenuItem")).click();
		   //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   WebElement selectAudienceGroup = (new WebDriverWait(driver, 100))
				   .until(ExpectedConditions.presenceOfElementLocated(By.id("audience_group"))); 
		   selectAudienceGroup.click();
		   //driver.findElement(By.id("audience_group")).click();
		   selectAudienceGroup.sendKeys(keyword);
//driver.findElement(By.id("audience_group")).sendKeys(keyword);
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//driver.findElement(By.id("audience_group")).click();
//WebElement groupname = driver.findElement(By.id("audience_group")); 
//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   WebElement clickPost = (new WebDriverWait(driver, 100))
				   .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._599p>span"))); 
		   clickPost.click();		   
//driver.findElement(By.cssSelector("._599p>span")).click();            
             
             driver.findElement(By.name("__CONFIRM__")).click();
             System.out.println("No." +i+ " Posted on Group Name: " +keyword);             
             Thread.sleep(25000);

                 
             //driver.findElement(By.cssSelector(".UFILikeLinkIcon.img.sp_CyzWktPCcmJ.sx_5a6285")).click();
             
        
         //CLICK post Button             
  
         //driver.findElement(By.tagName("textarea")).sendKeys(Keys.chord(Keys.CONTROL + "v"));

         //WaitforSometime
         //Thread.sleep(randomInt);
     
     }
 
	   workbook.close(); 
       file.close(); 
     } catch (FileNotFoundException fnfe) { 
     fnfe.printStackTrace(); 
     } catch (IOException ioe) { 
     ioe.printStackTrace(); 
     } 
     } 
     }