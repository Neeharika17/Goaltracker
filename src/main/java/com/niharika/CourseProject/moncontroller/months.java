package com.niharika.CourseProject.moncontroller;

import static org.mockito.Matchers.longThat;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.util.JAXBResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.niharika.CourseProject.model.Task;
import com.niharika.CourseProject.service.LoginService;

@Controller
public class months {
	@Autowired
	private LoginService service;

//	@RequestMapping(value="/gettasks", method=RequestMethod.GET,produces="application/json")
//	@ResponseBody
//
//	public List<Task> jan() {
//		ArrayList<Task> value = service.findAllTasks();
//		return value;
//	}
//	
	
//	@RequestMapping(value = "/gettasks", method = RequestMethod.GET)
//	public ModelAndView getPages() {
//	
//		ObjectMapper mapper = new ObjectMapper();
//		
//		ArrayList<Task> list = service.findAllTasks();
//		System.out.println(list);
//		
//		ModelAndView model = new ModelAndView("dashboard");
//		
//		String json = "";
//		try {
//			json = mapper.writeValueAsString(list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		model.addObject("list", json);
//		
//		return model;
//
//	}
	
	@RequestMapping(value="/gettasks", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<Task> months() {

	    

	   ArrayList<Task> modelList = service.findAllTasks();
	   System.out.println(modelList);

	    return  modelList; 
	}
	
	
}
