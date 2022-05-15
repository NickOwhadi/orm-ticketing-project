package com.example.ormticketingproject.service;

import com.example.ormticketingproject.dto.TaskDTO;
import com.example.ormticketingproject.dto.UserDTO;
import com.example.ormticketingproject.enums.Status;

import java.util.List;

public interface TaskService {

    TaskDTO findById(Long id);
    List<TaskDTO> listAllTasks();
    void save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(Long id);
    int totalNonCompletedTask(String projectCode);
    int totalCompletedTask(String projectCode);

}
