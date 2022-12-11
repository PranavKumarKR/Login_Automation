import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Automation{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ineuron-courses.vercel.app/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='subLink']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("name")).sendKeys("Pranav Kumar K R");
        driver.findElement(By.name("email")).sendKeys("pranavkumar@gmail.com");
        driver.findElement(By.name("password")).sendKeys("ineuron.ai");
        driver.findElement(By.xpath("//*[text()='Testing']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//select[@name='state']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='Tamil Nadu']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

     driver.get("http://ineuron-courses.vercel.app/login");
        Thread.sleep(1000);
        driver.findElement(By.id("email1")).sendKeys("pranavkumar.pk817@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password1")).sendKeys("ineuron.ai");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }}
