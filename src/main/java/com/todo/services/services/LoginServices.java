package com.todo.services.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.services.controller.LoginController;
import com.todo.services.controller.ResponseController;
import com.todo.services.model.ResponseModel;
import com.todo.services.model.UserModel;

import exceptions.CustomParameterConstraintException;

@RestController
public class LoginServices {
    LoginController loginController = new LoginController();
    ResponseController responseController = new ResponseController();

    @PostMapping("/login")
    public ResponseModel login(@RequestBody UserModel user) {
        try { 
            if (user.getUsername() == null || user.getPassword() == null) {
                throw new CustomParameterConstraintException("Username and password are required");
            }

            return loginController.login(user.getUsername(), user.getPassword());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
