package com.sysco.api.sample.api.utils;

import com.syscolab.qe.core.api.util.ContentTypes;
import com.syscolab.qe.core.api.util.Headers;

import java.util.HashMap;

public class HeaderUtils {
    public static HashMap<String, String> getHeader(){
        return Headers.getHeader();
    }

    public static HashMap<String, String> getBasicHeader(String token){
        return Headers.getBasicHeaders(token);
    }

  public static HashMap<String, String> getApplicationJsonHeader(){
      HashMap<String, String> headers = new HashMap<String, String>();
      headers.put("Content-type", ContentTypes.APPLICATION_JSON);
      return headers;
  }

}
