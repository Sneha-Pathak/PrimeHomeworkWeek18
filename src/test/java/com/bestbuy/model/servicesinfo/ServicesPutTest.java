package com.bestbuy.model.servicesinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.ServicesPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPutTest extends TestBase
{
    @Test
    public void updateServicesWithPut()
    {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Coloring");

        Response response = given()
                .pathParam("id", 3)
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
