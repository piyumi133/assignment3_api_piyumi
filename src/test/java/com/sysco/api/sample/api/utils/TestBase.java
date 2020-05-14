package com.sysco.api.sample.api.utils;

import com.sysco.api.sample.api.common.Constant;
import com.sysco.api.sample.api.common.LoggerA;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolab.qe.core.reporting.SyscoLabQCenter;
import com.syscolab.qe.core.reporting.SyscoLabReporting;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.logging.Logger;

@Listeners(SyscoLabListener.class)
public class TestBase extends SyscoLabListener {
    protected final static Logger LOGGER = Logger.getLogger("global");
    protected SoftAssert softAssert;
    protected LoggerA loggerA;
    private SyscoLabListener syscoLabListeners;
    private SyscoLabQCenter syscoLabQCenter;

    @BeforeMethod
    public void init() {
        softAssert = new SoftAssert();
        try {
            loggerA.setup();
        } catch (IOException e) {
            e.printStackTrace();
        }

        softAssert = new SoftAssert();
        syscoLabListeners = new SyscoLabListener();
        syscoLabQCenter = new SyscoLabQCenter();
        System.out.println("Running " + this.getClass().toString());
    }


}


