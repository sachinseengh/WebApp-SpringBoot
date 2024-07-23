package com.sachin.springboot.myfirstwebapp.ToDo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	private static int count =0;
	
	private static List<ToDo> todos= new ArrayList<>();
	
	

	static {
        todos.add(new ToDo(++count, "sachin", "Learn React", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(++count, "sachin", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new ToDo(++count, "sachin", "Learn Azure", LocalDate.now().plusYears(1), false));
    }
	
	public List<ToDo> findByUsername(String username){
		Predicate<? super ToDo> predicate =todos-> todos.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	
	public void addToDo(String username,String description,LocalDate localdate,Boolean done) {
		
		ToDo todo=new ToDo(++count,username,description,localdate,done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<? super ToDo> predicate =todos-> todos.getId()==id;
		todos.removeIf(predicate);
	}
	
	public ToDo findById(int id) {
		Predicate<? super ToDo> predicate =todos-> todos.getId()==id;
		ToDo todo=todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
	public void updateTodo(ToDo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}

	
}
