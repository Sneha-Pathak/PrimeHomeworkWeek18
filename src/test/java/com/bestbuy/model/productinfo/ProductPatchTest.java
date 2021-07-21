package com.bestbuy.model.productinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPatchTest extends TestBase {

    @Test
    public void updateProductWithPatch()
    {
        ProductPojo productPojo = new ProductPojo();
        productPojo.setType("SoftGood");

        Response response = given()
                .pathParam("id",9999707)
                .header("Content-Type","application/json")
                .body(productPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
