package com.sysco.api.sample.api.utils;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResponseUtil {
    public static int getStatus(Response response) {
        return response.getStatusCode();
    }

    public static String getValueFromArray(String response, int index, String key) throws JSONException {
        JSONObject jsonObject = new JSONObject(response);
        JSONArray jArray = jsonObject.getJSONArray("data");

        String toReturn = "";
        try {
            JSONObject responseBody = jArray.getJSONObject(index);
            ;
            toReturn = responseBody.getString(key);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return toReturn;
        }
    }

    public static Object getDataObjectValueInDataArray(String response, int index, Class name) throws JSONException {
        JSONObject jsonObject = new JSONObject(response);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        try {
            JSONObject responseBody = jsonArray.getJSONObject(index);
            return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseBody.toString(), name);

        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

}
