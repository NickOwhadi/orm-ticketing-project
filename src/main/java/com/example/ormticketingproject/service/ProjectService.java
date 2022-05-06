package com.example.ormticketingproject.service;

import com.example.ormticketingproject.dto.ProjectDTO;
import com.example.ormticketingproject.dto.UserDTO;

import java.util.List;

public interface ProjectService extends CrudService<ProjectDTO, String> {

    void complete(ProjectDTO project);

    List<ProjectDTO> findAllNonCompletedProjects();

    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);

}
