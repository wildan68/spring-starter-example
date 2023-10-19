package com.todo.services.controller;

import java.util.ArrayList;

import com.todo.services.model.ResponseModel;
import com.todo.services.model.UserModel;

public class LoginController {
    ResponseModel responseModel = new ResponseModel();
    ResponseController responseController = new ResponseController();
    UserModel userModel = new UserModel();

    public ArrayList<UserModel> users = new ArrayList<UserModel>();

    public void init() {
        userModel.setUsername("admin");
        userModel.setPassword("admin");
        userModel.setEmail("admin@admin.com");

        users.add(userModel);
    }
    
    public ResponseModel login(String username, String password) {
        if (users.size() == 0) {
            init();
        }

        for (UserModel user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return responseController.setResponse("Login success", 0, user);
            }
        }

        return responseController.setResponse("Username or Password not matched", 1, null);
    }
}
