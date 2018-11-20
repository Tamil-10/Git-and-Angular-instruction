import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class face {
  
	 public static void main(String[] args) throws Exception {
		 
        try {
		 ChromeOptions options = new ChromeOptions();
		 
		 options.addArguments("--disable-notifications");
		 
    	String expath = "C:\\chromedriver.exe";

	    System.setProperty("webdriver.chrome.driver", expath);
	        
	    WebDriver  driver =  new ChromeDriver(options);
        
        String url = "https://www.facebook.com/";
                
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
//        driver.manage().window().maximize();
        
        driver.get(url);
        //String name="hello";
//        
//        WebElement postArea = driver.findElement(By.xpath("//*[@id=\"js_7\"]"));
//        System.out.println("found");
//        postArea.sendKeys("Welcome");;
//        System.out.println("sent");
//        WebElement postBtn = driver.findElement(By.xpath("//button[contains(.,'Post')]"));
//        postBtn.click();
        
        Actions actions = new Actions(driver);
        WebElement postArea = driver.findElement(By.xpath("//*[@id=\"js_7\"]"));
        actions.moveToElement(postArea);	
        actions.click();
        actions.sendKeys("SOME DATA");
        WebElement postBtn = driver.findElement(By.xpath("//button[contains(.,'Post')]"));
        actions.moveToElement(postBtn);
        actions.click();
        
        
        
        
        
   /*     WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"js_da\"]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"js_da\"]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div")));
         driver.findElement(By.xpath("//*[@id=\"js_da\"]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div")).click();

         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@contenteditable='true']")));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));
       driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys("Hello World");
        
        */
        
        

      
    
//        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tamil@izoomstudios.com");
//        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sathish1993");
//        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
      //*[@id="userNav"]
        
        /*
        driver.findElement(By.xpath("//*[@title='Profile']")).click();
      
        driver.findElement(By.xpath("//*[@data-tab-key='friends']")).click();
        
      //*[@id="u_fetchstream_1_9"]/li[3]/a


        List<WebElement> listoffriends = driver.findElements(By.xpath("//div[@id='pagelet_timeline_medley_friends']/div[2]/div/ul/li/div/div/div[2]/div/div[2]/div/a"));
        System.out.println(listoffriends.size());

        int newfriends = listoffriends.size();
         int oldfriends = 0;
         Actions act = new Actions(driver);
         while(oldfriends != newfriends){
             oldfriends = newfriends ;
             WebElement lastfriend = listoffriends.get(newfriends-1);
             act.moveToElement(lastfriend).build().perform();
             Thread.sleep(4000);
             listoffriends = driver.findElements(By.xpath("//div[@id='pagelet_timeline_medley_friends']/div[2]/div/ul/li/div/div/div[2]/div/div[2]/div/a"));             
             newfriends = listoffriends.size();
             System.out.println("New friends list : " + newfriends);
             System.out.println("Old friends list : " + oldfriends);
         }

         for (int i =0 ; i< newfriends ; i++){

             System.out.println("Fiend name : " + listoffriends.get(i).getText());
         }
         driver.findElement(By.xpath("//*[@title='Profile']")).click();
//         driver.findElement(By.xpath("//*[@id=\"js_1r\"]")).sendKeys("Testing Java and Selenium");
         driver.findElement(By.xpath("//*[@id=\"js_1gj\"]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/span")).sendKeys("Bot is typing here");
         

         WebElement postBtn = driver.findElement(By.xpath("//button[contains(.,'Post')]"));
         postBtn.click();*/
//         WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
//         lstitem.click();
//         
//         driver.findElement(By.partialLinkText("Log Out")).click();
//
//         System.out.println("Log out");
//         driver.close();
    }
        catch (Exception e) {
            // Exception handling statements
        	System.out.println(e);
        	
          }
    
  
    
}
}
































//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class face {
//  
//	 public static void main(String[] args) throws Exception {
//		 
//        try {
//		 ChromeOptions options = new ChromeOptions();
//		 
//		 options.addArguments("--disable-notifications");
//		 
//    	String expath = "C:\\chromedriver.exe";
//
//	    System.setProperty("webdriver.chrome.driver", expath);
//	        
//	    WebDriver  driver =  new ChromeDriver(options);
//        
//        String url = "https://www.facebook.com/";
//                
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        
////        driver.manage().window().maximize();
//        
//        driver.get(url);
//        
//   
//
//
//      
//    
////        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tamil@izoomstudios.com");
////        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sathish1993");
////        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
//      //*[@id="userNav"]
//        driver.findElement(By.xpath("//*[@title='Profile']")).click();
//      
//        driver.findElement(By.xpath("//*[@data-tab-key='friends']")).click();
//        
//      //*[@id="u_fetchstream_1_9"]/li[3]/a
//
//
//        List<WebElement> listoffriends = driver.findElements(By.xpath("//div[@id='pagelet_timeline_medley_friends']/div[2]/div/ul/li/div/div/div[2]/div/div[2]/div/a"));
//        System.out.println(listoffriends.size());
//
//        int newfriends = listoffriends.size();
//         int oldfriends = 0;
//         Actions act = new Actions(driver);
//         while(oldfriends != newfriends){
//             oldfriends = newfriends ;
//             WebElement lastfriend = listoffriends.get(newfriends-1);
//             act.moveToElement(lastfriend).build().perform();
//             Thread.sleep(4000);
//             listoffriends = driver.findElements(By.xpath("//div[@id='pagelet_timeline_medley_friends']/div[2]/div/ul/li/div/div/div[2]/div/div[2]/div/a"));             
//             newfriends = listoffriends.size();
//             System.out.println("New friends list : " + newfriends);
//             System.out.println("Old friends list : " + oldfriends);
//         }
//
//         for (int i =0 ; i< newfriends ; i++){
//
//             System.out.println("Fiend name : " + listoffriends.get(i).getText());
//         }
//         driver.findElement(By.xpath("//*[@title='Profile']")).click();
////         driver.findElement(By.xpath("//*[@id=\"js_1r\"]")).sendKeys("Testing Java and Selenium");
//         driver.findElement(By.xpath("//*[@id=\"js_1gj\"]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/span")).sendKeys("Bot is typing here");
//         
//
//         WebElement postBtn = driver.findElement(By.xpath("//button[contains(.,'Post')]"));
//         postBtn.click();
////         WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
////         lstitem.click();
////         
////         driver.findElement(By.partialLinkText("Log Out")).click();
////
////         System.out.println("Log out");
////         driver.close();
//    }
//        catch (Exception e) {
//            // Exception handling statements
//        	System.out.println(e);
//        	
//          }
//    
//  
//    
//}
//}
//
//
//
//
//
//
