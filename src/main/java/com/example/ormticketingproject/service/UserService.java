package com.example.ormticketingproject.service;

import com.example.ormticketingproject.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();


    UserDTO findByUserName(String user);
    void save(UserDTO dto);
    UserDTO update(UserDTO dto);
    void deleteByUserName(String username);
    void delete(String username);
    List<UserDTO> listAllByRole(String role);

}
