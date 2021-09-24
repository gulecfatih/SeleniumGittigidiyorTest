package test;

import base.BaseTest;
import org.junit.Test;
import page.BeforeLoginPage;


public class GittigidiyorTest extends BaseTest {

    @Test
    public void searchTest(){
        new BeforeLoginPage(driver)
                .clickLogin()
                .successLogin()
                .searchProduct()
                .secondPage()
                .selectRandomProduct()
                .addBasket()
                .deleteProduct();

    }
}
