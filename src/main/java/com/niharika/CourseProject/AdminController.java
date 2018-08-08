package com.niharika.CourseProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.niharika.CourseProject.model.Datedim;
import com.niharika.CourseProject.model.Task;
import com.niharika.CourseProject.model.User;
import com.niharika.CourseProject.service.DateRepository;
import com.niharika.CourseProject.service.LoginService;
import com.niharika.CourseProject.service.TaskRepository;
import com.niharika.CourseProject.service.UserRepository;

@Controller
@SessionAttributes("userId")
public class AdminController {
	
@Autowired
private UserRepository userRepo;

@Autowired 
private LoginService service;

@Autowired 
private TaskRepository taskRepo;

@Autowired
private DateRepository dateRepo;

@GetMapping("/adminlogin")
public String adminLoginPage()
{
	return "adminLogin";
}


@PostMapping("/showusers")
public String showAllUsers(ModelMap model)
{
	ArrayList<User> value =service.findAllUsers();
	model.put("value", value);
	return "showusers";
}

@RequestMapping("/deleteuser")
public String deleteUser(@RequestParam long id,ModelMap model)

{
	userRepo.delete(id);
	ArrayList<User> value =service.findAllUsers();
	model.put("value", value);
	return "showusers";
}


@RequestMapping("/deletetask")
public String deleteTask(@RequestParam long id,ModelMap model)

{
 taskRepo.delete(id);
	ArrayList<Task> value =service.findAllTasks();
	model.put("value", value);
	return "usertasks";
}






@RequestMapping(value = "/updatetasks", method = RequestMethod.GET)
public String updateTask(@RequestParam long id,ModelMap model)

{
Task t=	service.findone(id);
 model.put("value",t);
	
return "updateTask";

}
@RequestMapping(value="/updatetasks",method=RequestMethod.POST)
public String updated(@RequestParam long id,HttpServletRequest request,ModelMap model)

{
	String desc =request.getParameter("desc");
	String date=request.getParameter("dateid");
	int Date = Integer.parseInt(date);
	Datedim d=dateRepo.findOne(Date);
	System.out.println(Date);
String userId = request.getParameter("userid");
long Userid = Integer.parseInt(userId);
User u=userRepo.findOne(Userid);
	
	service.updateTask(id,desc,u,d);
	return "redirect:/usertasks";
}






@RequestMapping("/savetask")

public String updated(@RequestParam String id,@RequestParam String desc,@RequestParam String fulldate,ModelMap model) throws ParseException

{
	String sDate1=fulldate;
	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
	long number = Long.parseLong(id);
	User u=userRepo.findOne(number);
Datedim d=service.findbydateId(date1);
System.out.println(d.getDate_id());
Task t = new Task(desc,u,d);
taskRepo.save(t);
//long user_id=u.getId();
//System.out.println(user_id);
//ArrayList<Task> value =service.findAllTasks(user_id);
//model.put("value", value);
return "redirect:/usertasks";
}

@RequestMapping("/addtask")
public String addtask()
{
	return "addtask";
}
}
