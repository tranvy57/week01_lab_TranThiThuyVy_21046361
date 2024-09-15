package iuh.fit.week01_lab_tranthithuyvy_21046361.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
    @Id
    private int id;
    private String name;

    public Test() {}

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }


}