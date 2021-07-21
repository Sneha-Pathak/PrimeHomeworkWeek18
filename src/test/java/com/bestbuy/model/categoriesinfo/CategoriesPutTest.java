package com.bestbuy.model.categoriesinfo;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPutTest extends TestBase
{
    @Test
    public void updateCategoryWithPut()
    {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Radios");
        categoriesPojo.setId("pmc123");

        Response response = given()
                .pathParam("id", "abcd123")
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
