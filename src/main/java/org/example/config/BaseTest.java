package org.example.config;

import io.restassured.response.Response;
import org.example.model.Role;
import org.example.model.user.UserModel;
import org.example.steps.Steps;
import org.testng.annotations.AfterMethod;

public class BaseTest implements Steps {
    Response response;
    public String accessToken;
    public String refreshToken;

    public void login(Role role , String login, String password){
        response = AUTH_STEPS.sendLoginRequest(new UserModel().withLogin(login).withPassword(password).withRole(role));
        accessToken=response.body().jsonPath().getString("accessToken.accessToken");
        refreshToken=response.body().jsonPath().getString("refreshToken.refreshToken");
    }

    @AfterMethod
    public  void  logout(){
        AUTH_STEPS.sendLogOutRequest(refreshToken);
    }
 }
