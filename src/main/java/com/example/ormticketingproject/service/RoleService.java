package com.example.ormticketingproject.service;

import com.example.ormticketingproject.dto.RoleDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id);
}