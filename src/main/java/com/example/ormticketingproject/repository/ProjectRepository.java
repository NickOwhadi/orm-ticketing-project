package com.example.ormticketingproject.repository;

import com.example.ormticketingproject.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByProjectCode(String code);

}
