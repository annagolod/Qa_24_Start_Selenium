import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
@BeforeClass
    public void preCondition(){
        //open browser
        //open site

    }
    @Test
public void loginSuccess(){
    //open login form (find element + click)
    //fill email (find element + click + clear + type)
    //fill password (find element + click + clear + type)
    //submit (find element + click)
}
@Test
    public void loginWrongEmail(){
    //open login form (find element + click)
    //fill email (find element + click + clear + type)
    //fill password (find element + click + clear + type)
    //submit (find element + click)
    }
@Test
    public void loginWrongPassword(){
    //open login form (find element + click)
    //fill email (find element + click + clear + type)
    //fill password (find element + click + clear + type)
    //submit (find element + click)
    }

    @AfterClass
public void postCondition(){
        //close browser
}

}
