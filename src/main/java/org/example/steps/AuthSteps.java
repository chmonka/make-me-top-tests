package org.example.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.example.model.user.UserModel;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static org.example.config.Specification.specificationRequest;
import static org.example.config.Specification.specificationResponse;


public class AuthSteps {
    @Step
    public Response sendLoginRequest(UserModel user) {
        return given().spec(specificationRequest())
                .body(user)
                .post("/auth/login")
                .then()
                .spec(specificationResponse(200))
                .body(Matchers.anything())
                .extract()
                .response();
    }
    @Step
    public Response sendLogOutRequest(String token) {
        return given().spec(specificationRequest())
                .body(token)
                .post("/auth/logout")
                .then()
                .spec(specificationResponse(200))
                .body(Matchers.anything())
                .extract()
                .response();
    }
}
