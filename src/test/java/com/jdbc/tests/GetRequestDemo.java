package com.jdbc.tests;

import io.restassured.http.ContentType;
import org.apache.log4j.Logger;
import static io.restassured.RestAssured.given;

import org.openqa.selenium.json.Json;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class GetRequestDemo {
    final static Logger logger = Logger.getLogger(GetRequestDemo.class);

    /*

     */
   @BeforeClass
    public void setup() {
        //RestAssured.baseURI = "https://maps.googleapis.com/maps/api/distancematrix/json";
        //RestAssured.basePath = "/maps/api";

    }

    @Test
    public void statusCodeVerification() {
       //logger.error("");
        given().accept(ContentType.JSON)

                .param("units", "imperial")
                .param("origins", "40.6655101,-73.89188969999998")
                .param("destinations", "40.6905615%2C-73.9976592%7C40.6905615%2C-73.9976592%7C40.6905615%2C-73.9976592%7C40.6905615%2C-73.9976592%7C40.6905615%2C-73.9976592%7C40.6905615%2C-73.9976592%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626")
                .param("key", "AIzaSyCJBEDzxbSkVqhpxWZdZsoLzCjjg7yWjrM")
                .when()
                .get("https://maps.googleapis.com/maps/api/distancematrix/json")

                .then().log().all()
               ;
    }
}
