package com.atguigu.gmall.user.controller;


import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "今天天气不错";
    }

    @RequestMapping("/userList")
    public ResponseEntity<List<UserInfo>> userList(){
        List<UserInfo> userList=userService.getUserInfoListAll();
        return  ResponseEntity.ok(userList);
    }
    @RequestMapping(value = "/user" ,method = RequestMethod.GET)
    public    ResponseEntity<Void> add(UserInfo userInfo){ ;

        userService.addUser(userInfo);
        System.out.println("userInfo = " + userInfo);
        return ResponseEntity.ok().build();
    }

}
