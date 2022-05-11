package com.example.ormticketingproject.mapper;

import com.example.ormticketingproject.dto.RoleDTO;
import com.example.ormticketingproject.dto.UserDTO;
import com.example.ormticketingproject.entity.Role;
import com.example.ormticketingproject.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convertToEntity
    public User convertToEntity(UserDTO user){
        return modelMapper.map(user, User.class);
    }

    //convertToDto
    public UserDTO convertToDto(User entity){
        return modelMapper.map(entity,UserDTO.class);
    }
}
