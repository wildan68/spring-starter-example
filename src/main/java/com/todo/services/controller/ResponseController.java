package com.todo.services.controller;

import com.todo.services.model.ResponseModel;

public class ResponseController {
    ResponseModel response = new ResponseModel();

    public ResponseModel setResponse (String message, int error, Object data) {
        response.setMessage(message);
        response.setError(error);
        response.setData(data);
        return response;
    }
}
