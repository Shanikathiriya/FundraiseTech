package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Findcause extends Utils
{

    By search=(By.xpath("//*[@id=\"sagc-hero-search-input-input-wrap\"]/div/div"));
    public void SearchCause() {


        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/header/div/div/div[2]/nav/div[2]/a")).click();
        waitForVisible(search, 20);


    }

    public void Typechar()
    {
        driver.findElement(By.name("cause")).sendKeys("kr");



    }
    public void chooseThirdOption()
    {
        List<WebElement> findElements = driver.findElements(By.xpath("//ul[@id='sagc-hero-search-input-auto-suggest']"));
        System.out.println(findElements.size());
        String third_link = findElements.get(2).getAttribute("href");
        driver.navigate().to(third_link);

    }
}
