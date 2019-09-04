package d10x.task.applier.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import d10x.task.applier.document.Applier;

public interface ApplierRepository extends MongoRepository<Applier, Integer>{
	
	Applier findBy_id(Integer _id);

}
