package com.sysco.api.sample.api.requests.functions;

import com.jayway.restassured.response.Response;
import com.sysco.api.sample.api.utils.HeaderUtils;
import com.sysco.api.sample.api.utils.RequestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;
import static com.sysco.api.sample.api.common.URIs.*;

public class Employee {
    public static Response getEmployeeDetial(String id) {
        RequestUtil.setRequestBaseUrls();
        String getPaymentPropertiesUrlFinal = employeeUrl.replace("{id}",id);
        return RequestUtil.send(HeaderUtils.getApplicationJsonHeader(), null, getPaymentPropertiesUrlFinal, RequestMethods.GET.toString(),null);

    }
    public static Response getEmployeeListDetials() {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeaderUtils.getApplicationJsonHeader(), null, employeeListUrl, RequestMethods.GET.toString(),null);

    }
}
