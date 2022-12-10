package spring.batch;

import javax.persistence.*;

@Entity
public class DiagnosisDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer DiagnosisPK;

    private String Description;

    private Character ProvisionalorFinal;

    @ManyToOne
    private DiseaseDTO DiseaseFK;

    @ManyToOne
    private PrescriptionDTO PrescriptionFK;

}
