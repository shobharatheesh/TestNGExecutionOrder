package com.udemy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DashboardTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("3 - Before Class (DashboardTest)");
    }

    @Test
    public void dashboardTest() {
        System.out.println("5 - Dashboard Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("7 - After Class (DashboardTest)");
    }

}
