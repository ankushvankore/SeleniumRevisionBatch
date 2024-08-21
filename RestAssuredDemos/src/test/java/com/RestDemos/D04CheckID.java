package com.RestDemos;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class D04CheckID
{
    @Test
    public void checkForId()
    {
        given()
                .get("https://reqres.in/api/users/2")
                .then().body("data.id", equalTo(5))
                .log().all();

        given()
                .get("https://reqres.in/api/users/2")
                .then().body("support.url", equalTo("https://reqres.in/#support-heading"))
                .log().all();

    }
}
