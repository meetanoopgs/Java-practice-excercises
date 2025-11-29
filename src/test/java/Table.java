import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.qaplayground.com/practice/simple-table");
        WebElement element = driver.findElement(By.xpath("//table[@class='w-full caption-bottom text-sm']/tbody/tr[4]/td[4]"));
        String text = element.getText();
        System.out.println(text);
        driver.quit();
    }
}
