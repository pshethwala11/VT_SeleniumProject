package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GithubConstants;


public class SearchRepoPage implements GithubConstants {
	@FindBy(xpath = GithubConstants.SEARCH_REPO)
	WebElement search_Repo;

	@FindBy(xpath = GithubConstants.SELECT_REPO)
	WebElement select_Repo;

	@FindBy(xpath = GithubConstants.MESSAGE)
	WebElement message;

	public SearchRepoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectRepo(String repo) {
		search_Repo.sendKeys(repo);
		search_Repo.sendKeys(Keys.RETURN);
	}

	public String message() {
		return message.getText();
	}


}
				      

		

