package by.dm13y.spring.example.spring.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MyEntity {
    @Id
    private Long id;
}
