package com.lovingtails.lovingTailBackend.controller;


import com.lovingtails.lovingTailBackend.dto.UserDTO;
import com.lovingtails.lovingTailBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUserByID/{id}")
    public UserDTO getUserByID(@PathVariable String id){
        return userService.getUserByID(id);
    }

    @PostMapping("/saveUser")
    public String saveUser (@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.userDelete(userDTO);
    }
}
