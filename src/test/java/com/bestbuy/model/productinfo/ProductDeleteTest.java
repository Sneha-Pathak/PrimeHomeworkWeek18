package com.bestbuy.model.productinfo;

import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductDeleteTest extends TestBase {


    @Test
    public void getDeleteProduct() {
        Response response = given()
                .pathParam("id", 309062 )
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}