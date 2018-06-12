package com.jdbc.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DistanceMatrix {
    final static Logger logger = Logger.getLogger(GetRequestDemo.class);
    Response response;

    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "https://maps.googleapis.com/maps/api/distancematrix/";

    }

    @Test
    public void statusCodeVerification(){
        response=
        given().accept(ContentType.JSON)

                .param("origins", "")
                .param("destinations", "")
                .param("key", "AIzaSyCT4GUmWrOLe8tP0SVha34APXI9JiyNPyI")
                .when()
                .get(RestAssured.baseURI);

    }

    @Test
    public void verifyDistance(){

    }


}
