package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    public void  openBrowser(){
        if (browserName.equalsIgnoreCase("Chrome")){
            //open Chrome browser
            driver =  new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            //open firefox browser
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            //open edge browser
            driver = new EdgeDriver();
        }else {
            System.out.println("Your browser name is wrong or not implemented : "+browserName);
        }

        driver.get(loadProp.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximizing the window
        driver.manage().window().maximize();
        //Typing url
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        //to close the browser
        driver.close();
    }

}




