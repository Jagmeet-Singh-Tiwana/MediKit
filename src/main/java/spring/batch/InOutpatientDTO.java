package spring.batch;

import javax.persistence.*;

@Entity
public class InOutpatientDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer InOutpatientPK;

    @ManyToOne
    private PatientDTO PatientFK;

    private Character IsInpatient;

    private Integer OPDUnitNo;

    private Integer WardNo;

    private Integer BedNo;

    private Integer StartDate;

    private Integer EndDate;

    private Integer NextInOutFK;

}
