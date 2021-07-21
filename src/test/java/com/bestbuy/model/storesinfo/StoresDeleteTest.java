package com.bestbuy.model.storesinfo;

import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresDeleteTest extends TestBase
{
    @Test
    public void getDeleteStore() {
        Response response = given()
                .pathParam("id", 4)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
