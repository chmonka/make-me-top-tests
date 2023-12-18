package org.example.steps;


import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.example.config.Specification.specificationRequest;
import static org.example.config.Specification.specificationResponse;

public class StepCourse {
    @Step
    public Response getCourseById(String token,Integer statusCode,Integer courseId){
        return given()
                .spec(specificationRequest())
                .header("Authorization", "Bearer " + token)
                .pathParam("courseId", courseId)
                .get("/course-app/courses/{courseId}/")
                .then()
                .spec(specificationResponse(statusCode))
                .extract()
                .response();
    }
}
