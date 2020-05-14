package com.sysco.api.sample.api.tests;

import com.jayway.restassured.response.Response;
import com.sysco.api.sample.api.common.LoggerA;
import com.sysco.api.sample.api.requests.functions.Employee;
import com.sysco.api.sample.api.response.model.EmployeeModel;
import com.sysco.api.sample.api.utils.ResponseUtil;
import com.sysco.api.sample.api.types.*;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GetEmployeeDetailsTest {
    private final static Logger LOGGER = Logger.getLogger("global");

    @Test
    public void testGetEmployeeDetails() {

        SoftAssert softAssert = new SoftAssert();
        try {
            LoggerA.setup();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Response employeeList = Employee.getEmployeeListDetials();
        EmployeeModel employeeModel = (EmployeeModel) ResponseUtil.getDataObjectValueInDataArray(employeeList.asString(), 0, EmployeeModel.class);
        softAssert.assertEquals(ResponseUtil.getStatus(employeeList), StatusTestData.STATUS_SUCCESS, "Success code is appear as expected ");
        softAssert.assertEquals(employeeModel.employee_name, EmployeeTestData.EMP_NAME, "Employee details are not match as expected[name]");
        softAssert.assertEquals(employeeModel.employee_salary, EmployeeTestData.EMP_SALARY, "Employee details are not match as expected[salary]");
        softAssert.assertEquals(employeeModel.employee_age, EmployeeTestData.EMP_AGE, "Employee details are not match as expected[name]");
        LOGGER.info("---employee_Name----" + employeeModel.employee_name);
        LOGGER.info("---employee_salary----" + employeeModel.employee_salary);
        LOGGER.info("---employee_age----" + employeeModel.employee_age);
        softAssert.assertAll();

    }

}
