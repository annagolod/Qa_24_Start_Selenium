import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setYp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        //by tag name
List<WebElement> listDiv1 = wd.findElements(By.tagName("div"));
List<WebElement> listDiv2 = wd.findElements(By.cssSelector("div"));

WebElement tN1 = wd.findElement(By.tagName("h1"));
WebElement tN2 = wd.findElement(By.cssSelector("h1"));

WebElement tN3 = wd.findElement(By.tagName("a"));
WebElement tN4 = wd.findElement(By.cssSelector("a"));
List<WebElement> ListA = wd.findElements(By.tagName("a"));

WebElement tN5 = wd.findElement(By.tagName("form"));
WebElement tN6 = wd.findElement(By.cssSelector("form"));

WebElement tN7 = wd.findElement(By.tagName("input"));
WebElement tN8 = wd.findElement(By.cssSelector("input"));
List<WebElement> listInput = wd.findElements(By.cssSelector("input"));

WebElement tN9 = wd.findElement(By.tagName("button"));
WebElement tN10 = wd.findElement(By.cssSelector("button"));
WebElement tN11 = wd.findElement(By.xpath("//button"));

        //by class

        WebElement cl1 = wd.findElement(By.className("container"));
        WebElement cl2 = wd.findElement(By.cssSelector(".container"));
        WebElement cl9 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement cl10 = wd.findElement(By.xpath("//div[@class='container']"));


        WebElement cl3 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement cl4 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement cl5 = wd.findElement(By.className("active"));
        WebElement cl6 = wd.findElement(By.cssSelector(".active"));

        WebElement cl7 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement cl8 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //by id
WebElement id1 = wd.findElement(By.id("root"));
WebElement id2 = wd.findElement(By.cssSelector("#root"));
WebElement id3 = wd.findElement(By.cssSelector("[id='root']"));
WebElement id4 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute

        WebElement el1 = wd.findElement(By.cssSelector("[style]"));
        WebElement el2 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el3 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement el4 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el5 = wd.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));
        WebElement el6 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el7 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement el8 = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement el9 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement el10 = wd.findElement(By.name("registration"));
        WebElement el14 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //one of elements find by attribute ==> start & end & contains value

        WebElement el11 = wd.findElement(By.cssSelector("[style ^= 'border']"));
        WebElement el15 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Em')]"));
        WebElement el12 = wd.findElement(By.cssSelector("[style $= 'white;']"));
        // for end   in xPath we can use "contains"
        WebElement el13 = wd.findElement(By.cssSelector("[style *= 'black']"));
        WebElement el16 = wd.findElement(By.xpath("//*[contains(@placeholder, 'ss')]"));

        //by linkText (partialLinkText)

        WebElement el18 = wd.findElement(By.linkText("HOME"));
        WebElement el19 = wd.findElement(By.partialLinkText("LOG"));

        //by text
        WebElement el17 = wd.findElement(By.xpath("//a[text() = 'ABOUT']"));

    }
    @AfterClass
    public void closeBrowser(){
        wd.quit();

    }
}
