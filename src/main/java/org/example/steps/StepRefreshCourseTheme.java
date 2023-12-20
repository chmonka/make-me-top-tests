package org.example.steps;


import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.example.model.RefreshCourseTheme;

import static io.restassured.RestAssured.given;
import static org.example.config.Specification.specificationRequest;
import static org.example.config.Specification.specificationResponse;

public class StepRefreshCourseTheme {
    @Step
    public Response setRefreshCourseTheme(String token, Integer statusCode, RefreshCourseTheme setRefreshCourse, Integer themesId){
        return given()
                .when().log().all()
                .spec(specificationRequest())
                .header("Authorization", "Bearer " + token)
                .body(setRefreshCourse)
                .pathParam("themesId", themesId)
                .put("/course-app/themes/{themesId}")
                .then()
                .spec(specificationResponse(statusCode))
                .extract()
                .response();
    }
}
