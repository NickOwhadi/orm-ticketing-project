package com.example.ormticketingproject.service;

import com.example.ormticketingproject.dto.UserDTO;

import java.util.List;

public interface UserService extends CrudService<UserDTO, String> {

    List<UserDTO> findManagers();

    List<UserDTO> findEmployees();

}
