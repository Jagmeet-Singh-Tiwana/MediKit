package spring.batch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LabDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer LabPK;

    private String LabName;

    private String State;

    private String District;

    private String City;

    private Integer Pin;
}
