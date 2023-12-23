import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.example.config.BaseTest;
import org.example.model.RatingModel;
import org.example.model.Role;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Get Rating by role person")
public class RatingRoleTests extends BaseTest {

    @Test(testName = "testRatingRoleExplorer")
    @Feature("Получение рейтинга пользователя по роли")
    public void ratingRoleExplorer (){
        int personId = 1;
        login(Role.EXPLORER, "user", "user");
        Response response = RATING_EXPLORER_STEPS.getRatingRoleExplorer(accessToken, 200, personId );
        Assert.assertEquals(response.getBody().as(RatingModel.class), new RatingModel()
                .withRating(1.0));
    }

    @Test(testName = "testRatingRoleKeeper")
    public void ratingRoleKeeper (){
        int personId =1;
        login(Role.KEEPER, "user", "user");
        Response response = RATING_KEEPER_STEPS.getRatingRoleKeeper(accessToken, 200, personId );
        Assert.assertEquals(response.getBody().as(RatingModel.class), new RatingModel()
                .withRating(0.0));
    }


}
