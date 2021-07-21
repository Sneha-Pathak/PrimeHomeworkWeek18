package com.bestbuy.model.storesinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.StoresPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;


public class StoresPostTest extends TestBase
{
    @Test
    public void createStore()
    {
        HashMap<String, Object> services = new HashMap<>();
        services.put("Name","toys");

        StoresPojo storesPojo = new StoresPojo();
        storesPojo.setName("Shamz");
        storesPojo.setType("online store");
        storesPojo.setAddress("34 rugby avanue");
        storesPojo.setAddress2("ealing road");
        storesPojo.setCity("Wembley");
        storesPojo.setState("middlesex");
        storesPojo.setZip("ka1 3kd");
        storesPojo.setLat(0);
        storesPojo.setLng(0);
        storesPojo.setHours("247");
        storesPojo.setServices(services);

        Response response = given()
                .header("Content-Type","application/json")
                .body(storesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
