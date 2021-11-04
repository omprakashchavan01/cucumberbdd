package awesomecucumber.context;

import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.domainobjects.Cookies;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.domainobjects.ProductList;
import awesomecucumber.utils.JacksonUtils;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {
    public WebDriver driver;
    public BillingDetails billingDetails;
    public Cookies cookies;
    public ProductList productList = new ProductList();
    public Product product;

    public TestContext() throws IOException {
        cookies = new Cookies();
        cookies.set(new io.restassured.http.Cookies());
        productList.addAllProducts(JacksonUtils.deserializeJson("products.json", Product[].class));
    }
}
