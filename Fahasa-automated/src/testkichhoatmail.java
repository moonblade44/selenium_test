
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testkichhoatmail {
			public static String driverPath = "E:/Soft/Webdriver/";
			public static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				System.out.println("Mo trinh duyet Chrome");
				//Chinh lai duong dan cho chrome driver
				System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
				//Mo trinh duyet
				driver = new ChromeDriver();
				//Di den trang mail
				driver.navigate().to("https://www.mailinator.com/");
				//Bam vao o nhap mail 
				WebElement Email = driver.findElement(By.cssSelector("#inboxfield"));
				//Nhap vao dia chi mail
				Email.sendKeys("giun");
				//Bam vao button Go
				WebElement Button = driver.findElement(By.cssSelector("body > section.content-block-nopad.content-3-2 > div > div.col-lg-5.col-md-6.col-sm-6 > div.panel.panel-info > div.panel-body > div.input-group > span > button"));
				Button.click();
				Thread.sleep(2000);
				//Tim kiem mail lien quan den kich hoat tai khoan Fahasa
				WebElement mail = driver.findElement(By.xpath("//*[text() = 'Fahasa - Hỗ trợ khách hàng']"));
				Thread.sleep(2000);
				//Bam vao do
				mail.click();
				//Chuyen sang frame cua mail
				driver.switchTo().frame("msg_body");
				Thread.sleep(2000);
				//Tim kiem dong chu co chua link kich hoat va bam vao
				driver.findElement(By.partialLinkText("link xác nhận này")).click();
				
			
				
	}

}
