package com.bestbuy.model.categoriesinfo;


import com.bestbuy.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesDeleteTest extends TestBase
{
    @Test
    public void getDeleteCategory() {
        Response response = given()
                .pathParam("id", "abcat0010000")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
