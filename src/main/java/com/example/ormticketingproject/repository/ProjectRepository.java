package com.example.ormticketingproject.repository;

import com.example.ormticketingproject.entity.Project;
import com.example.ormticketingproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByProjectCode(String code);

    List<Project> findAllByAssignedManager(User manager);

}
