package org.system.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://sendpro.pitneybowes.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/form/div/input")).sendKeys("SendProNOCSupportUS@pb.com");
}
}