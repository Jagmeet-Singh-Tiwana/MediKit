package spring.batch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class DiseaseParamDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer DiseaseParamPK;

    private String DiseaseParamName;

    @ManyToOne
    private DiseaseDTO DiseaseFK;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DiseaseParamDataDTO> diseaseParamDatalist = new HashSet<>();

}
