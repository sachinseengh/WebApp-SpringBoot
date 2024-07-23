package com.sachin.springboot.myfirstwebapp.ToDo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
		String username =getLoggedinUsername(model);
		List<ToDo> todos = todoService.findByUsername(username);
		model.addAttribute("todos", todos);
		
		return "todolist";
	}


	private String getLoggedinUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	
	@RequestMapping(value="add-todo" ,method=RequestMethod.GET)
	public String showNewToDoPage(ModelMap model) {
		String username =getLoggedinUsername(model);
		ToDo todo = new ToDo(0,username," ",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "add-todo";
	}
	
	@RequestMapping(value="add-todo" ,method=RequestMethod.POST)
//	public String AddNewTodo(@Valid ToDo todo,ModelMap model,BindingResult result) {
	public String AddNewTodo(ToDo todo,ModelMap model) {
		
		//Binding Result didn't worked here
//		if(result.hasErrors()) {
//		System.out.println(result);
//		}
		
		todoService.addToDo(getLoggedinUsername(model),todo.getDescription(),LocalDate.now().plusYears(1), false);
		
		return "redirect:todo-list";
		
	}
	
	@RequestMapping("delete-todo")
	public String DeleteTodo(@RequestParam int id,ModelMap model) {
		
		todoService.deleteById(id);
		
		return "redirect:todo-list";
	}
	
	@RequestMapping("edit-todo")
	public String ShowUpdateTodopage(@RequestParam int id,ModelMap model) {
		
     ToDo todo = todoService.findById(id);
     model.addAttribute("todo",todo);
     return "add-todo";
	}
	
	@RequestMapping(value="edit-todo" ,method=RequestMethod.POST)
	public String UpdateTodo(ToDo todo,ModelMap model) {
	
		
		String username = getLoggedinUsername(model);
		todo.setUsername(username);
		
		todoService.updateTodo(todo);
		return "redirect:todo-list";
		
	}
	
	
	
	
	
}
