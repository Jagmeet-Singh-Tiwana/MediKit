package spring.batch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class PrescriptionDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer prescriptionPK;

    @ManyToOne
    private  ConsultationDTO consultationFK;

    private String comments;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<PrescribedMedicineDTO> prescribedMedicinelist = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DiagnosisDTO> diagnosislist1 = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<PersonBedTestDTO> personBedTestlist = new HashSet<>();
}
