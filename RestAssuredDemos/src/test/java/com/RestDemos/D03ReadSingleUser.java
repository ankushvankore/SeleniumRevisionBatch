package com.RestDemos;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class D03ReadSingleUser
{
    @Test
    public void readData1()
    {
        given()
                .get("https://reqres.in/api/users/2")
                .then().statusCode(200);
    }
    @Test
    public void readData2()
    {
        given()
                .get("https://reqres.in/api/users/2")
                .then().statusCode(200).log().all();

        Assert.assertEquals(200, 200);
        System.out.println("Status code is matching");
    }
}
