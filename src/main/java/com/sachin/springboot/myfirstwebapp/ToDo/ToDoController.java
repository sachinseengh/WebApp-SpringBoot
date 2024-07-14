package com.sachin.springboot.myfirstwebapp.ToDo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {

	
	
	
	public ToDoController(ToDoService todoService) {
		super();
		this.todoService = todoService;
		
	}
	private ToDoService todoService;

	@RequestMapping("todo-list")
	public String showTodolist(ModelMap model) {
		
		List<ToDo> todos = todoService.findByUsername("sachin");
		model.addAttribute("todos", todos);
		
		return "todolist";
	}
	
	
	@RequestMapping(value="add-todo" ,method=RequestMethod.GET)
	public String showNewToDoPage() {
		return "add-todo";
	}
	
	@RequestMapping(value="add-todo" ,method=RequestMethod.POST)
	public String AddNewTodo(@RequestParam String description,ModelMap model) {
		
		
		todoService.addToDo((String)model.get("name"),description,LocalDate.now().plusYears(1), false);
		
		return "redirect:todo-list";
	}
	
	
	
	
}
