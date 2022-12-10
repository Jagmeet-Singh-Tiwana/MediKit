package spring.batch;



import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Department")
public class DepartmentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer DepartmentPK;


    @ManyToOne
    private HospitalDTO HospitalFK;

    private String DepartmentName;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DoctorDTO> doctorlist = new HashSet<>();


    public HospitalDTO getHospitalFK() {
        return HospitalFK;
    }

    public void setHospitalFK(HospitalDTO hospitalFK) {
        HospitalFK = hospitalFK;
    }



    public Integer getDepartmentPK() {
        return DepartmentPK;
    }

    public void setDepartmentPK(Integer departmentPK) {
        DepartmentPK = departmentPK;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }


}

