import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Verem\\IdeaProjects\\seleniumsettings\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.mediaexpert.pl/login");

        driver.findElement(By.xpath("//div[@id = 'section_login-box']//label//input[@type = 'email']")).sendKeys("verem10@mail.ru");
        driver.findElement(By.xpath("//div[@id = 'section_login-box']//label//input[@type = 'password']")).sendKeys("SeleniumTest1");
        driver.findElement(By.xpath("//div[@id = 'section_login-box']//form//button[@type = 'submit']")).click();
        Thread.sleep(7000);

        driver.get("https://www.mediaexpert.pl/smartfony-i-zegarki/smartfony/smartfon-apple-iphone-13-128gb-5g-6-1-bialy-mlpg3pm-a");


        String available = null;
        try {
            available = driver.findElement(By.xpath("//div[@id = 'section_page-summary-box']//span/span[@class = 'unavailable']")).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (available == "niedostępny") {
            driver.navigate().refresh();
        }


        //driver.findElement(By.xpath("//header[@class = 'header-desktop']//div[@class = 'search search-element']//div[@class = 'search-content']//input")).sendKeys("iphone 13 pro");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//header[@class = 'header-desktop']//form[@class = 'search-input']//button")).click();
        Thread.sleep(10000);




//        for(int i = 0; i < 10; i++){
//            driver.navigate().refresh();
//            Thread.sleep(10000);
//        }

    }

}
