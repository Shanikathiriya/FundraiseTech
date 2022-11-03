package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest extends Utils  // create base test class which is extend utils
{
    BrowserManager browserManager=new BrowserManager();
    @Before
    public void setUpBrowser() throws InterruptedException // create method for open browser
    {
        browserManager.openBrowser();

    }
    @After

    public void closeBrowser(){


        browserManager.closeBrowser();
    }

}
