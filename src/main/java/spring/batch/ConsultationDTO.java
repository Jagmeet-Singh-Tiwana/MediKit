package spring.batch;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class ConsultationDTO {

    @Id
    private Integer ConsultationPK;

    @ManyToOne
    private PatientDTO PatientFK;

    @ManyToOne
    private DoctorDTO DoctorFK;

    @OneToMany
    private Set<PrescriptionDTO> prescriptionList = new HashSet<>();

    public PatientDTO getPatientFK() {
        return PatientFK;
    }

    public void setPatientFK(PatientDTO patientFK) {
        PatientFK = patientFK;
    }

    public DoctorDTO getDoctorFK() {
        return DoctorFK;
    }

    public void setDoctorFK(DoctorDTO doctorFK) {
        DoctorFK = doctorFK;
    }

    private Timestamp ConsultationTimeStamp;

    public Integer getConsultationPK() {
        return ConsultationPK;
    }

    public void setConsultationPK(Integer consultationPK) {
        ConsultationPK = consultationPK;
    }



    public Timestamp getConsultationTimeStamp() {
        return ConsultationTimeStamp;
    }

    public void setConsultationTimeStamp(Timestamp consultationTimeStamp) {
        ConsultationTimeStamp = consultationTimeStamp;
    }
}
