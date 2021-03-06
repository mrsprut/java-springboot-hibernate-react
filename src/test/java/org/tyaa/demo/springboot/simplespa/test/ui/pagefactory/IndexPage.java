package org.tyaa.demo.springboot.simplespa.test.ui.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/* PageObject для каркасной страницы index.html */
public class IndexPage extends AbstractPage {

    // пункт меню "Вход" находим на этапе выполнения конструктора
    // родительского класса
    @FindBy(css = "nav a[href*='signin']")
    private WebElement signInButton;
    // для пункта "Выход" подготавливаем только селектор,
    // потому что он будет отображаться только после входа
    private By logOutButton = By.cssSelector("nav a[href*='#!home:out']");

    public IndexPage(WebDriver driver) {
        super(driver);
        System.out.println("IndexPage Loaded");
    }

    public SignInPage clickSignIn() {
        signInButton.click();
        return new SignInPage(driver);
    }

    public String getLogOutButtonText() {
        List<WebElement> logOutButtonElement =
                driver.findElements(logOutButton);
        return !logOutButtonElement.isEmpty() ? logOutButtonElement.get(0).getText() : null;
    }
}
