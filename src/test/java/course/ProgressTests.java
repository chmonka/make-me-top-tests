package course;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.example.config.BaseTest;
import org.example.model.ProgressUserGalaxy;
import org.example.model.Role;
import org.example.model.StudySystem;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
@Epic("Get progress by user")
public class ProgressTests extends BaseTest {

    @Test
    @Feature("Получение прогресса пользователя")
    public void getProgressByGalaxy() {
        int galaxyid = 1;
        List<Integer> openedSystems = List.of(1, 6, 7, 8, 9, 11, 12, 15, 16);
        List<Integer> closedSystem = List.of( 13, 14, 17, 18, 19, 20, 21, 22, 23, 24);
        List<StudySystem> studiedSystems = List.of(
                new StudySystem().withSystemId(2).withProgress(100),
                new StudySystem().withSystemId(3).withProgress(100),
                new StudySystem().withSystemId(4).withProgress(100),
                new StudySystem().withSystemId(5).withProgress(100),
                new StudySystem().withSystemId(10).withProgress(10)
        );

//        studiedSystems.add(new StudySystem().withSystemId(2).withProgress(100));

        login(Role.EXPLORER, "user", "user");
        Response response = PROGRESS_STEPS.getProgressByGalaxy(accessToken, 200, galaxyid);
        Assert.assertEquals(response.getBody().as(ProgressUserGalaxy.class), new ProgressUserGalaxy()
                .withPersonId(11)
                .withFirstName("Ярослав")
                .withLastName("Коммитов")
                .withPatronymic("Сергеевич")
                .withOpenedSystems(openedSystems)
                .withStudiedSystems(studiedSystems)
                .withClosedSystems(closedSystem));
    }
}
