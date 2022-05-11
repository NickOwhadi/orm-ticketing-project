package com.example.ormticketingproject.service;

import com.example.ormticketingproject.dto.ProjectDTO;
import com.example.ormticketingproject.dto.UserDTO;

import java.util.List;

public interface ProjectService {

//    void complete(ProjectDTO project);
//
//    List<ProjectDTO> findAllNonCompletedProjects();
//
//    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);
        ProjectDTO getByProjectCode(String code);
        List<ProjectDTO> listAllProjects();
        void save(ProjectDTO dto);
        void update(ProjectDTO dto);
        void delete(String code);
}
