package pages;
import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.CucumberRunner;

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
    public void RegisterBtn() throws Exception {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button"));
        action.moveToElement(we).build().perform();
        WebElement elem = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void CreateAccountBtn() throws Exception{
        WebElement elem = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[2]/div/div[2]/div/div/a"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void myAccountbtn() throws Exception{
        /*Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button"));
        action.moveToElement(we).build().perform();*/
        WebElement elem1= driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button/i"));
        wait.until(ExpectedConditions.elementToBeClickable((elem1)));
        elem1.click();
        WebElement elem= driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable((elem)));
        elem.click();
        Thread.sleep(3000);
    }
    public void myAccountOptions() throws Exception {
        WebElement elem1= driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button/i"));
        wait.until(ExpectedConditions.elementToBeClickable((elem1)));
        elem1.click();
        WebElement elem= driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable((elem)));
        elem.click();
        Thread.sleep(3000);
        WebElement Orders = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Orders));
        Orders.click();
        Thread.sleep(3000);
        WebElement products = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(products));
        products.click();
        Thread.sleep(3000);
        /*WebElement wishlist = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[4]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(wishlist));
        wishlist.click();
        Thread.sleep(3000);*/
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[5]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Address));
        Address.click();
        Thread.sleep(3000);
        WebElement account = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
        Thread.sleep(3000);
        WebElement stored = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[7]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(stored));
        stored.click();
        Thread.sleep(3000);
        WebElement billing = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[8]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(billing));
        billing.click();
        Thread.sleep(3000);
       /* WebElement GDPR = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[9]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(GDPR));
        GDPR.click();
        Thread.sleep(3000);*/
        WebElement Reviews = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[10]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Reviews));
        Reviews.click();
        Thread.sleep(3000);
        WebElement newspaper = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[11]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(newspaper));
        newspaper.click();
        Thread.sleep(3000);

    }
    public void myAccountInformationEmail() throws Exception {
        WebElement account = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
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
        WebElement part6= driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(part6));
        part6.click();
        Thread.sleep(3000);

    }
    public void myAccountInformationPassword() throws Exception {
        WebElement account = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[6]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
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
        new_Password.sendKeys("Haider_1234");
        WebElement Conf_Password = driver.findElement(By.id("password-confirmation"));
        wait.until(ExpectedConditions.visibilityOf(Conf_Password));
        Conf_Password.sendKeys("Haider_1234");
        WebElement p6 = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(p6));
        p6.click();
        Thread.sleep(3000);
    }
    public void addressBook() throws Exception{
        WebElement account = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[7]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
        Thread.sleep(3000);
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[5]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Address));
        Address.click();
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
        WebElement a5 = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(a5));
        a5.click();
        Thread.sleep(3000);
    }
    public void UpdateAddressBook() throws Exception{
        WebElement account = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[7]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
        Thread.sleep(3000);
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[5]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Address));
        Address.click();
        Thread.sleep(3000);
        WebElement EditAddress = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/a"));
        wait.until(ExpectedConditions.elementToBeClickable(EditAddress));
        EditAddress.click();
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
        WebElement a5 = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(a5));
        a5.click();
        Thread.sleep(3000);
    }
    public void newspaper() throws Exception {
        WebElement account = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[7]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(account));
        account.click();
        Thread.sleep(3000);
        WebElement newspaper = driver.findElement(By.xpath("//*[@id=\"account-nav\"]/ul/li[11]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(newspaper));
        newspaper.click();
        Thread.sleep(3000);
        WebElement ab5 = driver.findElement(By.xpath("//*[@id=\"subscription\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(ab5));
        ab5.click();
        Thread.sleep(1000);
        WebElement ab6 = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(ab6));
        ab6.click();
        Thread.sleep(1000);

    }

    public void SigninBtn() throws Exception {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button"));
        action.moveToElement(we).build().perform();
        WebElement elem = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[4]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void RegisterEmail() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//a[@class='action create']//span"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void RegisterData(String mail,String pw) throws Exception {
        WebElement first_name = driver.findElement(By.id("firstname"));
        wait.until(ExpectedConditions.visibilityOf(first_name));
        first_name.sendKeys("Saqlain");
        WebElement last_name = driver.findElement(By.id("lastname"));
        wait.until(ExpectedConditions.visibilityOf(last_name));
        last_name.sendKeys("Haider");
        WebElement email = driver.findElement(By.id("email_address"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", email);
        email.sendKeys(mail);
        WebElement password = driver.findElement(By.id("password"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", password);
        password.sendKeys(pw);
        WebElement passwordConfirm = driver.findElement(By.id("password-confirmation"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordConfirm);
        passwordConfirm.sendKeys(pw);
       /* WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id=\"remember_meMonrNbF3Wz\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(radiobutton1));
        radiobutton1.click();
        WebElement radiobutton2 = driver.findElement(By.xpath("//*[@id=\"accept_gdpr\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(radiobutton2));
        radiobutton2.click();*/
        WebElement conformBtn = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/div[2]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(conformBtn));
        conformBtn.click();
        Thread.sleep(3000);
    }
    public void LoginBtn() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//li[contains(@class,'last')]//a[@class='signin-modal']"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);

    }
    public void emailVerify() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Error Email :");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"email_address-error\"]")).getText());
    }
    public void emailVerification() throws InterruptedException {
        System.out.println("Error is: ");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText());
    }
    public void passwordVerify() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Error Password :");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"password-error\"]")).getText());
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
        System.out.println(driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div/div")).getText());
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
        text1.sendKeys("San ");

        WebElement text2 = driver.findElement(By.id("LastName"));
        text2.clear();
        text2.sendKeys("P");

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

    public void RandomJacketProduct() throws Exception {
        WebElement Jackets = driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Jackets));
        Jackets.click();
        Thread.sleep(5000);
        int int_random = (int) (Math.random() * (15 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"product-wrapper\"]/ol/li["+ int_random +"]/div[1]/a";
        Thread.sleep(8000);
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(3000);
        WebElement none = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/label[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(none));
        none.click();
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[4]/div[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(size));
        size.click();
        Thread.sleep(3000);
        List<String> list = new ArrayList<>();
        list.add("xsmall");
        list.add("small");
        list.add("medium");
        list.add("large");
        list.add("xlarge");
        list.add("2xlarge");
        ////getting random value
        Random rand = new Random(); //instance of random class
        int upperbound = 5;
        //generate random values from 0-5
        int randomValue = rand.nextInt(upperbound);
        System.out.println(randomValue);
        ////end
        String sizeSelector = "//*[@id=\""+ list.get(randomValue) +"\"]";
        System.out.println(sizeSelector);
        driver.findElement(By.xpath(sizeSelector)).click();
        Thread.sleep(2000);
        WebElement addcart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(addcart));
        addcart.click();
        Thread.sleep(1000);
        WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(minicart));
        minicart.click();
        Thread.sleep(1000);

    }

    public void RandomJacketProductUpdateCartCheckout() throws Exception {
        WebElement Jackets = driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Jackets));
        Jackets.click();
        Thread.sleep(5000);
        int int_random = (int) (Math.random() * (15 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"product-wrapper\"]/ol/li["+ int_random +"]/div[1]/a";
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(7000);
        WebElement none = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/label[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(none));
        none.click();
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[4]/div[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(size));
        size.click();
        Thread.sleep(5000);
        List<String> list = new ArrayList<>();
        list.add("xsmall");
        list.add("small");
        list.add("medium");
        list.add("large");
        list.add("xlarge");
        list.add("2xlarge");
        ////getting random value
        Random rand = new Random(); //instance of random class
        int upperbound = 5;
        //generate random values from 0-5
        int randomValue = rand.nextInt(upperbound);
        System.out.println(randomValue);
        //end
        String sizeSelector = "//*[@id=\""+ list.get(randomValue) +"\"]";
        System.out.println(sizeSelector);
        driver.findElement(By.xpath(sizeSelector)).click();
        Thread.sleep(5000);
        WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
        AddtoCart.click();
        Thread.sleep(6000);
        WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(minicart));
        minicart.click();
        WebElement updatecart = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(updatecart));
        updatecart.click();
        Thread.sleep(10000);
        WebElement monogramupdate = driver.findElement(By.id("m5-monogram-txt"));
        wait.until(ExpectedConditions.visibilityOf(monogramupdate));
        monogramupdate.sendKeys("Haider1");
        Thread.sleep(5000);
        /*int min = 2;
        int max = 4;
        int int_random1 = (int) (Math.random() * (max - min + 1) + min);
        String monogram = "//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/label["+ int_random1 +"]/input" ;
        System.out.println(monogram);
        driver.findElement(By.xpath(monogram)).click();*/
        WebElement size1 = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[4]/div[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(size1));
        size1.click();
        Thread.sleep(5000);
        String sizeSelector1 = "//*[@id=\""+ list.get(randomValue) +"\"]";
        System.out.println(sizeSelector1);
        driver.findElement(By.xpath(sizeSelector1)).click();
        Thread.sleep(5000);
        WebElement updateCart = driver.findElement(By.xpath("//*[@id=\"product-updatecart-button\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(updateCart));
        updateCart.click();
        Thread.sleep(7000);
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
        Thread.sleep(10000);
        WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
        NextBtn.click();
        Thread.sleep(8000);
        WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
        Paypalradiobtn.click();
        Thread.sleep(8000);
        WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
        PaypalRedirect.click();
        Thread.sleep(10000);
    }

    public void RandomJacketProductCheckout() throws Exception {
        WebElement Jackets = driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[1]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(Jackets));
        Jackets.click();
        Thread.sleep(5000);
        int int_random = (int) (Math.random() * (15 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"product-wrapper\"]/ol/li["+ int_random +"]/div[1]/a";
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(7000);
        WebElement none = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/label[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(none));
        none.click();
        Thread.sleep(2000);
        WebElement size = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[4]/div[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(size));
        size.click();
        Thread.sleep(5000);
        List<String> list = new ArrayList<>();
        list.add("xsmall");
        list.add("small");
        list.add("medium");
        list.add("large");
        list.add("xlarge");
        list.add("2xlarge");
        ////getting random value
        Random rand = new Random(); //instance of random class
        int upperbound = 5;
        //generate random values from 0-5
        int randomValue = rand.nextInt(upperbound);
        System.out.println(randomValue);
        //end
        String sizeSelector = "//*[@id=\""+ list.get(randomValue) +"\"]";
        System.out.println(sizeSelector);
        driver.findElement(By.xpath(sizeSelector)).click();
        Thread.sleep(5000);
        WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
        AddtoCart.click();
        Thread.sleep(6000);
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
        Thread.sleep(10000);
        WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
        NextBtn.click();
        Thread.sleep(8000);
        WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
        Paypalradiobtn.click();
        Thread.sleep(8000);
        WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
        PaypalRedirect.click();
        Thread.sleep(10000);
    }


    public void RandomBagsProduct() throws Exception {
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        int int_random1 = (int) (Math.random() * (18 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li["+ int_random1 +"]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            AddtoCart.click();
            Thread.sleep(5000);
            WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
            wait.until(ExpectedConditions.elementToBeClickable(minicart));
            minicart.click();
            WebElement checkout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/button"));
            wait.until(ExpectedConditions.elementToBeClickable(checkout));
            checkout.click();
            Thread.sleep(10000);
            WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
            NextBtn.click();
            Thread.sleep(8000);
            WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
            Paypalradiobtn.click();
            Thread.sleep(8000);
            WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
            PaypalRedirect.click();
            Thread.sleep(10000);




        } catch (Exception e) {

            System.out.println(e);
        }

       /* int int_random10 = (int) (Math.random() * (39 - 1 + 1) + 1);
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
        Thread.sleep(10000);*/
    }

    public void RandomBagProductCheckout() throws Exception{
        WebElement abc2 = driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(abc2));
        abc2.click();
        Thread.sleep(1000);
        int int_random1 = (int) (Math.random() * (18 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li["+ int_random1 +"]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            AddtoCart.click();
            Thread.sleep(5000);
            WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
            wait.until(ExpectedConditions.elementToBeClickable(minicart));
            minicart.click();
            Thread.sleep(5000);
            WebElement checkout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/button"));
            wait.until(ExpectedConditions.elementToBeClickable(checkout));
            checkout.click();
            Thread.sleep(10000);
            WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
            NextBtn.click();
            Thread.sleep(8000);
            WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
            Paypalradiobtn.click();
            Thread.sleep(8000);
            WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
            PaypalRedirect.click();
            Thread.sleep(10000);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void RandomCategory() throws Exception{
        //*[@id="mainMenu"]/li[2]/a
        int int_random = (int) (Math.random() * (2 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"mainMenu\"]/li["+ int_random +"]/a";
        System.out.println(CategorySelector);
        driver.findElement(By.xpath(CategorySelector)).click();
        Thread.sleep(7000);
    }

    public void SelectRandomBagCategory() throws Exception{
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[2]/a/span[1]"));
        action.moveToElement(we).build().perform();
        int int_random = (int) (Math.random() * (4 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"mobile-menu-8-1\"]/li/ul/li["+ int_random +"]/a";
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(3000);
        if(ProductSelector .equals("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[1]/a") ){
            Duffel();
        }else if(ProductSelector .equals("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[2]/a")) {
            Tote();
        }else if (ProductSelector .equals ("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[3]/a")){
            BackPacks();
        }else if (ProductSelector .equals ("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[4]/a")){
            SmallGoods();
        }
    }

    public void Duffel() throws Exception{
        int int_random1 = (int) (Math.random() * (22 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Tote() throws Exception{
        int int_random1 = (int) (Math.random() * (9 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void BackPacks() throws Exception{
        int int_random1 = (int) (Math.random() * (5 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SmallGoods() throws Exception{
        int int_random1 = (int) (Math.random() * (10 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addProductToCartFromBagsCategory() throws Exception {
        int int_random1 = (int) (Math.random() * (18 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void proceedToCheckoutAndRedirectToPaypal() throws Exception{
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
        Thread.sleep(10000);
        WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
        NextBtn.click();
        Thread.sleep(8000);
        WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
        Paypalradiobtn.click();
        Thread.sleep(8000);
        WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
        PaypalRedirect.click();
        Thread.sleep(10000);
    }

    public void RandomProductFromCategory() throws Exception{
        String a = "Jackets";
        String b = "Bags";
        WebElement value = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/ul/li[2]"));
        String ab = value.getText();
        if (ab.equals(a)) {
            System.out.println("Jackets");
            int int_random = (int) (Math.random() * (14 - 1 + 1) + 1);
            String ProductSelector = "//*[@id=\"product-wrapper\"]/ol/li["+ int_random +"]/div[2]/h5/a";
            System.out.println(ProductSelector);
            driver.findElement(By.xpath(ProductSelector)).click();
            Thread.sleep(10000);
            WebElement none = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/label[1]/button"));
            wait.until(ExpectedConditions.elementToBeClickable(none));
            none.click();
            Thread.sleep(2000);
            WebElement size = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div[1]/div[4]/div[1]"));
            wait.until(ExpectedConditions.elementToBeClickable(size));
            size.click();
            Thread.sleep(5000);
            List<String> list = new ArrayList<>();
            list.add("xsmall");
            list.add("small");
            list.add("medium");
            list.add("large");
            list.add("xlarge");
            list.add("2xlarge");
            ////getting random value
            Random rand = new Random(); //instance of random class
            int upperbound = 5;
            //generate random values from 0-5
            int randomValue = rand.nextInt(upperbound);
            System.out.println(randomValue);
            //end
            String sizeSelector = "//*[@id=\""+ list.get(randomValue) +"\"]";
            System.out.println(sizeSelector);
            driver.findElement(By.xpath(sizeSelector)).click();
            Thread.sleep(5000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            AddtoCart.click();
            Thread.sleep(6000);
            WebElement checkout = driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(checkout));
            checkout.click();
            Thread.sleep(10000);
            WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
            NextBtn.click();
            Thread.sleep(8000);
            WebElement Email = driver.findElement(By.id("customer-email"));
            wait.until(ExpectedConditions.visibilityOf(Email));
            Email.sendKeys("Test@dx.com");
            WebElement Fname = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input"));
            wait.until(ExpectedConditions.visibilityOf(Fname));
            Fname.sendKeys("Check");
            WebElement Lname = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input"));
            wait.until(ExpectedConditions.visibilityOf(Lname));
            Lname.sendKeys("Test");
            WebElement Company = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input"));
            wait.until(ExpectedConditions.visibilityOf(Company));
            Company.sendKeys("Discretelogix PVT. LTD");
            WebElement St_Address = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div/div/input"));
            wait.until(ExpectedConditions.visibilityOf(St_Address));
            St_Address.sendKeys("STP 3 Basement Block A");
            WebElement City = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input"));
            wait.until(ExpectedConditions.visibilityOf(City));
            City.sendKeys("NY");
            WebElement State = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select"));
            State.click();
            Select Region = new Select (driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select")));
            Region.selectByIndex(1);
            WebElement Zip = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input"));
            wait.until(ExpectedConditions.visibilityOf(Zip));
            Zip.sendKeys("45000");
            WebElement Country = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select"));
            wait.until(ExpectedConditions.visibilityOf(Country));
            WebElement Phone = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input"));
            wait.until(ExpectedConditions.visibilityOf(Phone));
            Phone.sendKeys("+13367752304");
            WebElement Fax = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[10]/div/input"));
            wait.until(ExpectedConditions.visibilityOf(Fax));
            Fax.sendKeys("03367752304");
            WebElement Next = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(Next));
            Next.click();
            Thread.sleep(8000);

            WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
            Paypalradiobtn.click();
            Thread.sleep(8000);
            WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
            wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
            PaypalRedirect.click();
            Thread.sleep(10000);
        }
        else {
            System.out.println(ab);
            int int_random1 = (int) (Math.random() * (18 - 1 + 1) + 1);
            String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li["+ int_random1 +"]/div[2]/h5/a";
            try {
                Thread.sleep(5000);
                System.out.println(CategorySelector);
                driver.findElement(By.xpath(CategorySelector)).click();
                Thread.sleep(10000);
                WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
                wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(2000);
                WebElement checkout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/button"));
                wait.until(ExpectedConditions.elementToBeClickable(checkout));
                checkout.click();
                Thread.sleep(10000);
                WebElement Email = driver.findElement(By.id("customer-email"));
                wait.until(ExpectedConditions.visibilityOf(Email));
                Email.sendKeys("Test@dx.com");
                WebElement Fname = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input"));
                wait.until(ExpectedConditions.visibilityOf(Fname));
                Fname.sendKeys("Check");
                WebElement Lname = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input"));
                wait.until(ExpectedConditions.visibilityOf(Lname));
                Lname.sendKeys("Test");
                WebElement Company = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input"));
                wait.until(ExpectedConditions.visibilityOf(Company));
                Company.sendKeys("Discretelogix PVT. LTD");
                WebElement St_Address = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/fieldset/div/div/div/input"));
                wait.until(ExpectedConditions.visibilityOf(St_Address));
                St_Address.sendKeys("STP 3 Basement Block A");
                WebElement City = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[4]/div/input"));
                wait.until(ExpectedConditions.visibilityOf(City));
                City.sendKeys("Mobile");
                WebElement State = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select"));
                State.click();
                Select Region = new Select (driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select")));
                Region.selectByIndex(1);
                WebElement Zip = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input"));
                wait.until(ExpectedConditions.visibilityOf(Zip));
                Zip.sendKeys("35004");
                WebElement Country = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[8]/div/select"));
                wait.until(ExpectedConditions.visibilityOf(Country));
                WebElement Phone = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input"));
                wait.until(ExpectedConditions.visibilityOf(Phone));
                Phone.sendKeys("+13367752304");
                WebElement Fax = driver.findElement(By.xpath("/html/body/main/div/section/div/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[10]/div/input"));
                wait.until(ExpectedConditions.visibilityOf(Fax));
                Fax.sendKeys("03367752304");
                WebElement Next = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
                wait.until(ExpectedConditions.elementToBeClickable(Next));
                Next.click();
                Thread.sleep(8000);
                WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
                wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
                Paypalradiobtn.click();
                Thread.sleep(8000);
                WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
                wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
                PaypalRedirect.click();
                Thread.sleep(10000);

            } catch (Exception e) {

                System.out.println(e);
            }
        }

        }
      /*  int int_random = (int) (Math.random() * (18 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"mainMenu\"]/li["+ int_random +"]/a";
        System.out.println(CategorySelector);
        driver.findElement(By.xpath(CategorySelector)).click();
        Thread.sleep(7000);*/

}
