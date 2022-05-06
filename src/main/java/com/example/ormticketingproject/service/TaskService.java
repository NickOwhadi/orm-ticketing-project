package com.example.ormticketingproject.service;

import com.example.ormticketingproject.dto.TaskDTO;
import com.example.ormticketingproject.dto.UserDTO;
import com.example.ormticketingproject.enums.Status;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO, Long> {

    List<TaskDTO> findTasksByManager(UserDTO manager);

    List<TaskDTO> findAllTasksByStatus(Status status);

    List<TaskDTO> findAllTasksByStatusIsNot(Status status);

    void updateStatus(TaskDTO task);

}
