package com.RestDemos;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D08CheckName {
    @Test
    public void checkForName()
    {
        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("data.id[2]", equalTo(9))
                .assertThat().body("data.first_name", hasItem("George"))
                .log().body();
    }
}
