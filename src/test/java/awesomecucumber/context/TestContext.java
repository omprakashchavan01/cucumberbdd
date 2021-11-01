package awesomecucumber.context;

import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.domainobjects.Cookies;
import org.openqa.selenium.WebDriver;

public class TestContext {
    public WebDriver driver;
    public BillingDetails billingDetails;
    public Cookies cookies;

    public TestContext(){
        cookies = new Cookies();
        cookies.setCookies(new io.restassured.http.Cookies());
    }
}
