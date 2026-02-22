package gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Set;

public class SeleniumFirstTest {
    public static void main(String[] args){
        System.out.println("hello");
        //1. create a web driver with chromedriver object,
        //2. launching the browser.
        WebDriver driver=new ChromeDriver();

        //3.navigate to urls
      //  driver.navigate().to("https://google.com");

//        driver.manage().window().minimize();
//        driver.manage().window().fullscreen();
      //  driver.manage().window().minimize();

        //to close the browser.
       // driver.close();

//the url of a browser.
       // System.out.println(driver.getCurrentUrl());

        //source code of the page
      //  System.out.println(driver.getPageSource());

//          String pageSource=driver.getPageSource();
//         String s="youtube";
//         if(pageSource.contains(s)){
//             System.out.println("haan bhai, sahi hai");
//         }
//         else
//             System.out.println("galat bhai");

         Set<String> anu=new HashSet<>(driver.getWindowHandles());
         System.out.println(anu);





    }
}
