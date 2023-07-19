package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class aileButcem {
    AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
    TouchAction touchAction=new TouchAction<>(driver);
    AileButcemPage aileButcemPage=new AileButcemPage();


    @Given("Kullanici driver kurulumlari yapar")
    public void kullanici_driver_kurulumlari_yapar() {
        Driver.getAndroidDriver();
    }
    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
// 905,983 press move 100,983
        Thread.sleep(2000);
        for (int i=0; i<6; i++){
            ReusableMethods.ekranSagKaydirma(905,983,500,100,983,1000);
        }

        aileButcemPage.girisYapButonu.click();
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String password) {
        aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
        aileButcemPage.girisYapButonu.click();
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

    }
    @Given("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {

    }
    @Given("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    }



}