package extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class gettingDoneHere {

    public static void gettinLogin(WebDriver driver, WebElement web){
        web.click();
    }
    public static void AddingCredentialsText(WebDriver driver,By loc,String name){
        driver.findElement(loc).sendKeys("bastard");
        driver.findElement(loc).click();
        driver.findElement(loc).clear();
        driver.findElement(loc).sendKeys(name);

    }
    public static void AddingCredentialsPassword(WebDriver driver,By loc,String name){

        driver.findElement(loc).sendKeys(name);

    }
    public static void LoginInButton(WebDriver driver,By loc){

        driver.findElement(loc).submit();

    }
    public static void SelectingDropByVisibleText(WebDriver driver,By loc,String value){
        Select sel=new Select(driver.findElement(loc));
        sel.selectByVisibleText(value);

    }
    public static void SelectingDropByValue(WebDriver driver,By loc,String value){
        Select sel=new Select(driver.findElement(loc));
        sel.selectByValue(value);

    }
    public static void SelectingDropByindex(WebDriver driver, By loc, int val){
        Select sel=new Select(driver.findElement(loc));
        sel.selectByIndex(val);

    }



}
