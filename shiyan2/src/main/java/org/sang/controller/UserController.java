package org.sang.controller;

import org.sang.model.User;
import org.sang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/userOps")
    public String userOps(@RequestBody User user){
        User user1 = userService.login(user);
        if(user!=null)
            System.out.println("登陆成功！欢迎你----"+user1.getUsername());
        User user2 = new User();
        user2.setUser_id(4);
        user2.setUsername("冯宝宝");
        user2.setPassword("fbb");
        userService.addUser(user2);
        userService.deleteUserById(5);
        user2.setEmail("96451387@ndt.com");
        userService.updateUserById(user2);
        User user3 = userService.getUserById(3);
        System.out.println("getUserById--->"+user3);
        User user4 = userService.getUserByName("张楚岚");
        System.out.println("getUserByName--->"+user4);
        List<User> userList = userService.getAllUsers();
        System.out.println("getAllUsers--->"+userList);

        return "Mybatis user";
    }
}
