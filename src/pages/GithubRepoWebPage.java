package pages;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GithubConstants;


public class GithubRepoWebPage implements GithubConstants {
	@FindBy(xpath = GithubConstants.PROJECT)
	WebElement project;
	@FindBy(xpath = GithubConstants.REPOSITORY)
	WebElement repository;

	@FindBy(xpath = GithubConstants.SEARCH_REPO)
	WebElement search_Repo;

	@FindBy(xpath = GithubConstants.SELECT_REPO)
	WebElement select_Repo;

	@FindBy(xpath = GithubConstants.MESSAGE)
	WebElement message;

	@FindBy(xpath = GithubConstants.ALLREPOSITORIES)
	List<WebElement> allRepositories;

	public GithubRepoWebPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// check project name
	public String myProject() {
		return project.getText();
	}

	// click Repository tab
	public void repository() throws Exception {
		repository.click();
	}

	// List all repositories and Descriptions.
	public void webRepositories() {

		for (WebElement repoes : allRepositories) {

			System.out.println("REPOSITORY: " + repoes.findElement(By.xpath("h3/a")).getText());

			if (repoes.findElements(By.xpath("p")).size() == 1) {
				System.out.println("DESCRIPTION: " + repoes.findElement(By.xpath("p")).getText());
			} else {
				System.out.println("No Description Found");
			}
		}

	}

}
				      

		

