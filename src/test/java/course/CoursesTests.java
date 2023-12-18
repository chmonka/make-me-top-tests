package course;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.example.config.BaseTest;
import org.example.model.CourseModel;
import org.example.model.Role;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Epic("Courses controller")
public class CoursesTests extends BaseTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date = LocalDate.now();

    @Feature("Get courses")
    @Test(description = "Получение курса по Id")
    public void getCourseById(){
        int courseId = 1;
        login(Role.EXPLORER,"user","user");
        Response response = COURSE_STEPS.getCourseById(accessToken,200,courseId);
        Assert.assertEquals(response.getBody().as(CourseModel.class),new CourseModel()
                .withCourseId(1)
                .withTitle("Groovy")
                .withCreationDate(date.format(formatter))
                .withLastModified(date.format(formatter))
                .withDescription(""));
    }
}
