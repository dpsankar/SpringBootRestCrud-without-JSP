package com.shankar.first.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shankar.first.module.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
