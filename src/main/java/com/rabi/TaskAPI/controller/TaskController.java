package com.rabi.TaskAPI.controller;

import com.rabi.TaskAPI.entity.Task;
import com.rabi.TaskAPI.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@PostMapping("/create")
	public Task create(@RequestBody Task Task){
		return taskService.createTask(Task);
	}
	
	@GetMapping("/get-all")
	public List<Task> getAllTasks(){
		return taskService.getAllTasks();
	}
	
	@GetMapping("/get/{id}")
	public Task getTask(@PathVariable Integer id){
		return taskService.getTaskById(id);
	}
	
	@PutMapping("/update/{id}")
	public Task updateTask(@PathVariable int id, @RequestBody Task task){
	     return taskService.updateTask(id, task);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteTask(@PathVariable int id){
		 taskService.deleteTask(id);
	}
	
}
