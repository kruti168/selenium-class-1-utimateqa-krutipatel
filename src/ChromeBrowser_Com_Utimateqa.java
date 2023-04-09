import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_Com_Utimateqa {

    public static void main(String[] args) {

        //launch the chrome browser
        WebDriver driver = new ChromeDriver();

        //Open Url into the Browser
        driver.get("https://courses.ultimateqa.com/users/sign_in");

        //Maximise the Browser
        driver.manage().window().maximize();

        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print title of page
        System.out.println("Title of page :\t\t\t" + driver.getTitle());

        //Print current url
        System.out.println("Current Url :\t\t\t " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :\t\t\t" + driver.getPageSource());

        //Find email field and Type email into email field
        driver.findElement(By.id("user[email]")).sendKeys("kruti@gamil.com");

        //Type password into password filed
        driver.findElement(By.id("user[password]")).sendKeys("kruti123");

        //Close the Browser
        driver.close();

    }
}
