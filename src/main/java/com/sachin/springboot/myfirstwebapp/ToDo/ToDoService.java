package com.sachin.springboot.myfirstwebapp.ToDo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		return todos;
	}
	
	public void addToDo(String username,String description,LocalDate localdate,Boolean done) {
		
		ToDo todo=new ToDo(++count,username,description,localdate,done);
		todos.add(todo);
	}
}
