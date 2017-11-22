package com.yug.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yug.db.model.Shipwreck;


public interface ShipwreckJpaRepository extends JpaRepository<Shipwreck, Long> {

}
