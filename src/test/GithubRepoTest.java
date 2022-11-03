package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import pages.GithubRepoWebPage;
import pages.SearchRepoPage;


public class GithubRepoTest extends BaseTest{
	static Logger log = Logger.getLogger(GithubRepoTest.class.getName());

    GithubRepoWebPage githubRepoWeb;
    SearchRepoPage searchRepoWeb;

    @Test
    public void getAllRepositories() throws Exception {

        githubRepoWeb = new GithubRepoWebPage(driver);

        // Verify project name
        Assert.assertEquals(githubRepoWeb.myProject(), "Django");

        log.info("CLICK REPOSITORY TAB");
        githubRepoWeb.repository();

        Thread.sleep(1000);

        log.info("LIST ALL REPOSITORIES");
        githubRepoWeb.webRepositories();


    }
        @Test
        public void searchRepository() throws Exception {

        searchRepoWeb = new SearchRepoPage(driver);

        log.info("SEARCH REPOSITORIES");
        searchRepoWeb.selectRepo("deps");

        Thread.sleep(1000);

        Assert.assertEquals(searchRepoWeb.message(), "1 repository result or view all results on GitHub");
        		
         }

}
    


