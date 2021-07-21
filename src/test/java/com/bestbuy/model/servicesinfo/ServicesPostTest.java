package com.bestbuy.model.servicesinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.ServicesPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPostTest extends TestBase
{
    @Test
    public void createService()
    {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Painting");

        Response response = given()
                .header("Content-Type","application/json")
                .body(servicesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
