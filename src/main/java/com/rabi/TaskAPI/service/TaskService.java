package com.rabi.TaskAPI.service;

import com.rabi.TaskAPI.entity.Task;
import com.rabi.TaskAPI.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
	
	@Autowired
	TaskRepo taskRepo;
	
	List<Task> taskList = new ArrayList<>();
	
	public Task createTask(Task task) {
		return taskRepo.save(task);
	}
	
	public List<Task> getAllTasks() {
		taskList = taskRepo.findAll();
		return taskList;
	}
	
	public Task getTaskById(Integer id) {
		Optional<Task> byId = taskRepo.findById(id);
		return byId.get();
	}
	
	public Task updateTask(int id, Task newTask){
		Optional<Task> taskById = taskRepo.findById(id);
		if(taskById.isPresent()){
			Task task = taskById.get();
			task.setId(newTask.getId());
			task.setName(newTask.getName());
			task.setDescription(newTask.getDescription());
			return taskRepo.save(task);
		}
		
		System.out.println("No Task Found by This ID");
		return null;
	}
	
	public void deleteTask(int id){
		taskRepo.deleteById(id);
		System.out.println("Task Deleted Successfully");
	}
	
}
