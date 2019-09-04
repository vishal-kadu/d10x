package d10x.task.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import d10x.task.document.Task;

public interface TaskRepository extends MongoRepository<Task, Integer>{
	
	Task findBy_id(Integer _id);

}
