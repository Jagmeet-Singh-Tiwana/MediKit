package spring.batch;


import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Entity
@Table(name="Hospital")
public class HospitalDTO {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer HospitalPK;
    private String HospitalName;
    private String State;
    private String City;
    private String District;
    private Integer PinCode;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DepartmentDTO> deptlist =new HashSet<>();

    public Integer getHospitalPK() {
        return HospitalPK;
    }

    public void setHospitalPK(Integer hospitalPK) {
        HospitalPK = hospitalPK;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Integer getPinCode() {
        return PinCode;
    }

    public void setPinCode(Integer pinCode) {
        PinCode = pinCode;
    }
}
