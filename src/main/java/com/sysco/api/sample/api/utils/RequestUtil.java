package com.sysco.api.sample.api.utils;

import com.jayway.restassured.response.Response;
import com.sysco.api.sample.api.common.Constants;
import com.syscolab.qe.core.api.restassured.RestUtil;

import java.util.Map;

public class RequestUtil {

    RequestUtil() {


    }

    public static void setRequestBaseUrls() {
        RestUtil.BASE_PATH = Constants.BASE_PATH;
        RestUtil.API_HOST = Constants.API_HOST;

    }

    public static Response send(Map<String, String> headers, String bodyString, String uri, String requestMethod, Map<String, String> queryParameters) {
        return RestUtil.send(headers, bodyString, uri, requestMethod, queryParameters);

    }
    public static String getToken() {
        return "";
    }
}
