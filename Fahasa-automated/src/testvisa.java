import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testvisa {
	public static String driverPath = "E:/Soft/Webdriver/";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Mo trinh duyet Chrome");
		//Chinh lai duong dan cho chrome driver
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		//Mo trinh duyet
		driver = new ChromeDriver();
		//Di den trang chu
		driver.navigate().to("https://123pay.vn/ib/cc/?orderNo=123P1711178012237&merchantCode=FAHASACOM&amount=82200&description=VGhhbmggdG9hbiBkb24gaGFuZyAxMDA0MjQ4Njk&bankCode=123PCC&checksum=ce89bfd14b4ae3814aef987ae16deefa11cb53b6");
		Thread.sleep(5000);
		WebElement sothe = driver.findElement(By.cssSelector("#maskCardNumber"));
		sothe.sendKeys("4716798624671372");
		WebElement hoten = driver.findElement(By.cssSelector("#fullName"));
		hoten.sendKeys("NGUYEN HAI DUONG");
		WebElement ngay = driver.findElement(By.cssSelector("#ccExpire"));
		ngay.sendKeys("11/18");
		WebElement CVV = driver.findElement(By.cssSelector("#maskCardCVV"));
		CVV.sendKeys("123");
		//Xac nhan hoan tat giao dich
		WebElement giaodich = driver.findElement(By.cssSelector("#btSubmit"));
		giaodich.click();
		Thread.sleep(5000);
	}

}
