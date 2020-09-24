package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.CucumberRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DashboardPage extends CucumberRunner {
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void CloseFlyer() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='fancybox-item fancybox-close fancybox-newsletter-close']")));

        WebElement elem = driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close fancybox-newsletter-close']"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void Gmailtab() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]")));

        WebElement eleme = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(eleme));
        eleme.click();
        Thread.sleep(3000);
    }
    public void RegisterBtn() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//div[@class='panel header']//a[@class='social-login-btn'][contains(text(),'Sign In')]"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void GoogleBtn() throws Exception{
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"social-login-popup\"]/div[2]/div[3]/div[2]/div[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
        Thread.sleep(3000);
    }
    public void RegisterEmail() throws Exception {
        WebElement element = driver.findElement(By.xpath("//a[@class='action create']//span"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        Thread.sleep(3000);
    }
    public void RegisterData(String mail,String pw) throws Exception {
        WebElement first_name = driver.findElement(By.id("firstname"));
        wait.until(ExpectedConditions.visibilityOf(first_name));
        first_name.sendKeys("Saqlain");
        WebElement last_name = driver.findElement(By.id("lastname"));
        wait.until(ExpectedConditions.visibilityOf(last_name));
        last_name.sendKeys("Haider");
        WebElement email = driver.findElement(By.id("email_address_create"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", email);
        email.sendKeys(mail);
        WebElement password = driver.findElement(By.id("password-social"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", password);
        password.sendKeys(pw);
        WebElement passwordConfirm = driver.findElement(By.id("password-confirmation-social"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordConfirm);
        passwordConfirm.sendKeys(pw);
        WebElement conformBtn = driver.findElement(By.xpath("//button[@id='button-create-social']//span"));
        wait.until(ExpectedConditions.elementToBeClickable(conformBtn));
        conformBtn.click();
        Thread.sleep(3000);
    }
        public void emailVerify() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("Error Email :");
            System.out.println(driver.findElement(By.xpath("//div[@id='email_address_create-error']")).getText());
        }
        public void emailVerification() throws InterruptedException {
            System.out.println("Error is: ");
            System.out.println(driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText());
        }
        public void passwordVerify() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("Error Password :");
            System.out.println(driver.findElement(By.xpath("//*[@id=\"social_login_pass-error\"]")).getText());
        }

        public void pwVerify() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("Error Password :");
            WebElement a=driver.findElement(By.id("contentarea"));
            WebElement b=driver.findElement(By.id("password-error"));
            WebElement c=driver.findElement(By.id("password-confirmation-error"));

            if (a.isDisplayed()) {
                System.out.println(driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText());
            }
            else if (b.isDisplayed()) {
                System.out.println(driver.findElement(By.xpath("//*[@id=\"password-error\"]")).getText());
            }
            else if (c.isDisplayed() ){
                System.out.println(driver.findElement(By.xpath("//*[@id=\"password-confirmation-error\"]")).getText());
            }
        }

        public void alreadySignedUp() throws InterruptedException {
            Thread.sleep(3000);
            System.out.println("Error :");
            System.out.println(driver.findElement(By.xpath("//*[@id=\"social-login-popup\"]/div[3]/div[2]/div/div/div")).getText());
        }

    public void LoginBtn() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//li[contains(@class,'last')]//a[@class='signin-modal']"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }

    public void SignInBtn() throws Exception {
        WebElement elemen = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(elemen));
        elemen.click();
        Thread.sleep(3000);
    }

    private static void googleSelect(By by, String text) {
        driver.findElement(by).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//div[@class='goog-menu goog-menu-vertical']//div[text()='" + text + "']"))));
        driver.findElement(By.xpath("//div[@class='goog-menu goog-menu-vertical']//div[text()='" + text + "']")).click();

    }

    public void registerGmail(String email){
        String baseUrl = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default";
        driver.get(baseUrl);

        //By ID Text area1
        WebElement text1 = driver.findElement(By.id("FirstName"));
        text1.clear();
        text1.sendKeys("Hello ");

        WebElement text2 = driver.findElement(By.id("LastName"));
        text2.clear();
        text2.sendKeys("World");

        WebElement text3 = driver.findElement(By.xpath(".//*[@id='GmailAddress']"));
        text3.clear();
        text3.sendKeys(email);

        WebElement text4 = driver.findElement(By.xpath(".//*[@id='Passwd']"));
        text4.clear();
        text4.sendKeys("123abc_dxy");

        WebElement text5 = driver.findElement(By.xpath(".//*[@id='PasswdAgain']"));
        text5.clear();
        text5.sendKeys("123abc_dxy");

        WebElement text6 = driver.findElement(By.id("BirthDay"));
        text6.clear();
        text6.sendKeys("1");

        WebElement text7 = driver.findElement(By.id("BirthYear"));
        text7.clear();
        text7.sendKeys("2000");

        WebElement text8 = driver.findElement(By.id("RecoveryPhoneNumber"));
        text8.clear();
        text8.sendKeys("9222103436");

        WebElement text9 =  driver.findElement(By.id("RecoveryEmailAddress"));
        text9.clear();
        text9.sendKeys("abc_gh@yahoo.com");

        googleSelect(By.id("Gender"), "Male");

        googleSelect(By.id("BirthMonth"), "March");

        googleSelect(By.xpath(".//*[@id='CountryCode']/div"), "United States");

        WebElement text10 = driver.findElement(By.id("submitbutton"));
        text10.click();

    }

    public void myAccount() throws Exception {
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(element1));
        element1.click();
        Thread.sleep(3000);
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/div/ul/li/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element2));
        element2.click();
        Thread.sleep(3000);
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element3));
        element3.click();
        Thread.sleep(3000);
        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element4));
        element4.click();
        Thread.sleep(3000);
        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element5));
        element5.click();
        Thread.sleep(3000);
        WebElement element6 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[4]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element6));
        element6.click();
        Thread.sleep(3000);
        WebElement element7 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element7));
        element7.click();
        Thread.sleep(3000);
        WebElement element8 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[7]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element8));
        element8.click();
        Thread.sleep(3000);
        WebElement element9 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[8]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element9));
        element9.click();
        Thread.sleep(3000);
        WebElement element10 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[9]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element10));
        element10.click();
        Thread.sleep(3000);
        WebElement element11 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[11]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element11));
        element11.click();
        Thread.sleep(3000);
        WebElement element12 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[12]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(element12));
        element12.click();
        Thread.sleep(3000);
    }

    public void myAccountInformationEmail() throws Exception {
        WebElement part1 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(part1));
        part1.click();
        Thread.sleep(3000);
        WebElement part2 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/div/ul/li/a"));
        wait.until(ExpectedConditions.elementToBeClickable(part2));
        part2.click();
        Thread.sleep(3000);
        WebElement part3 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(part3));
        part3.click();
        Thread.sleep(3000);
        WebElement part4= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(part4));
        part4.click();
        Thread.sleep(3000);
        WebElement part5= driver.findElement(By.xpath("//*[@id=\"change-email\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(part5));
        part5.click();
        Thread.sleep(3000);
        WebElement Email1 = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(Email1));
        Email1.sendKeys(Keys.CONTROL + "a");
        Email1.sendKeys(Keys.DELETE);
        Email1.sendKeys("SQASaqlain@ymail.com");
        WebElement Curr_Password = driver.findElement(By.id("current-password"));
        wait.until(ExpectedConditions.visibilityOf(Curr_Password));
        Curr_Password.sendKeys("Haider_123");
        WebElement part6= driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/div[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(part6));
        part6.click();
        Thread.sleep(3000);

    }
    public void myAccountInformationPassword() throws Exception {
        WebElement p1 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(p1));
        p1.click();
        Thread.sleep(3000);
        WebElement p2 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/div/ul/li/a"));
        wait.until(ExpectedConditions.elementToBeClickable(p2));
        p2.click();
        Thread.sleep(3000);
        WebElement p3 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(p3));
        p3.click();
        Thread.sleep(3000);
        WebElement p4 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(p4));
        p4.click();
        Thread.sleep(3000);
        WebElement p5 = driver.findElement(By.xpath("//*[@id=\"change-password\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(p5));
        p5.click();
        Thread.sleep(3000);
        WebElement Curr_Password = driver.findElement(By.id("current-password"));
        wait.until(ExpectedConditions.visibilityOf(Curr_Password));
        Curr_Password.sendKeys("Haider_123");
        WebElement new_Password = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(new_Password));
        new_Password.sendKeys("Haider_13");
        WebElement Conf_Password = driver.findElement(By.id("password-confirmation"));
        wait.until(ExpectedConditions.visibilityOf(Conf_Password));
        Conf_Password.sendKeys("Haider_123");
        WebElement p6 = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/div[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(p6));
        p6.click();
        Thread.sleep(3000);
    }
    public void addressBook() throws Exception{
        WebElement a1 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(a1));
        a1.click();
        Thread.sleep(1000);
        WebElement a2 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/div/ul/li/a"));
        wait.until(ExpectedConditions.elementToBeClickable(a2));
        a2.click();
        Thread.sleep(1000);
        WebElement a3 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(a3));
        a3.click();
        Thread.sleep(1000);
        WebElement a4 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/div[2]/div[1]/div[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(a4));
        a4.click();
        Thread.sleep(3000);
        WebElement Company = driver.findElement(By.id("company"));
        wait.until(ExpectedConditions.visibilityOf(Company));
        Company.sendKeys(Keys.CONTROL + "a");
        Company.sendKeys(Keys.DELETE);
        Company.sendKeys("Discretelogix PVT. LTD");
        WebElement Phone = driver.findElement(By.id("telephone"));
        wait.until(ExpectedConditions.visibilityOf(Phone));
        Phone.sendKeys(Keys.CONTROL + "a");
        Phone.sendKeys(Keys.DELETE);
        Phone.sendKeys("+923367752304");
        WebElement Fax = driver.findElement(By.id("fax"));
        wait.until(ExpectedConditions.visibilityOf(Fax));
        Fax.sendKeys(Keys.CONTROL + "a");
        Fax.sendKeys(Keys.DELETE);
        Fax.sendKeys("03367752304");
        WebElement St_Address = driver.findElement(By.id("street_1"));
        wait.until(ExpectedConditions.visibilityOf(St_Address));
        St_Address.sendKeys(Keys.CONTROL + "a");
        St_Address.sendKeys(Keys.DELETE);
        St_Address.sendKeys("STP 3 Basement Block A");
        WebElement City = driver.findElement(By.id("city"));
        wait.until(ExpectedConditions.visibilityOf(City));
        City.sendKeys(Keys.CONTROL + "a");
        City.sendKeys(Keys.DELETE);
        City.sendKeys("Islamabad");
        WebElement Country = driver.findElement(By.id("country"));
        wait.until(ExpectedConditions.visibilityOf(Country));
        Country.sendKeys(Keys.CONTROL + "a");
        Country.sendKeys(Keys.DELETE);
        Country.sendKeys("Pakistan");
        WebElement Region = driver.findElement(By.id("region"));
        wait.until(ExpectedConditions.visibilityOf(Region));
        Region.sendKeys(Keys.CONTROL + "a");
        Region.sendKeys(Keys.DELETE);
        Region.sendKeys("Islamabad");
        WebElement Zip = driver.findElement(By.id("zip"));
        wait.until(ExpectedConditions.visibilityOf(Zip));
        Zip.sendKeys(Keys.CONTROL + "a");
        Zip.sendKeys(Keys.DELETE);
        Zip.sendKeys("45000");
        WebElement a5 = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
        wait.until(ExpectedConditions.elementToBeClickable(a5));
        a5.click();
        Thread.sleep(3000);
    }
    public void newspaper() throws Exception {
        WebElement ab1 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(ab1));
        ab1.click();
        Thread.sleep(1000);
        WebElement ab2 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/div/ul/li/a"));
        wait.until(ExpectedConditions.elementToBeClickable(ab2));
        ab2.click();
        Thread.sleep(1000);
        WebElement ab3 = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(ab3));
        ab3.click();
        Thread.sleep(1000);
        WebElement ab4 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/div[2]/div[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(ab4));
        ab4.click();
        Thread.sleep(1000);
        WebElement ab5 = driver.findElement(By.xpath("//*[@id=\"subscription\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(ab5));
        ab5.click();
        Thread.sleep(1000);
        WebElement ab6 = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
        wait.until(ExpectedConditions.elementToBeClickable(ab6));
        ab6.click();
        Thread.sleep(1000);

    }
    public void AddToCart() throws Exception {
        WebElement abc1 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc1));
        abc1.click();
        Thread.sleep(1000);
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        WebElement abc3 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[2]/div[1]/div[2]/ol/li[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc3));
        abc3.click();
        Thread.sleep(1000);

    }
    public void checkout() throws Exception {
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        WebElement abc3 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[2]/div[1]/div[2]/ol/li[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc3));
        abc3.click();
        Thread.sleep(1000);
        WebElement abc4 = driver.findElement(By.xpath("//*[@id=\"layer-product-list\"]/div[2]/ol/li[4]/div/div[2]/div[3]/div/div/form/button"));
        wait.until(ExpectedConditions.elementToBeClickable(abc4));
        abc4.click();
        Thread.sleep(1000);
        WebElement abc5 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li/button"));
        wait.until(ExpectedConditions.elementToBeClickable(abc5));
        abc5.click();
        Thread.sleep(1000);
        WebElement abc6 = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(abc6));
        abc6.click();
        Thread.sleep(5000);
        WebElement abc7 = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(abc7));
        abc7.click();
        Thread.sleep(7000);
    }
    public void RandomProduct() throws Exception {
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        int int_random1 = (int) (Math.random() * (7 - 1 + 1) + 1);
        String CategorySelector = "div.block-content>ol.items > li:nth-child(" + int_random1 +")";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.cssSelector(CategorySelector)).click();
            Thread.sleep(10000);

        } catch (Exception e) {

            System.out.println(e);
        }

            int int_random10 = (int) (Math.random() * (39 - 1 + 1) + 1);
            String ProductSelector = "//*[@id=\"layer-product-list\"]/div[2]/ol/li[" + int_random10 +"]/div/div[2]/div[3]/div/div/form/button";
                Thread.sleep(8000);
                System.out.println(ProductSelector);
                driver.findElement(By.xpath(ProductSelector)).click();
                Thread.sleep(15000);
        WebElement abc5 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li/button"));
        wait.until(ExpectedConditions.elementToBeClickable(abc5));
        abc5.click();
        Thread.sleep(10000);
        WebElement abc6 = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(abc6));
        abc6.click();
        Thread.sleep(5000);
        WebElement abc7 = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(abc7));
        abc7.click();
        Thread.sleep(10000);
    }
    public void RandomAddToCart() throws Exception {
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        int int_random1 = (int) (Math.random() * (7 - 1 + 1) + 1);
        String CategorySelector = "div.block-content>ol.items > li:nth-child(" + int_random1 +")";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.cssSelector(CategorySelector)).click();
            Thread.sleep(10000);

        } catch (Exception e) {

            System.out.println(e);
        }

        int int_random10 = (int) (Math.random() * (39 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"layer-product-list\"]/div[2]/ol/li[" + int_random10 +"]/div/div[2]/div[3]/div/div/form/button";
        Thread.sleep(8000);
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(15000);
    }

    public void RandomAddToCartANDREMOVE() throws Exception{
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        int int_random1 = (int) (Math.random() * (7 - 1 + 1) + 1);
        String CategorySelector = "div.block-content>ol.items > li:nth-child(" + int_random1 +")";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.cssSelector(CategorySelector)).click();
            Thread.sleep(10000);

        } catch (Exception e) {

            System.out.println(e);
        }

        int int_random10 = (int) (Math.random() * (39 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"layer-product-list\"]/div[2]/ol/li[" + int_random10 +"]/div/div[2]/div[3]/div/div/form/button";
        Thread.sleep(8000);
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(15000);
        WebElement a1= driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(a1));
        a1.click();
        Thread.sleep(2000);
    }
    public void RandomAddToCartANDIncreaseValue() throws Exception{
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        int int_random1 = (int) (Math.random() * (7 - 1 + 1) + 1);
        String CategorySelector = "div.block-content>ol.items > li:nth-child(" + int_random1 +")";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.cssSelector(CategorySelector)).click();
            Thread.sleep(10000);

        } catch (Exception e) {

            System.out.println(e);
        }

        int int_random10 = (int) (Math.random() * (39 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"layer-product-list\"]/div[2]/ol/li[" + int_random10 +"]/div/div[2]/div[3]/div/div/form/button";
        Thread.sleep(8000);
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(15000);
            int inc_dec = (int) (Math.random() * (2 - 1 + 1) + 1);
            String qty_changer = "//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[3]/div/div[2]/a[" + inc_dec + "]";
            Thread.sleep(5000);
            System.out.println(qty_changer);
            driver.findElement(By.xpath(qty_changer)).click();
            Thread.sleep(10000);

        WebElement a11= driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(a11));
        a11.click();
        Thread.sleep(3000);
    }

    public void WishList() throws Exception {
        WebElement abcd1 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abcd1));
        abcd1.click();
        Thread.sleep(1000);
        WebElement abcd2 = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[2]/div[1]/div[2]/ol/li[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abcd2));
        abcd2.click();
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"layer-product-list\"]/div[2]/ol/li[11]/div/div[2]/div[2]"));
        action.moveToElement(we).build().perform();
        WebElement abcd3 = driver.findElement(By.xpath("//*[@id=\"layer-product-list\"]/div[2]/ol/li[11]/div/div[2]/div[3]/div/a[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(abcd3));
        abcd3.click();
        Thread.sleep(3000);
    }
    public void RandomAddToWishList() throws Exception {
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
                int int_random10 = (int) (Math.random() * (39 - 1 + 1) + 1);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"layer-product-list\"]/div[2]/ol/li[" + int_random10 + "]/div/div[2]"));
        action.moveToElement(we).build().perform();
        WebElement a = driver.findElement(By.xpath("//*[@id=\"layer-product-list\"]/div[2]/ol/li[" + int_random10 + "]/div/div[2]/div[3]/div/a[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(a));
        a.click();
        Thread.sleep(5000);
        System.out.println("//*[@id=\"layer-product-list\"]/div[2]/ol/li[" + int_random10 + "]/div/div[2]/div[3]/div/div/div/span");
    }

   public void RandomCategory() throws Exception{
       WebElement abc1 = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul/li[2]/span"));
       wait.until(ExpectedConditions.elementToBeClickable(abc1));
       abc1.click();
       Thread.sleep(1000);
       WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
       wait.until(ExpectedConditions.elementToBeClickable(abc2));
       abc2.click();
       Thread.sleep(1000);
       WebElement List = (WebElement) driver.findElements(By.xpath("//*[@id=\"layer-product-list\"]/div[2]"));
       Random rand = new Random();
       System.out.println(driver.findElement(By.xpath("//*[@id=\"layer-product-list\"]/div[2]")).getText());

    }
    public void Buttons() throws Exception {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        action.moveToElement(we).build().perform();
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/div[2]/div/div/ul/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(5000);
        Actions action1 = new Actions(driver);
        WebElement we1 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        action1.moveToElement(we1).build().perform();
        WebElement abc1 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/div[2]/div/div/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc1));
        abc1.click();
        Thread.sleep(2000);
        Actions action2 = new Actions(driver);
        WebElement we2 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        action1.moveToElement(we2).build().perform();
        WebElement abc3 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/div[2]/div/div/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc3));
        abc3.click();
        Thread.sleep(2000);
        Actions action3 = new Actions(driver);
        WebElement we3 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/a/span"));
        action3.moveToElement(we3).build().perform();
        WebElement abc4 = driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[2]/div[2]/div/div/ul/li[4]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc4));
        abc4.click();
        Thread.sleep(2000);
    }

    public void readData() throws IOException {
        int count = 0;
        String file = "C:\\Users\\Dell\\Desktop\\IBUrls.csv";
        List<String> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                content.add(line);
            }
        } catch (FileNotFoundException e) {

        }
    }

    }
