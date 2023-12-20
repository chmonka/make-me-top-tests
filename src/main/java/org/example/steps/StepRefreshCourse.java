package org.example.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.example.model.RefreshCourse;
import org.example.model.RefreshCourseTheme;

import static io.restassured.RestAssured.given;
import static org.example.config.Specification.specificationRequest;
import static org.example.config.Specification.specificationResponse;

public class StepRefreshCourse {
    @Step
    public Response setRefreshCourse(String token, Integer statusCode, RefreshCourse refreshCoursee, Integer coursesId , Integer galaxyId){
        return given()
                .when().log().all()
                .spec(specificationRequest())
                .header("Authorization", "Bearer " + token)
                .body(refreshCoursee)
                .pathParam("coursesId", coursesId)
                .pathParam("galaxyId" , galaxyId)
                .put("/course-app/galaxies/{galaxyId}/courses/{coursesId}")
                .then()
                .spec(specificationResponse(statusCode))
                .extract()
                .response();
    }
}
