package awesomecucumber.stepdefinations;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import org.openqa.selenium.WebDriver;

public class MyStepDefinitions {
    private final WebDriver driver;
    private BillingDetails billingDetails;

    public MyStepDefinitions(TestContext context){
        driver = context.driver;
    }
}
