package spring.batch;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class DoctorDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer DoctorPK;

    private String DoctorName;

    private Integer DepartmentFK;

    private Character isHOD;

    @ManyToOne
    private DepartmentDTO departmentDTO;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<ConsultationDTO> consultationlist1 =new HashSet<>();

    public Integer getDoctorPK() {
        return DoctorPK;
    }

    public void setDoctorPK(Integer doctorPK) {
        DoctorPK = doctorPK;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public Integer getDepartmentFK() {
        return DepartmentFK;
    }

    public void setDepartmentFK(Integer departmentFK) {
        DepartmentFK = departmentFK;
    }

    public Character getIsHOD() {
        return isHOD;
    }

    public void setIsHOD(Character isHOD) {
        this.isHOD = isHOD;
    }
}
