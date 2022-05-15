package com.example.ormticketingproject.service.impl;

import com.example.ormticketingproject.dto.RoleDTO;
import com.example.ormticketingproject.entity.Role;
import com.example.ormticketingproject.mapper.RoleMapper;
import com.example.ormticketingproject.repository.RoleRepository;
import com.example.ormticketingproject.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        return roleRepository.findAll().stream().map(roleMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(Long id) {

        return roleMapper.convertToDto(roleRepository.findById(id).get());
    }
}
