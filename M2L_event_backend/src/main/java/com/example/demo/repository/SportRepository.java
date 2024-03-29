package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.sport;

public interface SportRepository extends JpaRepository<sport, Long>{

}