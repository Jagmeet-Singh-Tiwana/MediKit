package spring.batch;

import javax.persistence.*;
import java.sql.Clob;
import java.sql.Timestamp;

@Entity
public class DiseaseParamDataDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer DiseaseParamDataPK;

    private Float FloatParamData;

    private Character BoolParamData;

    private Clob StringparamData;

    private Clob TableParamData;

    private Timestamp DiseaseParamTimestamp;

    @ManyToOne
    private PatientDTO PatientFK;

    @ManyToOne
    private DiseaseParamDTO DiseaseParamFK;
}
