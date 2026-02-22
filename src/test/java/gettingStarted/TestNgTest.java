package gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateNewUserPge;
import pages.EmployeeListPge;
import pages.HomePge;
import pages.LoginPge;

public class TestNgTest {//double playbutton, shows intellij, we are performing "UNIT TESTING"
private WebDriver driver;
private LoginPge pge;
private HomePge h;

    @BeforeTest
    public void ruNbeforeTest(){
        driver=new ChromeDriver();
        driver.navigate().to("http://eaapp.somee.com/");
    }
//@BeforeMethod
//public void runbeforeveryMethod(){
//        System.out.println("hell u are");
//}
    @Test     //i can marks any method to represent it as unit test.
    public void testLogin(){
        System.out.println("testing login");
        h=new HomePge(driver);
         pge=h.clickLogin();
    }

    @Test(dataProvider = "EmployeeDetails")//i can marks any method to represent it as unit test.
    public void testCreateUser(String name,String duration,String mail,String sal,int i){
        System.out.println("testing login22");
       h=pge.logginIn("admin","password");
        EmployeeListPge emp= h.clickEmployeeList();
        CreateNewUserPge p=emp.nyaUser();
        EmployeeListPge em=p.newwUser(name,duration,sal,mail,i);

    }
    @DataProvider(name="EmployeeDetails")
    public static Object[][] EmployeeData(){
        return new Object[][]{
                new Object[]{
                        "rohan","999","ddtuser@yahoo.com","9000",2
                }
        };
    }



    @Test
    public void loggingOff(){
      h.LogOff();

    }

    @AfterTest
    public void AfterExcution(){
        System.out.println("quitting");
        driver.quit();
    }


}
