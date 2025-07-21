package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage{

    private final By ACCOUNTS = By.cssSelector("[title=Accounts]");
    private final By NEW_BUTTON = By.xpath("//div[text()='New']");
    private final By MESSAGE = By.xpath("//span[contains(@class, 'toastMessage')]");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Переключаемся на вкладку Accounts")
    public void accountsTabClick() {
        driver.findElement(ACCOUNTS).click();
    }

    @Step("Кликаем на кнопку New")
    public void newAccountButtonClick() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON)).click();
    }

    public String getPopUpMessage() {
        return driver.findElement(MESSAGE).getText();
    }
}
