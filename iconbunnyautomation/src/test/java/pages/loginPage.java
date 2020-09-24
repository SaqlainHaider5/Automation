package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import runners.CucumberRunner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class loginPage extends CucumberRunner {

    WebDriverWait wait = new WebDriverWait(driver, 3000);


    public  void VerifyAccount() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='panel header']//li[@class='authorization-link']//a")));
        String actual = driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link']//a")).getText();
        System.out.println(actual);
        String Expected = "SIGN OUT";
        if(actual.contains(Expected)){
            System.out.println("pass");

        }
        else {
            System.out.println("Values :" + actual + Expected);
        }

        Assert.assertTrue(actual.contains(Expected));


    }
    public  void logout() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='panel header']//li[@class='authorization-link']//a")));
        WebElement b = driver.findElement(By.xpath("//div[@class='panel header']//li[@class='authorization-link']//a"));
        b.click();
    }
    public void EnterUser(String user) throws Exception {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("social_login_email")));
                WebElement username = driver.findElement(By.id("social_login_email"));
                     username.sendKeys(user);
                     Thread.sleep(1000);
            }


    public  void EnterPass(String pass) throws Exception {

                WebElement password = driver.findElement(By.id("social_login_pass"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("social_login_pass")));

        password.sendKeys(pass);
                Thread.sleep(3000);
    }
    public  void ClickSubmitButton()  {

        WebElement submit_Btn = driver.findElement(By.xpath("//button[@id='bnt-social-login-authentication']//span"));
        wait.until(ExpectedConditions.elementToBeClickable(submit_Btn));

        submit_Btn.click();

    }
    public  void ClickSubmitButton1()  {
        WebElement submit_Btn = driver.findElement(By.id("submitid"));
        submit_Btn.click();
    }
    public void emailVerification() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Error :");
        System.out.println(driver.findElement(By.xpath("//div[@id='social_login_email-error']")).getText());
    }
    public void pwVerification() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Error :");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"social-login-authentication\"]/div[2]/div")).getText());
    }

    public void ClickLogout() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-user']//parent::a"));
        element.click();
        WebElement elem2 = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
        elem2.click();
        WebElement submit_Btn = driver.findElement(By.id("submitid"));
    }
    public void invalid() throws InterruptedException {
        Thread.sleep(3000);
        WebElement actualString = driver.findElement(By.xpath("//div[@class='form-group']//div[@class='alert alert-danger']"));
        assertTrue(actualString.isDisplayed());
    }
}