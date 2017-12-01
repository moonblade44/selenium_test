import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class testdangky {
	public static String driverPath = "E:/Soft/Webdriver/";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Mo trinh duyet Chrome");
		//Chinh lai duong dan cho chrome driver
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		//Mo trinh duyet
		driver = new ChromeDriver();
		//Di den trang dang ki
		driver.navigate().to("https://www.fahasa.com/customer/account/create");
		//Bam vao o ten 
		WebElement Ten = driver.findElement(By.cssSelector("#firstname"));
		//Nhap ten 
		Ten.sendKeys("Tiến");
		Thread.sleep(2000);
		//Bam vao Ho
		WebElement Ho = driver.findElement(By.cssSelector("#lastname"));
		//Nhap ho
		Ho.sendKeys("Nguyễn Trần Trung");
		Thread.sleep(2000);
		//Bam vao Email
		WebElement Email = driver.findElement(By.cssSelector("#email_address"));
		//Nhap Email
		Email.sendKeys("giun@mailinator.com");
		Thread.sleep(2000);
		//Bam vao ngay sinh-DD
		WebElement Ngay = driver.findElement(By.cssSelector("#day"));
		//Nhap ngay sinh
		Ngay.sendKeys("21");
		Thread.sleep(2000);
		//Bam vao thang sinh-MM
		WebElement Thang = driver.findElement(By.cssSelector("#month"));
		//Nhap thang sinh
		Thang.sendKeys("10");
		Thread.sleep(2000);
		//Bam vao nam sinh-YYYY
		WebElement Nam = driver.findElement(By.cssSelector("#year"));
		//Nhap nam sinh
		Nam.sendKeys("1994");
		Thread.sleep(2000);
		//Chon gioi tinh
		Select gioitinh = new Select (driver.findElement(By.cssSelector("#gender")));
		//Chon Nam = cach xem doan chu duoc hien thi
		gioitinh.selectByVisibleText("Nam");
		Thread.sleep(2000);
		//Bam vao mat khau
		WebElement pass = driver.findElement(By.cssSelector("#password"));
		//Nhap mat khau
		pass.sendKeys("123456");
		Thread.sleep(2000);
		//Bam vao xac nhan mat khau
		WebElement confirm = driver.findElement(By.cssSelector("#confirmation"));
		//Nhap lai mat khau
		confirm.sendKeys("123456");
		Thread.sleep(2000);
		//Bam vao button Gởi đi , xac nhan dang ky
		WebElement Button = driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
		Button.click();
	}

}
