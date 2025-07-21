package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    private final By APP_LAUNCHER_BUTTON = By.xpath("//button[@title='App Launcher']");
    private final By SALES_CONSOLE_BUTTON = By.xpath("//span/p[text()='Sales Console']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Нажимаем на меню в форме кубика-рубика")
    public void appLauncherClick() {
        driver.findElement(APP_LAUNCHER_BUTTON).click();
    }

    @Step("Выбираем пункт Sales Console")
    public void salesConsoleClick() {
        driver.findElement(SALES_CONSOLE_BUTTON).click();
    }

}
