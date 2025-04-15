package com.eg.app;
import com.eg.app.controller.UserController;
import com.eg.app.model.User;

public class Main{
    public static void main(String[] args) {

        User you = new User("Stanley");
        UserController user = new UserController(you);

        user.updateUserName("Maria");
        String result = user.getUserName();
        System.out.println(result);

    }
}
