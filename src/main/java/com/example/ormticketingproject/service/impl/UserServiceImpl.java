package com.example.ormticketingproject.service.impl;

import com.example.ormticketingproject.dto.UserDTO;
import com.example.ormticketingproject.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl  implements UserService {


    @Override
    public List<UserDTO> listAllUsers() {
        return null;
    }

    @Override
    public UserDTO findByUserName(String user) {
        return null;
    }

    @Override
    public void save(UserDTO dto) {

    }

    @Override
    public UserDTO update(UserDTO dto) {
        return null;
    }

    @Override
    public void deleteByUserName(String username) {

    }
}
