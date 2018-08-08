package com.niharika.CourseProject.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.niharika.CourseProject.model.Task;
import com.niharika.CourseProject.model.User;
import com.niharika.CourseProject.service.LoginService;
import com.niharika.CourseProject.service.TaskRepository;

@Controller
@SessionAttributes({ "userId", "value" })

public class LoginController {
	@Autowired
	private LoginService service;
	@Autowired
	private TaskRepository taskrepo;
	String email1;

	@RequestMapping(value = "", method = RequestMethod.GET)

	public String landingPage() {
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/usertasks", method = RequestMethod.GET)
	public String showTasks(ModelMap model) {
		return "usertasks";
	}

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email,
			@RequestParam(value = "password", required = true) String pass, ModelMap model) {
		boolean isValid = service.validate(email, pass);
		if (isValid) {
			ArrayList<Task> value = service.searchId(email); // value has task object
			long userId = service.findUser(email);
			String email1 = service.findUser2(email);
			System.out.println("hello this is the user id" + userId);
			model.put("userId", userId);
			model.put("value", value);
			return "dashboard";
		} else {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegister() {
		return "register";
	}

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.GET)
	public String forgotpass() {
		return "forgotpassword";
	}

	@RequestMapping(value = "/forgotpassword", method = RequestMethod.POST)
	public String showforgotpass(@RequestParam String email, ModelMap model) {
		boolean isValid = service.validate(email);
		if (isValid) {
			model.put("email", email);
			return "securityquestions";
		}else {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
	}

	@RequestMapping(value = "/securityquestions", method = RequestMethod.GET)
	public String questions(@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "fav_book", required = true) String fav_book,
			@RequestParam(value = "fav_movie", required = true) String fav_movie,
			@RequestParam(value = "fav_city", required = true) String fav_city,ModelMap model) {
		String email1 = email.replace("/", "");
		User u = service.findEmail(email1);
		System.out.print(u.toString());
		if (u.getFav_book().equals(fav_book) && u.getFav_movie().equals(fav_movie)
				&& u.getFav_city().equals(fav_city)) {
			model.put("email1",email1);
			return "resetpassword";
		} else
			return "forgotpassword";
	}

	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String reset(@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "password", required = true) String password) {
		String email1 = email.replace("/", "");
		User u = service.findEmail(email1);
		// service.updatePassword(password);
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String home(@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "fav_book", required = true) String fav_book,
			@RequestParam(value = "fav_movie", required = true) String fav_movie,
			@RequestParam(value = "fav_city", required = true) String fav_city) {
		service.registerUser(name, email, password, fav_book, fav_movie, fav_city);
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "login";
	}

}