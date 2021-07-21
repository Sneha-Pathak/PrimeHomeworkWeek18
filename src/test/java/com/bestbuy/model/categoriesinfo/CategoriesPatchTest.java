package com.bestbuy.model.categoriesinfo;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.model.ProductPojo;
import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPatchTest extends TestBase
{
    @Test
    public void updateCategoryWithPatch()
    {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("DVDs");

        Response response = given()
                .pathParam("id","abcd123")
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
