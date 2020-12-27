import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Path to your feature files
        features = {"src/test/resources/features"},

        // Specify the step definition package name
        glue = {"stepDefinition", "DriverWrapper"},

        // Specify tags to be executed
        tags = {"@smoke"},

        // readable console logs
        monochrome = true,

        // This createa cucumber reports
        plugin = {"pretty", "html:Reports/Default/"},

        // This create auto method nam in camelCase
        snippets = SnippetType.CAMELCASE
)

public class TestRunner {
}
