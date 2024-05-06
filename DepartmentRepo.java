package Springboot;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DepartmentRepo extends CrudRepository<Department,Long> {
    List<Department> findByName(String name);
}
