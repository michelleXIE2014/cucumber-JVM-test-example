
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
public class Page {
	public Page(){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }
	
	private WebDriver driver = new FirefoxDriver();
    
    @FindBy(css = "[role='skill-id']")
    private WebElement skillId;
    
    @FindBy(css = "[role='submit']")
    private WebElement submit;
    
    @FindBy(css = "[role='question-box'] .btn.btn-default")
    private List<WebElement> questionList;
    
    
    public void goTo() {
		 driver.get(url);
     }
     
     public void searchSkill(){
    	 skillId.sendKeys("3");
    	 submit.click();
     }
     
     public void verfyTotalOfQuestion(){
    	 int totalOfQuestion = questionList.size();
    	 System.out.println("total of question = " + totalOfQuestion);
    	 Assert.assertTrue(totalOfQuestion == 45);
     }
     
     public void quitDriver() {
    	 driver.quit();
     }
}
