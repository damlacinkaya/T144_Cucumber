package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SaucedemoPages {

    public SaucedemoPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "user-name")
    public WebElement userNameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@class='inventory_item_name ']")
    public List<WebElement>tumUrunElementleriList;

    @FindBy(id = "add-to-cart")
    public WebElement addToCartButonu;

    @FindBy(className = "shopping_cart_link")
    public WebElement alisverisSpetiLink;

    @FindBy(className = "inventory_item_name")
    public WebElement sepettekiUrunIsimElementi;

}
