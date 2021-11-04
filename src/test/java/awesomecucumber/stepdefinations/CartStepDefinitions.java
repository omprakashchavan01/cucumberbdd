package awesomecucumber.stepdefinations;

import awesomecucumber.apis.CartApi;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartStepDefinitions {
    private final CartPage cartPage;
    private final TestContext context;

    public CartStepDefinitions(TestContext context){
        this.context = context;
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }

    @Then("I should see {int} {product} in the cart")
    public void iShouldSeeInTheCart(int quantity, Product product) {
        Assert.assertEquals(product.getName(), cartPage.getProductName());
        Assert.assertEquals(quantity, cartPage.getProductQuantity());
    }

    @And("I have {int} {product} in the cart")
    public void iHaveInTheCart(int quantity, Product product) throws Exception {
//        storePage.addToCart("Blue Shoes");
        CartApi cartApi = new CartApi(context.cookies.get());
        product = context.productList.getProductByName(product.getName());
        cartApi.addToCart(product.getId(), quantity);
        context.cookies.set(cartApi.getCookies());
        context.cookies.injectToBrowser(context.driver);
        context.product = product;
    }
}
