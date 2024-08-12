package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import pages.SaucedemoPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SauceDemoStepdefinitons {

    SaucedemoPages saucedemoPages=new SaucedemoPages();
    String secilenUrununIsmi;

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String ConfigGidilecekUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(ConfigGidilecekUrl));

    }
    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String direktUsername) {
        saucedemoPages.userNameKutusu.sendKeys(direktUsername);

    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String direkPassword) {
    saucedemoPages.passwordKutusu.sendKeys(direkPassword);
    }

    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        ReusableMethods.bekle(1);
        saucedemoPages.loginButonu.click();

    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        secilenUrununIsmi=saucedemoPages.tumUrunElementleriList
                         .get(0)
                         .getText();

        saucedemoPages.tumUrunElementleriList
                        .get(0)
                        .click();

    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {

        saucedemoPages.addToCartButonu.click();

    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
        saucedemoPages.alisverisSpetiLink.click();

    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

        // bunu test etmek icin daha once kaydettigimiz urun ismi ile
        // sepetteki urunun isminin ayni oldugunu test edelim

        String sepettekiUrunIsmi = saucedemoPages.sepettekiUrunIsimElementi.getText();

        Assertions.assertEquals(secilenUrununIsmi,sepettekiUrunIsmi);

    }

}
