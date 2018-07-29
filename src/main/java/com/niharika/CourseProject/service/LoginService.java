package com.niharika.CourseProject.service;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Digits.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.niharika.CourseProject.model.Datedim;
import com.niharika.CourseProject.model.Task;
import com.niharika.CourseProject.model.User;

@SuppressWarnings("unused")
@EnableJpaRepositories
@Component
public class LoginService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private TaskRepository taskRepo;
	
	@Autowired
	private DateRepository dateRepo;

	public void registerUser(String name, String email, String password,String fav_book,String fav_movie,String fav_city) {

		User user = new User();

		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setFav_book(fav_book);
		user.setFav_movie(fav_movie);
		user.setFav_city(fav_city);

		userRepo.save(user);

		System.out.println("User Saved !" + user.toString());

	}
	
	public ArrayList<User> findAllUsers()
	{
		ArrayList<User> users = new ArrayList<>();
		for(User user: userRepo.findAll())
		{
			users.add(user);
		}
		return users;
	}

	
	public ArrayList<Task> findAllTasks()
	
	{
		ArrayList<Task> task = new ArrayList<>();
		for(Task tasks : taskRepo.findAll())
		{
			task.add(tasks);
		}

	return task;
	}

	
	
	
	
	
	
	
	public boolean validate(String email, String pass) {
		User u = userRepo.findByUserName(email);

		if (u != null) {

			System.out.println("User name " + u.getEmail() + "Password is " + pass);
			if (u.getEmail().equals(email) && u.getPassword().equals(pass)) {

				return true;

			}

			else {
				System.out.println("Here !!!");
				return false;
			}

		}
		return false;
	}

	
	public boolean validate(String email) {
		User u = userRepo.findByUserName(email);

		if (u != null) {

			
			if (u.getEmail().equals(email)) {

				return true;

			}

			else {
				System.out.println("Here !!!");
				return false;
			}

		}
		return false;
	}
	
	
	
	
	
	public ArrayList<Task> getTaskObj(long id)

	{

		// Task t= taskRepo.findByUserId(id);
		// Task t = taskRepo.findOne(id);

		ArrayList<Task> tList = new ArrayList<Task>();

		tList = (ArrayList<Task>) taskRepo.findAll();

		System.out.println("Task List  " + tList.toString());

		// System.out.println("T is " + t.getDesc());

		return tList;
	}

//	public long searchId(String email) {
//		User user = userRepo.findByUserName(email);
//		Set<Task> taskSet = new HashSet<>();
//
//		taskSet = user.getTasks();
//
//		ArrayList<Task> tList = new ArrayList<Task>();
//
//		tList.addAll(taskSet);
//
//		for (Task task : tList) {
//			System.out.println("User Task is " + task.getDesc());
//		}
//
//		long j = user.getId();
//
//		return j;
//
//	}
//	
	
	public Task findone(long id)
	{
		return taskRepo.findOne(id);
	}
	
	public void delete(long id) {
		userRepo.delete(id);
	}
	
	public ArrayList<Task> searchId(String email) {
		User user = userRepo.findByUserName(email);
		Set<Task> taskSet = new HashSet<>();

		taskSet = user.getTasks();

		ArrayList<Task> tList = new ArrayList<Task>();

		tList.addAll(taskSet);

		for (Task task : tList) {
			System.out.println("User Task is " + task.getDesc());
		}

		return tList;

	}

	//below changes made by me on 2nd june
	
	public long findUser(String email)
	{
	User user= userRepo.findByUserName(email);
	return user.getId();
	}

	
	public String findUser2(String email)
	{
	User user= userRepo.findByUserName(email);
	return user.getEmail();
	}

	
	
	public User findEmail(String email)
	{
		User u = userRepo.findByUserName(email);
		System.out.println(u +"neeharika");
		return u;
	}

	
	public void updateTask(long id, String desc,User Userid, Datedim date) {
		// TODO Auto-generated method stub
		Task task = new Task();
		task.setDesc(desc);
task.setUser(Userid);
task.setDatedim(date);
task.setId(id);
		taskRepo.save(task);
	}
	


	public void updatePassword( String name,String email,String password,String book,String movie,String city) {
		// TODO Auto-generated method stub
		User u = new User();
		u.setName(name);
		u.setPassword(password);
		u.setEmail(email);
		u.setFav_book(book);
		u.setFav_movie(movie);
		u.setFav_city(city);
		
	userRepo.save(u);
	}
	
	
	
	
	
	

	public Datedim findbydateId(Date date1) {
		// TODO Auto-generated method stub
		Datedim u = dateRepo.findByfulldate(date1);
		
		
		return u;
	}
	

}