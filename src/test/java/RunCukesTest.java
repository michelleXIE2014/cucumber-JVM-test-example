import org.testng.annotations.Test;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class RunCukesTest extends AbstractTestNGCucumberTests{
	@Test
	 public void runCukes()  {
		 new TestNGCucumberRunner(getClass()).runCukes();
	    }
}