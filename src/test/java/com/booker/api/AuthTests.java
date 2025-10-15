package com.booker.api;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.booker.models.Auth;

import io.restassured.RestAssured;
import io.restassured.config.RedirectConfig;
import io.restassured.path.json.exception.JsonPathException;
import io.restassured.response.Response;

@Disabled
public class AuthTests {

    private static final String BASE_URL = "http://localhost:3004";

    @BeforeAll
    public static void setup() {
        RestAssured.config = RestAssured.config()
                .redirect(new RedirectConfig().followRedirects(false));

        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testSuccessfulAuthentication() {
        Auth authPayload = new Auth("admin", "password");

        Response response = given()
                .contentType("application/json")
                .body(authPayload)
                .when()
                .post("/auth")
                .then()
                .extract().response();

        // ERWARTUNG: Der Server sendet 302.
        assertEquals(302, response.getStatusCode(), "Status Code sollte 302 sein.");

        // PRÜFUNG: Der Token muss sich im Body befinden.
        String token = response.jsonPath().getString("token");
        assertNotNull(token, "Der Token-Wert (im Body) darf nicht null sein.");
        assertTrue(token.length() > 0, "Der Token (im Body) darf nicht leer sein.");

        System.out.println("Erfolgreich generierter Token (Body): " + token.substring(0, 10) + "...");
    }

    @Test
    public void testFailedAuthentication() {
        Auth authPayload = new Auth("falscher_nutzer", "falsches_pw");

        Response response = given()
                .contentType("application/json")
                .body(authPayload)
                .when()
                .post("/auth")
                .then()
                .extract().response();

        // ERWARTUNG: Der Server sendet 302.
        assertEquals(302, response.getStatusCode(), "Status Code sollte 302 sein.");

        // PRÜFUNG: Bei Misserfolg darf KEIN Token im Body sein.
        try {
            String token = response.jsonPath().getString("token");
            assertNull(token, "Es sollte KEIN Token im Body enthalten sein.");
        } catch (JsonPathException e) {

        }
    }
}