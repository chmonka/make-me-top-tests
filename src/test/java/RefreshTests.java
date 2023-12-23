import io.restassured.response.Response;
import org.example.config.BaseTest;
import org.example.model.RefreshCourse;
import org.example.model.RefreshCourseTheme;
import org.example.model.Role;
import org.example.steps.StepRefreshCourse;
import org.testng.annotations.Test;

public class RefreshTests extends BaseTest {

    @Test
    public void putRefreshCourseTheme() {
        int themesId = 1;
        login(Role.BIG_BROTHER, "big_brother", "big_brother");
        Response response = REFRESH_COURSE_THEME.setRefreshCourseTheme(accessToken, 200, new RefreshCourseTheme()
                .withTitle("string")
                .withDescription("string")
                .withContent("string")
                .withCourseThemeNumber(1)
                .withCourseId(1), themesId);
    }

    @Test
    public void putRefreshCourse() {
        int coursesId = 1;
        int galaxyId  = 1;
        login(Role.BIG_BROTHER, "big_brother", "big_brother");
        Response response = REFRESH_COURSE.setRefreshCourse(accessToken, 200, new RefreshCourse()
                .withTitle("title")
                .withDescription("title"),coursesId,galaxyId);

    }

}
