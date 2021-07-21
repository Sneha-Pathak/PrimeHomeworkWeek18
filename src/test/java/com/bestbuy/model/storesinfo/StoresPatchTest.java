package com.bestbuy.model.storesinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.StoresPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresPatchTest extends TestBase
{
    @Test
    public void updateStoreWithPatch()
    {
        StoresPojo storesPojo =new StoresPojo();
        storesPojo.setName("Shamz");

        Response response = given()
                .pathParam("id",4)
                .header("Content-Type","application/json")
                .body(storesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
