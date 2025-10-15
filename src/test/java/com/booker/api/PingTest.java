package com.booker.api;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PingTest {

    private static final String BASE_URL = "http://localhost:3000";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @BeforeEach
    public void resetConfig() {
        RestAssured.reset();
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testGetAllBookingsReturns200() {
        Response response = given()
                .when()
                .get("/booking")
                .then()
                .extract().response();

        assertEquals(200, response.getStatusCode(), "Der Status Code für GET /booking sollte 200 sein.");
    }
}