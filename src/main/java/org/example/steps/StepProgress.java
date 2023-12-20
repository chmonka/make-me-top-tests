package org.example.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.example.config.Specification.specificationRequest;
import static org.example.config.Specification.specificationResponse;

public class StepProgress {
    @Step
    public Response getProgressByGalaxy(String token,Integer statusCode,Integer galaxyId){
        return given()
                .when().log().all()
                .spec(specificationRequest())
                .header("Authorization", "Bearer " + token)
                .pathParam("galaxyId", galaxyId)
                .get("/progress-app/galaxies/{galaxyId}/")
                .then()
                .spec(specificationResponse(statusCode))
                .extract()
                .response();
    }
}
