package com.bestbuy.model.categoriesinfo;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPostTest extends TestBase
{
    @Test
    public void createCategory()
    {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Radios");
        categoriesPojo.setId("abcd123");

        Response response = given()
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
