package com.example.ormticketingproject.service.impl;

import com.example.ormticketingproject.dto.UserDTO;
import com.example.ormticketingproject.entity.User;
import com.example.ormticketingproject.mapper.RoleMapper;
import com.example.ormticketingproject.mapper.UserMapper;
import com.example.ormticketingproject.repository.UserRepository;
import com.example.ormticketingproject.service.UserService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl  implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> listAllUsers() {
        return userRepository.findAll(Sort.by("firstName")).stream().map(userMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public UserDTO findByUserName(String user) {
        return userMapper.convertToDto(userRepository.findByUserName(user));
    }

    @Override
    public void save(UserDTO dto) {
        userRepository.save(userMapper.convertToEntity(dto));
    }

    @Override
    public UserDTO update(UserDTO dto) {
       User user= userRepository.findByUserName(dto.getUserName());
       User convertedUser=userMapper.convertToEntity(dto);
       convertedUser.setId(user.getId());
       userRepository.save(convertedUser);
       return findByUserName(dto.getUserName());

    }

    @Override
    public void deleteByUserName(String username) {
       // userRepository.delete(userRepository.findByUserName(username));

        userRepository.deleteByUserName(username);
    }

    @Override
    public void delete(String username) {
        User user=userRepository.findByUserName(username);
        user.setIsDeleted(true);
        userRepository.save(user);
    }


}
