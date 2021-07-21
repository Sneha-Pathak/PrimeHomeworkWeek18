package com.bestbuy.model.productinfo;


import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductPostTest extends TestBase {

    @Test
    public void createProduct()
    {
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("kottak");
        productPojo.setType("StrongGood");
        productPojo.setPrice(2.99);
        productPojo.setShipping(0);
        productPojo.setUpc("041333422021");
        productPojo.setDescription("Compatible with select electronic devices; AAA size; Panasonic Power Preserve technology; 4-pack");
        productPojo.setManufacturer("Panasonic");
        productPojo.setModel("PN2400B4z");
        productPojo.setUrl("string");
        productPojo.setImage("string");

        Response response = given()
                .header("Content-Type","application/json")
                .body(productPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
