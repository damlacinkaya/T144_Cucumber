package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){ // 1.adım ==> constructor'ı görünür hale getirmek.

       //  2.adim==> page fabrikasindan init element ile driveri bu classa tanımlamak.
        PageFactory.initElements(Driver.getDriver(),this);

    }

    //3.adim==> gerekli locateleri yapiyoruz
        @FindBy(id = "email")
                public WebElement emailKutusu;

        @FindBy(id = "pass")
                public WebElement passwordKutusu;

        @FindBy(xpath = "//*[@type='submit']")
               public WebElement loginButonu;




}
