package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.PickList;
import wrappers.Textarea;

public class NewAccountModal extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    private final By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");
    private final By SCROLL_TO_ELEMENT = By.xpath("//span[text()='VIP Client']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Step("Заполняем поля нового аккаунта")
    public void createAccount(String rating, String type, String industry, String ownership, String name, String phone,
                              String fax, String website, String number, String accountSite, String symbol, String employees,
                              String revenue, String code, String billingStreet, String shippingStreet) {

        new PickList(driver, "Rating").select(rating);
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Number").write(number);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(symbol);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(SCROLL_TO_ELEMENT));
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(revenue);
        new Input(driver, "SIC Code").write(code);
        new PickList(driver, "Type").select(type);
        new PickList(driver, "Industry").select(industry);
        new PickList(driver, "Ownership").select(ownership);
        new Textarea(driver, "Billing Street").write(billingStreet);
        new Textarea(driver, "Shipping Street").write(shippingStreet);
        new Checkbox(driver, "VIP Client").check();
        new Checkbox(driver, "TeachMeSkills").check();
    }

    @Step("Нажимаем на кнопку Save")
    public void saveButtonClick() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
