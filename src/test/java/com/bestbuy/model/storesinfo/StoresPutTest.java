package com.bestbuy.model.storesinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.StoresPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class StoresPutTest extends TestBase
{
    @Test
    public void updateStoreWithPut()
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
                .pathParam("id", 4)
                .header("Content-Type", "application/json")
                .body(storesPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
