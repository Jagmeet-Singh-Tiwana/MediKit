package spring.batch;

import javax.persistence.*;
import java.sql.Clob;

@Entity
public class PrescribedMedicineDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer PrescribedMedicinePK;

    private Integer NumDays;

    private Clob Comments;

    @ManyToOne
    private MedicineDTO MedicineFK;

    @ManyToOne
    private PrescriptionDTO PrescriptionFK;

}
