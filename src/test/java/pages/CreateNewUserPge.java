package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v142.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPge {

    private WebDriver driver;
@FindBy(id="Name")
    private WebElement name;

    @FindBy(name="DurationWorked")
    private WebElement duration;

    @FindBy(id="Grade")
    private WebElement group;

    @FindBy(name="Email")
    private WebElement mail;

    @FindBy(css=".btn")
    private WebElement butt;

    @FindBy(id="Salary")
    private WebElement sal;


public CreateNewUserPge(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);//FindBy annotation interface works in conjuction with Pagefactory class,
}

public EmployeeListPge newwUser(String n,String d,String s,String emai,int index){
    (name).sendKeys(n);
    Select sel=new Select((group));
    sel.selectByIndex(index);
    (duration).sendKeys(d);
     (sal).sendKeys(s);
    (mail).sendKeys(emai);
    (butt).submit();
    return new EmployeeListPge(driver);

}

}
