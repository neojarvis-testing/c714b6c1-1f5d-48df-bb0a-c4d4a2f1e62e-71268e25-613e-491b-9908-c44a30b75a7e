package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * a. ClassName : TestRunner
 * b. Author : Dharen
 * c. Description : Configures and triggers the execution of Cucumber feature files and associated step definitions.
 */
@RunWith(Cucumber.class)
/*
 * a. Annotation : @RunWith
 * b. Author : Dharen
 * c. Description : Indicates that the class should use Cucumber's JUnit runner to execute the tests.
 */
@CucumberOptions(
    /*
     * a. Parameter : features
     * b. Author : Dharen
     * c. Description : Specifies the path to the directory containing the Cucumber feature files.
     */
    features = "features",
    
    /*
     * a. Parameter : glue
     * b. Author : Dharen
     * c. Description : Specifies the package containing the step definition classes linked to the feature files.
     */
    glue = "stepdefinitions"
)
public class TestRunner {

}
