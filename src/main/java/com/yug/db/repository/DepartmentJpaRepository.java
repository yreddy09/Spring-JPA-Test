package com.yug.db.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.yug.db.model.Department;

@EnableJpaRepositories
@Repository
public interface DepartmentJpaRepository extends JpaRepository<Department, BigDecimal> {

}
