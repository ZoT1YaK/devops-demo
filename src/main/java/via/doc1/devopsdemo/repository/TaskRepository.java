package via.doc1.devopsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.devopsdemo.model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, String>{
    
}