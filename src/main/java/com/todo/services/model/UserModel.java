package com.todo.services.model;

import lombok.Getter;
import lombok.Setter;

public class UserModel {
    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String fullName;
}
