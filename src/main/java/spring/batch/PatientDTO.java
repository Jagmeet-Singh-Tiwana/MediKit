package spring.batch;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PatientDTO {

    @Id
    private Integer PatientPK;

    private String PatientName;

    private Integer Gender;

    private String FatherName;

    private String Mobile;

    private Date DOB;

    private Float Height;

    private Float Weight;

    private Integer RegistrationNo;

    private String State;

    private String District;

    private String City;

    private Integer Pin;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<ConsultationDTO> consultationlist =new HashSet<>();

    @OneToMany
    private  Set<InOutpatientDTO> patientlist = new HashSet<>();

    @OneToMany
    private Set<TreatmentDTO> treatmentlistforpatient = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DiseaseParamDataDTO> diseaseparamdatalist = new HashSet<>();

    public Integer getPatientPK() {
        return PatientPK;
    }

    public void setPatientPK(Integer patientPK) {
        PatientPK = patientPK;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Float getHeight() {
        return Height;
    }

    public void setHeight(Float height) {
        Height = height;
    }

    public Float getWeight() {
        return Weight;
    }

    public void setWeight(Float weight) {
        Weight = weight;
    }

    public Integer getRegistrationNo() {
        return RegistrationNo;
    }

    public void setRegistrationNo(Integer registrationNo) {
        RegistrationNo = registrationNo;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Integer getPin() {
        return Pin;
    }

    public void setPin(Integer pin) {
        Pin = pin;
    }
}
