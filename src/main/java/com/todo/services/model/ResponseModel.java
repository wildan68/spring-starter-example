package com.todo.services.model;

import lombok.Getter;
import lombok.Setter;

public class ResponseModel {
    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private int error;

    @Getter
    @Setter
    private Object data;
}
