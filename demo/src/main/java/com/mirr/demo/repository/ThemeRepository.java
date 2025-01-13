package com.mirr.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirr.demo.test.Theme;

@Repository
public interface ThemeRepository extends JpaRepository<Theme,Integer>{
	
	

}
