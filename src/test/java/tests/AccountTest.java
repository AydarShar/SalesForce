package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() {

        loginPage.open();
        loginPage.login("tborodich@tms.sandbox", "Password003!");
        mainPage.appLauncherClick();
        mainPage.salesConsoleClick();
        accountsPage.accountsTabClick();
        accountsPage.newAccountButtonClick();
        newAccountModal.createAccount("Warm", "Prospect", "Apparel", "Public",
                "Michael", "+782394623672", "267384", "www.jordan.com", "23",
                "MJ23", "23", "1001", "100 billion", "23",
                "15 avenue", "14 avenue");
        newAccountModal.saveButtonClick();
        assertEquals(accountsPage.getPopUpMessage(), "Account \"Michael\" was created.");
    }
}
