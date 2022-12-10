package spring.batch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer TestPK;

    private String TestName;
}
