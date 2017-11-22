package com.yug.db.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.yug.db.model.Emp;

@Repository
@EnableJpaRepositories
public interface EmpJpaRepository extends JpaRepository<Emp, BigDecimal> {

}
