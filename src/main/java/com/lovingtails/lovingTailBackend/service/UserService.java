package com.lovingtails.lovingTailBackend.service;

import com.lovingtails.lovingTailBackend.dto.UserDTO;
import com.lovingtails.lovingTailBackend.entity.User;
import com.lovingtails.lovingTailBackend.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers(){
        List<User> users = userRepo.findAll();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO getUserByID(String id){
        User user = userRepo.getUserByID(id);
        return modelMapper.map(user, UserDTO.class);
    }

    public String saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return "User Saved!";
    }

    public boolean userDelete(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }
}
