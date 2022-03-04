import org.junit.Assert;
import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DesafioDos {
    private String url = PropertiesFile.getProperty("url");
    private WebDriver driver = DriverFactory.getDriver();


    @Test
    public void DesafioClaseDos() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        String Precio, Laptop;


        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div#tbodyid>div:nth-child(1)>div>a")).click();
        Thread.sleep(2000);


       Precio = driver.findElement(By.cssSelector("h2.name")).getText();
       Laptop = driver.findElement(By.cssSelector("h3.price-container")).getText();
       System.out.println(Precio + Laptop);

        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);


        driver.quit();

    }
}
