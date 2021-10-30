package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day18_Amazon_Search {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user is on amazon page")
    public void user_is_on_amazon_page() {

    }
    @Given("user searchs for {string}")
    public void user_searchs_for(String string) {

    }
    @Then("user verifies result {string}")
    public void user_verifies_result(String string) {

    }


}
