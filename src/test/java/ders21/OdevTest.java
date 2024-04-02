package ders21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class OdevTest {

	@Test
	void firstTest() {

		System.setProperty("webdirever.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/elements");

		String pageTitle = driver.getTitle();

		System.out.println(pageTitle);

		WebElement Buttons = driver.findElement(By.xpath("//*[@id='item-4']"));
		Buttons.click();
		WebElement textButtons = driver.findElement(By.xpath("//h1[contains(text(),'Buttons')]"));
		String control = textButtons.getText();

		WebElement clickMe = driver.findElement(By.xpath("//button[starts-with(text(), 'Click')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickMe);

		WebElement text = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
		String Metin = text.getText();

		System.out.println(Metin);

	}

	@Test
	void secondTest() {

		System.setProperty("webdirever.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/webtables");

		String pageTitle = driver.getTitle();

		System.out.println(pageTitle);

		WebElement Add = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		Add.click();
		
		
		WebElement textTable = driver.findElement(By.xpath("//div[@id='registration-form-modal']"));
		String control = textTable.getText();

		System.out.println(control);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.click();
		firstName.sendKeys("Emre");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.click();
		lastName.sendKeys("Eser");

		WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		eMail.click();
		eMail.sendKeys("emre.eser@sebit.com.tr");

		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
		age.click();
		age.sendKeys("28");

		WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
		salary.click();
		salary.sendKeys("34000");

		WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
		department.click();
		department.sendKeys("IT");

		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();

		WebElement duzenle = driver.findElement(By.xpath("//span[@id='edit-record-4']"));
		duzenle.click();

		WebElement ageEdit = driver.findElement(By.xpath("//input[@id='age']"));
		ageEdit.click();
		ageEdit.clear();
		ageEdit.sendKeys("23");

		WebElement editSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
		editSubmit.click();

		WebElement newage = driver.findElement(By.xpath("//div[contains(text(),'45')]"));
		String text = newage.getText();

		System.out.println(text);

	}

}
