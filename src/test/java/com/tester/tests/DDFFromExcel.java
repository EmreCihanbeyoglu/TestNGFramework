package com.tester.tests;

import com.tester.Utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFFromExcel extends TestBase{
    @DataProvider
    public Object [][] userData(){

        ExcelUtil excel = new ExcelUtil("excel file path","sheet name to retrieve data");

        String [][] dataArray =excel.getDataArrayWithoutFirstRow();

        return dataArray;
    }

    @Test(dataProvider = "userData")
    public void test1(String username,String password,String firstName,String lastName){

        // some pages are used. But in this framewrok there does not exist any page class yet
        //you can get the idea from following part.

        /*
        extentLogger=report.createTest("Test "+firstName+" "+lastName);
        LoginPage loginPage = new LoginPage();

        loginPage.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();

        String actualFullName = dashboardPage.getUserName();
        String expectedFullName = firstName+" "+lastName;

        Assert.assertEquals(actualFullName,expectedFullName,"verify fullname");
        extentLogger.pass("PASSED");

        */
    }

}
