package step_definition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/test/test/src/test/resources/feature/LogIn.feature"},
        plugin = {"json:D:/test/test/target/1.json"},
        monochrome = true,
        tags = {"@ForgottenPassword"},
        glue = {"step_definition"})
public class Login_01ITesta {
}