package stepdefinition;

import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import resources.DriverLoad;

import java.io.IOException;

public class AnyDoLoginSteps extends DriverLoad {

    public WebDriver driver;
    public LoginPage lp1;

    @Given("When user is on HomePage")
    public void when_user_is_on_home_page() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
    }

    @When("Title of login page is To do list app with Calendar, Planner & Reminders | Any.do")
    public void title_of_login_page_is_to_do_list_app_with_calendar_planner_reminders_any_do() {

        String title = driver.getTitle();

        Assert.assertEquals("To do list app with Calendar, Planner & Reminders | Any.do", title);

//        if (title.equals("To do list app with Calendar, Planner & Reminders | Any.do")) {
//
//            System.out.println("User landed on the right page");
//        } else {
//
//            System.out.println("User landed on the wrong page");
//        }
    }

    @Then("User clicks on Login button")
    public void user_clicks_on_login_button() {

        lp1 = new LoginPage(driver);
        lp1.login().click();
    }

    @Then("User clicks on Continue with Email or Apple")
    public void user_clicks_on_continue_with_email_or_apple() {

        lp1.loginWithEmail().click();
    }

    @Then("User enters his email")
    public void user_enters_his_email() {

        lp1.email().sendKeys(prop.getProperty("email"));
    }

    @Then("User clicks on submit button")
    public void user_clicks_on_submit_button() {

        lp1.next().click();
    }

    @Then("User enters his password")
    public void user_enters_his_password() {

        lp1.password().sendKeys(prop.getProperty("password"));
    }

    @Then("User clicks on Sign In")
    public void user_clicks_on_sign_in() {

        lp1.submit().click();
    }
}
