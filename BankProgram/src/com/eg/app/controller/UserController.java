package com.eg.app.controller;
import com.eg.app.model.User;

public class UserController {

    // I CAN NOW USE THE METHODS OF THE RECIEVED OBJECT
    private User user;

    // THIS WILL RECIEVED AN OBJECT
    public UserController(User user) {
        this.user = user;
    }

    public void updateUserName(String newName) {
        user.setName(newName);
    }

    public String getUserName() {
        return user.getName();
    }
}
