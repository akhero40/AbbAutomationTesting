package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPge {
    private WebDriver driver;
    public EmployeeListPge(WebDriver driver){
        this.driver=driver;
    }
    private By createNew=By.linkText("Create New");

    public CreateNewUserPge nyaUser(){
        driver.findElement(createNew).click();
        return new CreateNewUserPge(driver);
    }
}
