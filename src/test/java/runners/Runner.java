package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@google_search",
        dryRun = false
)
public class Runner {

    //        Driver.getDriver().findElement(By.xpath("//*[@id='L2AGLb']")).click();  // COOKIE ISSUE ICIN KULLANILIR


}
