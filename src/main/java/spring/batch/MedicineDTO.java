package spring.batch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MedicineDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer MedicinePK;

    private String MedicineName;

    @OneToMany
    private Set<TreatmentDTO> treatmentlist = new HashSet<>();

    @OneToMany
    private Set<PrescribedMedicineDTO> prescribedMedicine = new HashSet<>();

}
