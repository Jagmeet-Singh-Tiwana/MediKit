package spring.batch;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DiseaseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer diseasePK;

    @OneToMany(cascade=  CascadeType.ALL)
    private Set<DiagnosisDTO> diagnosislist = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DiseaseParamDTO> diseaseparamlist = new HashSet<>();
    private String diseaseName;

    public Integer getDiseasePK() {
        return diseasePK;
    }

    public void setDiseasePK(Integer diseasePK) {
        this.diseasePK = diseasePK;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
}
