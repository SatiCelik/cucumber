package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Day19_Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    @Given("user is on the application page")
    public void user_is_on_the_application_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_qa_environment"));
        try{
            Thread.sleep(1000);
            loginPage.advancedLink.click();
            Thread.sleep(1000);
            loginPage.proceedLink.click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Advanced Link and Proceed Link is not displayed");
        }
    }
    @Given("user enters manager id {string}")
    public void user_enters_manager_id(String string) {
//We do not have page objects yet. Create them
        loginPage.username.sendKeys(string);
    }
    @Given("user enters manager password {string}")
    public void user_enters_manager_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginButton.click();
    }
    @Then("verify the {string} is displayed")
    public void verify_the_is_displayed(String string) {
        Assert.assertEquals(defaultPage.userId.getText(),string);
    }
    @Given("user enters manager_id and manager_password")
    public void user_enters_manager_id_and_manager_password(DataTable credentials) {

        List<String> managerCredentials = credentials.row(0);//Test data is on the first row
        System.out.println(managerCredentials);//[manager, Manager1!]
        System.out.println(managerCredentials.get(0));//manager
        System.out.println(managerCredentials.get(1));//Manager1!
        loginPage.username.sendKeys(managerCredentials.get(0));
        loginPage.password.sendKeys(managerCredentials.get(1));
    }
}
