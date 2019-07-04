package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/skeleton/scenario1reg.feature","src/test/resources/skeleton/scenario2login.feature","src/test/resources/skeleton/scenario3search.feature","src/test/resources/skeleton/scenario4add.feature"},glue="skeleton",plugin="json:target/jsonreport.json")
public class RunCukesTest {
}
