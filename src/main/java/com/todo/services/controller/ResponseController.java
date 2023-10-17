package com.todo.services.controller;

import com.todo.services.model.ResponseModel;

public class ResponseController {
    ResponseModel response = new ResponseModel();

    public ResponseModel setResponse (String message, int error, Object data) {
        response.message = message;
        response.error = error;
        response.data = data;
        return response;
    }
}
