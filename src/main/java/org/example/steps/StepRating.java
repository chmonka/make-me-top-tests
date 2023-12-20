package org.example.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.example.config.Specification.specificationRequest;
import static org.example.config.Specification.specificationResponse;

public class StepRating {
    @Step
    public Response getRatingRoleExplorer (String token,Integer statusCode, Integer personId){
        return given()
                .when().log().all()
                .spec(specificationRequest())
                .header("Authorization", "Bearer " + token)
                .pathParam("personId", personId)
                .get("/feedback-app/people/{personId}/ratings?as=explorer")
                .then()
                .spec(specificationResponse(statusCode))
                .extract()
                .response();
    }

    @Step
    public Response getRatingRoleKeeper (String token,Integer statusCode, Integer personId){
        return given()
                .when().log().all()
                .spec(specificationRequest())
                .header("Authorization", "Bearer " + token)
                .pathParam("personId", personId)
                .get("/feedback-app/people/{personId}/ratings?as=keeper")
                .then()
                .spec(specificationResponse(statusCode))
                .extract()
                .response();
    }
}
