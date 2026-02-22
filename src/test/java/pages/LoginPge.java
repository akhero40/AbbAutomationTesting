package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPge {
    private WebDriver driver;


    public LoginPge(WebDriver driver){
        this.driver=driver;
    }
    private By userName= By.id("UserName");
    private By passWord=By.name("Password");
    private By button=By.cssSelector(".btn");

    public HomePge logginIn(String user,String pass){
        driver.findElement(userName).sendKeys(user);
        driver.findElement(passWord).sendKeys(pass);
        driver.findElement(button).click();

        return new HomePge(driver);
    }

}
