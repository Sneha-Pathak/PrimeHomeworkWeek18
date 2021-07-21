package com.bestbuy.model.servicesinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.ServicesPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPatchTest extends TestBase
{
    @Test
    public void updateServicesWithPatch()
    {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Painting");

        Response response = given()
                .pathParam("id",2)
                .header("Content-Type","application/json")
                .body(servicesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
