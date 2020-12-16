package com_saucelab_sort;

import commons.AbstractTest;
import commons.DataHelper;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testdata.nopcomerce_testdata.EndUserJson;

public class JavaFaker_JsonData extends AbstractTest {

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url){
        driver = getBrowserDriver(browserName, url);

    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        closeBrowserAndDriver(driver);
    }


    @Test
    public void Test_01 () {
        DataHelper data = DataHelper.getData();
        System.out.println(data.getAddress());
        System.out.println(data.getCity());
        System.out.println(data.getCompanyName());

        System.out.println(endUserJson.getFirstname());
        System.out.println(endUserJson.getDob());
    }

    EndUserJson endUserJson = EndUserJson.getEndUserData(GlobalConstants.ROOT_FOLDER + "\\src\\test\\java\\testdata\\nopcomerce_testdata\\Register.json");
    WebDriver driver;

}
