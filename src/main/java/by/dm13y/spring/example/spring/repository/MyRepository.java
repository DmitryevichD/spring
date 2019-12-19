package by.dm13y.spring.example.spring.repository;

import by.dm13y.spring.example.spring.entity.MyEntity;
import org.springframework.data.repository.CrudRepository;

public interface MyRepository extends CrudRepository<MyEntity, String> {
}
