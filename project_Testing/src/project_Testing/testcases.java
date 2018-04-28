package project_Testing;

import java.util.concurrent.TimeUnit;
import java.lang.*;
import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class testcases {

	@Test
	public void signuptest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).sendKeys("mohamed");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).sendKeys("mo");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select ")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select")).sendKeys("Customer");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[4]")).click();
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signuptest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select ")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[4]")).click();
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signuptest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select ")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[4]")).click();
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signuptest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select ")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select")).sendKeys("Customer");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[4]")).click();
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signuptest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select ")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[4]")).click();
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signuptest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).sendKeys("ahmed");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select ")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[4]")).click();
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signuptest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[1]")).sendKeys("amir");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[2]")).sendKeys("amir");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[3]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select ")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/select")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[1]/input[4]")).click();
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signintest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		String accepted = "http://localhost:4200/admin";
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signintest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		String accepted = "http://localhost:4200";
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signintest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		String accepted = "http://localhost:4200";
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signintest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("' or '1'='1");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("    ");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		String accepted = "http://localhost:4200";
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signintest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		String accepted = "http://localhost:4200";
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signintest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		String accepted = "http://localhost:4200";
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void signintest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://localhost:4200/admin");
		String accepted = "http://localhost:4200";
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttosystest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).sendKeys("newproduct");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).sendKeys("newproduct");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).sendKeys("1200");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[4]")).click();
		
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttosystest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[4]")).click();
		
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttosystest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttosystest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).sendKeys("product1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).sendKeys("category1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).sendKeys("100");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[4]")).click();
		
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttosystest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).sendKeys("000");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).sendKeys("non");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttosystest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).sendKeys("product1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).sendKeys("category2");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).sendKeys("50");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[4]")).click();
		
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttosystest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[1]")).sendKeys("product1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[2]")).sendKeys("category1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[3]")).sendKeys("10");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addbrandtest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).sendKeys("brand2");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).sendKeys("category1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addbrandtest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).sendKeys("brand1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).sendKeys("category1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addbrandtest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addbrandtest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addbrandtest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).sendKeys("brand1");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).sendKeys("category2");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addbrandtest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).sendKeys("brand4");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addbrandtest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("islam");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[1]")).sendKeys("brand4");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/form[2]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addstoretest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).sendKeys("egypt");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).sendKeys("sports");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[4]")).click();
		
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addstoretest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).sendKeys("store2");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).sendKeys("egypt");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).sendKeys("sports");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addstoretest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addstoretest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[4]")).click();
		
		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addstoretest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addstoretest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).sendKeys("store");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addstoretest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[1]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[2]")).sendKeys("egypt");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[3]")).sendKeys("anything");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[1]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttostoretest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).sendKeys("product1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).sendKeys("brand1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttostoretest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).sendKeys("product2");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).sendKeys("brand2");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).sendKeys("store2");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttostoretest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttostoretest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttostoretest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).sendKeys("product");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).sendKeys("brand1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttostoretest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).sendKeys("product1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).sendKeys("brand2");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addproducttostoretest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[1]")).sendKeys("product1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[2]")).sendKeys("brand1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[3]")).sendKeys("store2");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[2]/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addcollaporatortest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).sendKeys("lotfy");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addcollaporatortest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addcollaporatortest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).sendKeys("store");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).sendKeys("ahmed");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addcollaporatortest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addcollaporatortest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addcollaporatortest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).sendKeys("store1");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).sendKeys("ahmed");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void addcollaporatortest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("hussein");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[1]")).sendKeys("sto");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[2]")).sendKeys("lotfy");
		driver.findElement(By.xpath("/html/body/app-root/app-storeowner/form[3]/input[3]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void buytest1()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[1]")).sendKeys("5");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[2]")).sendKeys("cairo");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}

	@Test
	public void buytest2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void buytest3()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[1]")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void buytest4()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[1]")).sendKeys("-6");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[2]")).sendKeys("cairo");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void buytest5()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[1]")).sendKeys("-2");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[2]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void buytest6()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[1]")).sendKeys("p");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[2]")).sendKeys("b");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	@Test
	public void buytest7()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\fci\\Software Engineering2\\Assignment 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[1]")).sendKeys("3mad");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/app-root/app-index/form[2]/input[3]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[1]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[2]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-customer/div/div/form/input[4]")).click();

		String accepted = driver.getCurrentUrl();
		Assert.assertEquals(accepted, driver.getCurrentUrl());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
