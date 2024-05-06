package Springboot;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Department {
    @Id
    long id;
    String name;

    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
