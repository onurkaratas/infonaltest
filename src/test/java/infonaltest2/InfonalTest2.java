package infonaltest2;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This project was created
 * for infonal test homework.
 */
public class InfonalTest2
{
    /**
     * 
     *
     * InfonalTest2 name of the test case
     */
 
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://www.yandex.com.tr/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
    }

    /**
     * @return the suite of tests being tested
     */
	  
	  
	  
	  @Test
	  public void testInfonalTest2() throws Exception {
	    driver.get("http://www.n11.com/");
	    assertEquals("n11.com - Alışverişin Uğurlu Adresi", driver.getTitle());
	    driver.findElement(By.linkText("Giriş Yap")).click();
	    assertEquals("Giriş Yap - n11.com", driver.getTitle());
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("testotomasyon1@outlook.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("123456ot");
	    driver.findElement(By.id("loginButton")).click();
	    driver.findElement(By.id("searchData")).click();
	    driver.findElement(By.id("searchData")).clear();
	    driver.findElement(By.id("searchData")).sendKeys("samsung");
	    driver.findElement(By.cssSelector("span.icon.iconSearch")).click();
	    try {
	      assertEquals("Samsung", driver.findElement(By.cssSelector("div.resultText > h1")).getText());
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.linkText("2")).click();
	    assertEquals("2", driver.findElement(By.name("currentPage")).getAttribute("value"));
	    driver.findElement(By.xpath("//li[3]/div/div[2]/span[2]")).click();
	    String kontrol1 = driver.findElement(By.xpath("//li[3]/div/div/a/h3")).getText();
	    driver.findElement(By.linkText("Hesabım")).click();
	    assertEquals("Hesabım - n11.com", driver.getTitle());
	    driver.findElement(By.xpath("(//a[contains(text(),'Favorilerim')])[2]")).click();
	    assertEquals("Favorilerim - n11.com", driver.getTitle());
	    assertEquals(kontrol1, driver.findElement(By.xpath("//td[3]/p/a")).getText());
	    System.out.println("değer = " + kontrol1);
	    driver.findElement(By.linkText("Kaldır")).click();
	  }
	  
	  
	  
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	
    public InfonalTest2()
    {
        assertTrue( true );
    }
}
