package spring.batch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ParamTypeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ParamTypePK;

    private String ParamTypeName;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<DiseaseParamDTO> diseaseparamlist1 = new HashSet<>();
}
