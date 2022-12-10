package spring.batch;

import javax.persistence.*;

@Entity
public class PersonBedTestDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer PrescribedTestPK;

    @ManyToOne
    private PrescriptionDTO PrescriptionFK;


}
