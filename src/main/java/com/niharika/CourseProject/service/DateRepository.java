package com.niharika.CourseProject.service;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.niharika.CourseProject.model.Datedim;
import com.niharika.CourseProject.model.Task;
import com.niharika.CourseProject.model.User;


public interface DateRepository extends CrudRepository<Datedim,Integer>{

	Datedim findByfulldate(Date date1);
	
	

	

	
}
