package automated;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Firefox
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
//		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		//comment the above line and uncomment below line to use on Windows
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://localhost:3000/";
        String expectedTitle = "React App";
        String actualTitle = "";

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Correct Landing Page!");
        } else {
            System.out.println("Wrong landing Page!");
        }
        
        // Enter First Name
        driver.findElement(By.name("firstName")).click();
        WebElement UsernameField = driver.findElement(By.name("firstName"));
        UsernameField.sendKeys("John");
        
        // Enter Middle Name
        WebElement middlenameField = driver.findElement(By.name("middleName"));
        middlenameField.sendKeys("T.");
        
        // Enter Last Name
        WebElement lastnameField = driver.findElement(By.name("lastName"));
        lastnameField.sendKeys("Doe");
        
       // Enter Phone Number
        WebElement phoneField = driver.findElement(By.name("phoneNumber"));
        phoneField.sendKeys("0209331457");
        
       // Enter Date of Birth
        WebElement dobField = driver.findElement(By.name("dob"));
        dobField.sendKeys("01091993");
        
       // Enter Address
        driver.findElement(By.name("address")).click();
        WebElement addressField = driver.findElement(By.name("address"));
        addressField.sendKeys("HNo. 27, Mellon Road, Adenta-Frafraha");
        
       // Click on the Add New User Button
        driver.findElement(By.linkText("Add New User")).click();

        
        WebElement createdUser = driver.findElement(By.xpath("//div/h4[text()='John T. Doe']"));
        
        
        if(createdUser.getText().contentEquals("John T. Doe")) {
        	System.out.println("The User has been succesfully created!");
        	System.out.println("Test Passed!");
        }
        else {
        	System.out.println("The User has not been created");
        }
        
        
        //close Chrome
//        driver.close();
       
    }

}
