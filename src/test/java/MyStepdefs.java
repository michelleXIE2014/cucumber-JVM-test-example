import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
private Page page = new Page();
	
	@Then("Verify the question total = 45")
	public void thenThenProperResultShouldBeDisplayedInResultsPage(){
		 System.out.println("THEN");
		 page.verfyTotalOfQuestion();
		 page.quitDriver();
	}
	
	@When("Enter skill id = 3")
	public void whenWhenEnterTestAutomationInSearchBox(){
		 System.out.println("WHEN");
		 page.searchSkill();
		 
	}
	
	@Given("Open the education-tool home page")
	public void givenGivenOpenTheGoogleHomePageWwwgooglecom(){
		System.out.println("GIVEN");
		page.goTo();
	}
    
}