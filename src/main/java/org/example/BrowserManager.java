package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager extends basepage // create browser manager class inherit base page class
{



    public void openBrowser()  // create method for open browser
    {


             System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
                driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.easyfundraising.org.uk/");


   }


    public void closeBrowser()//create method for close browser
    {
        driver.close();
    }
}
