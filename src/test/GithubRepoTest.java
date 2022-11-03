package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import pages.GithubRepoWebPage;


public class GithubRepoTest extends BaseTest{
	static Logger log = Logger.getLogger(GithubRepoTest.class.getName());  

    @Test
    public void getAllRepositories() throws Exception {
        
    	GithubRepoWebPage githubRepoWeb =new GithubRepoWebPage(driver);

        // Verify project name
        Assert.assertEquals(githubRepoWeb.myProject(),"Django");

    	log.info("CLICK REPOSITORY TAB");
    	githubRepoWeb.repository();
    	
        Thread.sleep(1000);
        
        log.info("LIST ALL REPOSITORIES");
        githubRepoWeb.webRepositories();
    	
    	Thread.sleep(1000);
        		
         }
        
    }
    


