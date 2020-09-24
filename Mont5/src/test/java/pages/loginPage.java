package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public void emailVerification() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Error :");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText());
    }
    public void pwVerification() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Error :");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"pass-error\"]")).getText());
    }

    public void PWVerification() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Error :");
        System.out.println(driver.findElement(By.xpath("/html/body/main/div/section/div[1]/div[2]/div[1]/div")).getText());
    }

    public  void logout() throws Exception {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button"));
        action.moveToElement(we).build().perform();
        WebElement b = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(b));
        b.click();
        Thread.sleep(6000);

    }
    public void EnterUser(String user) throws Exception {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

                WebElement username = driver.findElement(By.id("email"));
                     username.sendKeys(user);
                     Thread.sleep(1000);
            }



    public  void EnterPass(String pass) throws Exception {

                WebElement password = driver.findElement(By.id("pass"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));

        password.sendKeys(pass);
                Thread.sleep(3000);
    }
    public  void ClickSubmitButton()  {

        /*WebElement radiobutton2 = driver.findElement(By.xpath("//*[@id=\"accept_gdpr\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(radiobutton2));
        radiobutton2.click();*/
        WebElement submit_Btn = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(submit_Btn));
        submit_Btn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public  void ClickSubmitButton1()  {

        WebElement submit_Btn = driver.findElement(By.id("submitid"));
        submit_Btn.click();

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