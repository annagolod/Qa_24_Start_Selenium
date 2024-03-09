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
List<WebElement> listDivX = wd.findElements(By.xpath("//div"));

WebElement tN1 = wd.findElement(By.tagName("h1"));
WebElement tN2 = wd.findElement(By.cssSelector("h1"));
WebElement tN4 = wd.findElement(By.xpath("//h1"));

WebElement tN5 = wd.findElement(By.tagName("a"));
WebElement tN6 = wd.findElement(By.cssSelector("a"));
WebElement tN7 = wd.findElement(By.xpath("//a"));
List<WebElement> ListA = wd.findElements(By.tagName("a"));
List<WebElement> ListAX = wd.findElements(By.xpath("//a"));

WebElement tN8 = wd.findElement(By.tagName("form"));
WebElement tN9 = wd.findElement(By.cssSelector("form"));
WebElement tN10 = wd.findElement(By.xpath("//form"));

WebElement tN11 = wd.findElement(By.tagName("input"));
WebElement tN12 = wd.findElement(By.cssSelector("input"));
WebElement tN13 = wd.findElement(By.xpath("//input"));
List<WebElement> listInput = wd.findElements(By.cssSelector("input"));
List<WebElement> listInputX = wd.findElements(By.xpath("//input"));

WebElement tN14 = wd.findElement(By.tagName("button"));
WebElement tN15 = wd.findElement(By.cssSelector("button"));
WebElement tN16 = wd.findElement(By.xpath("//button"));


        //by class

        WebElement cl1 = wd.findElement(By.className("container"));
        WebElement cl2 = wd.findElement(By.cssSelector(".container"));
        WebElement cl3 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement cl4 = wd.findElement(By.xpath("//div[@class='container']"));

        WebElement cl5 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement cl6 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement cl7 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));
        WebElement cl8 = wd.findElement(By.xpath("//div[@class = 'navbar-component_nav__1X_4m']"));

        WebElement cl9 = wd.findElement(By.className("active"));
        WebElement cl10 = wd.findElement(By.cssSelector(".active"));
        WebElement cl11 = wd.findElement(By.xpath("//a[@class = 'active']"));
        WebElement cl12 = wd.findElement(By.xpath("//*[@class = 'active']"));

        WebElement cl13 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement cl14 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement cl15 = wd.findElement(By.xpath("//div[@class = 'login_login__3EHKB']"));
        WebElement cl16 = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));

        //by id

        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id2 = wd.findElement(By.cssSelector("#root"));
        WebElement id3 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement id4 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute

        WebElement el1 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el2 = wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement el3 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement el4 = wd.findElement(By.xpath("//*[@href='/about']"));
        WebElement el5 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el6 = wd.findElement(By.xpath("//*[@href='/login']"));
        WebElement el7 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el8 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement el9 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement el10 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement el11 = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement el12 = wd.findElement(By.xpath("//button[@type = 'submit']"));
        WebElement el13 = wd.findElement(By.xpath("//*[@type = 'submit' and @name = 'login']"));
        WebElement el14 = wd.findElement(By.xpath("//*[@type = 'submit' and @name = 'registration']"));
        WebElement el15 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement el16 = wd.findElement(By.xpath("//*[@name = 'login']"));
        WebElement el17 = wd.findElement(By.name("registration"));
        WebElement el18 = wd.findElement(By.xpath("//*[@name = 'registration']"));


        //one of elements find by attribute ==> start & end & contains value

        WebElement el19 = wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement el20 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Em')]"));
        WebElement el21 = wd.findElement(By.cssSelector("[name $= 'word']"));
        WebElement el22 = wd.findElement(By.xpath("//*[contains(@name, 'word')]"));
        // for end   in xPath we can use "contains"
        WebElement el23 = wd.findElement(By.cssSelector("[name *= 'ss']"));
        WebElement el24 = wd.findElement(By.xpath("//*[contains(@name, 'ss')]"));

        //by linkText (partialLinkText)

        WebElement el25 = wd.findElement(By.linkText("HOME"));
        WebElement el26 = wd.findElement(By.partialLinkText("LOG"));

        //by text in xPath
        WebElement el27 = wd.findElement(By.xpath("//a[text() = 'ABOUT']"));
        WebElement el28 = wd.findElement(By.xpath("//button[text() = 'Registration']"));

    }
    @AfterClass
    public void closeBrowser(){
        wd.quit();

    }
}
