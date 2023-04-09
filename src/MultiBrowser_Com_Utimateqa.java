import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_Com_Utimateqa {

    static String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        //Give Implicitly wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the title of page
        System.out.println("Title of page :\t\t\t" + driver.getTitle());

        //Print the current Url
        System.out.println("Current URl : \t\t\t" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source \t\t\t" + driver.getPageSource());

        //Find email filed and Type email into email field
        driver.findElement(By.name("user[email]")).sendKeys("kruti@gmail.com");

        //Type password into password field
        driver.findElement(By.name("user[password]")).sendKeys("kruti123");

        //Close the Browser
        driver.close();
    }
}
