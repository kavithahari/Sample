import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Window_Nav {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\A Kavitha\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://google.com");

driver.navigate().to("https://rahulshettyacademy.com");

driver.navigate().back();

driver.navigate().forward();

System.out.println("Gate 2023");
System.out.println("PGCET 2023");
System.out.println("Exam well done");
System.out.println("Btech exams coming up");
}



}