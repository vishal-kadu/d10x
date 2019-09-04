package d10x.task.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import d10x.task.document.Task;
import d10x.task.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	  private TaskRepository repository;
	
	@RequestMapping(value = "/alltasks", method = RequestMethod.GET)
	  public List<Task> getAllTasks() {
	    return repository.findAll();
	  }

	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Task getTaskById(@PathVariable("id") Integer id) {
	    return repository.findBy_id(id);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyTaskById(@PathVariable("id") Integer id, @Valid @RequestBody Task task) {
	    task.setId(id);
	    repository.save(task);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Task createTask(@Valid @RequestBody Task task) {
	    repository.save(task);
	    return task;
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteTask(@PathVariable Integer id) {
	    repository.delete(repository.findBy_id(id));
	  }

}
