package com.sysco.api.sample.api.common;

public class Constant {
    public static final String TEST_ENV = System.getProperty("tests.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("tests.release", "<Your Release>");
    public static final String TEST_PROJECT = System.getProperty("tests.project", "<Your Project>");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));
    public static final String API_HOST = System.getProperty("api.host", "http://dummy.restapiexample.com/api/v1/");
    public static final String BASE_PATH = System.getProperty("api.base", "");

    Constant() {

    }
}
