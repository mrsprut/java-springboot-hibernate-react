package org.tyaa.demo.springboot.simplespa.test.ui.pagefactory;

import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
        System.out.println("HomePage Loaded");
    }
}
