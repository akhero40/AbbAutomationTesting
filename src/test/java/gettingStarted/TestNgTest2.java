package gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CreateNewUserPge;
import pages.EmployeeListPge;
import pages.HomePge;
import pages.LoginPge;

public class TestNgTest2 {//double playbutton, shows intellij, we are performing "UNIT TESTING"
private WebDriver driver;
private LoginPge pge;
private HomePge h;

    @BeforeTest
    public void ruNbeforeTest(){
        driver=new ChromeDriver();
        driver.navigate().to("http://eaapp.somee.com/");
        System.out.println("testing login");
        h=new HomePge(driver);
        pge=h.clickLogin();
    }
//@BeforeMethod
//public void runbeforeveryMethod(){
//        System.out.println("hell u are");
//}


    @Test//i can marks any method to represent it as unit test.
    public void testCreateUser(){
        System.out.println("testing login22");
       h=pge.logginIn("admin","password");
        EmployeeListPge emp= h.clickEmployeeList();
        CreateNewUserPge p=emp.nyaUser();
        EmployeeListPge em=p.newwUser("ritik","67","78900","sgh@hfb.com",3);

    }



    @AfterTest
    public void AfterExcution(){
        h.LogOff();
        System.out.println("quitting");
        driver.quit();
    }


}
