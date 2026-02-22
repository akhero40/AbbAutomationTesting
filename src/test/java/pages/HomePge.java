package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//this POM, page object model code for Home Page.
public class HomePge {

    private WebDriver driver;
    public HomePge(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private By lnkLink=By.linkText("Login");
    private By lnkEmployeeList=By.linkText("Employee List");
@FindBy(linkText = "Log off")
private WebElement loggOFF;

public void LogOff(){
    loggOFF.submit();

}

    public LoginPge clickLogin(){
        driver.findElement(lnkLink).click();
        return new LoginPge(driver);
    }

    public EmployeeListPge clickEmployeeList(){
        driver.findElement(lnkEmployeeList).click();
        return new EmployeeListPge(driver);
    }
}
