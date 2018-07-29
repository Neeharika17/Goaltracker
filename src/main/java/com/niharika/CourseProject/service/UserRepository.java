package com.niharika.CourseProject.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.niharika.CourseProject.model.Datedim;
import com.niharika.CourseProject.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	

	
	@Query("select u from User u where u.email = :email")
	User findByUserName(@Param("email") String email); //this would return user record from the database
	
	
	
	
	
}
