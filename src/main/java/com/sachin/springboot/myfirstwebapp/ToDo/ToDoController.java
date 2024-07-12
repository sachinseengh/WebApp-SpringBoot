package com.sachin.springboot.myfirstwebapp.ToDo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {

	
	
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
		
	}
	private ToDoService todoService;

	@RequestMapping("todolist")
	public String showTodolist(ModelMap model) {
		
		List<ToDo> todos = todoService.findByUsername("sachin");
		model.addAttribute("todos", todos);
		
		return "todolist";
	}
}
