package spring.batch;

import javax.persistence.*;

@Entity
public class TreatmentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer TreatmentPK;

    private Integer StartDate;

    private Integer EndDate;

    @ManyToOne
    private PatientDTO PatientFK;

    @ManyToOne
    private MedicineDTO MedicineFK;

}
