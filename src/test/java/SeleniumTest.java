import jdk.jfr.Timespan;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    public static void main(String[] args) {


        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Anoop\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.switchTo().frame("callout");

        driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();

        driver.switchTo().defaultContent();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        WebElement textElement = driver.findElement(By.name("q"));
        textElement.sendKeys("java");

        Actions actions = new Actions(driver);
        actions.moveByOffset(1, 1).click().build().perform();

       driver.findElement(By.xpath("//input[text()='Google Search']")).click();


//        WebElement searchButton = driver.findElement(RelativeLocator.with(By.tagName("input")).below(textElement));
//        searchButton.click();
//        driver.close();
    }



}
