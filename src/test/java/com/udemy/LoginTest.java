package com.udemy;
import org.testng.annotations.*;

public class LoginTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1 - Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2 - Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3 - Before Class (LoginTest)");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("4 - Before Method");
    }

    @Test
    public void loginTest1() {
        System.out.println("5 - Login Test 1");
    }

    @Test(enabled =false)
    public void loginTest2() {
        System.out.println("5 - Login Test 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("6 - After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("7 - After Class (LoginTest)");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("8 - After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("9 - After Suite");
    }
}
