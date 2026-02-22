package gettingStarted;

import extensions.gettingDoneHere;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CreateNewUserPge;
import pages.EmployeeListPge;
import pages.HomePge;
import pages.LoginPge;

public class ForFirefox {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
//        driver.navigate().to("https://www.facebook.com");
//        System.out.println(driver.getPageSource());
//        System.out.println(driver.getWindowHandles());

        driver.navigate().to("http://eaapp.somee.com/");

        HomePge h=new HomePge(driver);
        LoginPge pge=h.clickLogin();
        HomePge ho =pge.logginIn("admin","password");
        EmployeeListPge emp= ho.clickEmployeeList();
        CreateNewUserPge p=emp.nyaUser();
        EmployeeListPge em=p.newwUser("ritik","67","78900","sgh@hfb.com",3);
      //  p=emp.nyaUser();





//        loginIn(driver);
//
//       AddUser(driver);
//        for(var handle: driver.getWindowHandles()){
//            System.out.println(handle);
//        }


       // System.out.println(driver.getTitle());
       //  LogOut(driver);

    }
    public static void LogOut(WebDriver driver){
        By off=By.linkText("Log off");
        WebElement OffEle=driver.findElement(off);
        OffEle.click();
    }

    public static void loginIn(WebDriver driver){

        gettingDoneHere.gettinLogin(driver,driver.findElement(By.id("loginLink")));

        gettingDoneHere.AddingCredentialsText(driver,By.id("UserName"),"admin");
        gettingDoneHere.AddingCredentialsPassword(driver,By.name("Password"),"password");
        gettingDoneHere.LoginInButton(driver,By.cssSelector(".btn"));

//        //CLICK THE LOGIN LINK
//        //identify the login link by using its id as locators
//
//        //  By loca=By.id("loginLink");
//        // pass this locator to web driver to perform operation
//
//        //now, if now id is given, use Link "text"
//        By loca=By.linkText("Login");
//
//        // driver.findElement(loca);
//
//        //perform operation on the ui., clicking
//
//        WebElement ele=driver.findElement(loca);
//
//        ele.click();
//
//
//        WebElement inputEle=driver.findElement(By.id("UserName"));
//
//        inputEle.sendKeys("admin");
//       WebElement submitEle=driver.findElement(By.id("LoginIn"));
//      submitEle.submit();
//
//        WebElement PssEle=driver.findElement(By.name("Password"));
//
//        PssEle.sendKeys("password");
//        try{
//            By sub=By.cssSelector(".btn");
//            WebElement subEle=driver.findElement(sub);
//            subEle.submit();
//  //subEle.click();//this also works., submitting the form
//            System.out.println("ound");
//        }
//        catch( Exception err){
//            System.out.println("not found");
//        }

    }

    public static void AddUser(WebDriver driver){
        By emplist=By.linkText("Employee List");
        WebElement empList=driver.findElement(emplist);
        empList.click();

        WebElement createNew=driver.findElement(By.linkText("Create New"));
        createNew.click();
        driver.findElement(By.id("Name")).sendKeys("pandit Singh");

        driver.findElement(By.name("DurationWorked")).sendKeys("40");
        driver.findElement(By.name("Email")).sendKeys("dj32@gmail.com");
        driver.findElement(By.id("Salary")).sendKeys("100002");

//        gettingDoneHere.SelectingDropByVisibleText(driver,By.id("Grade"),"Middle");
//        gettingDoneHere.SelectingDropByValue(driver,By.id("Grade"),"3");
        gettingDoneHere.SelectingDropByindex(driver,By.id("Grade"),3);

//Select selectGrade=new Select(driver.findElement(By.id("Grade")));
//selectGrade.selectByVisibleText("Middle");

        By sub1=By.cssSelector(".btn");
        WebElement subEle1=driver.findElement(sub1);
        subEle1.submit();
//        if(driver.findElement(By.xpath("//span[text()='The Salary field is required.']")).isDisplayed()){
//            driver.findElement(By.id("Salary")).sendKeys("100002");
//            driver.findElement(By.cssSelector(".btn")).submit();
//        }



    }
}
