package com.bestbuy.model.servicesinfo;

import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesDeleteTest extends TestBase
{
    @Test
    public void getDeleteProduct()
    {
        Response response = given()
                .pathParam("id", 5 )
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
