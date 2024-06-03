package ma.este.tachynoorapi.entities;


import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

@Entity
public class AdaptationCoeff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int coeffientW;
    private int constantK;
    private int circumferenceL;


    public AdaptationCoeff() {}

    public AdaptationCoeff( int coeffientW, int constantK, int circumferenceL) {
        this.coeffientW = coeffientW;
        this.constantK = constantK;
        this.circumferenceL = circumferenceL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCoeffientW() {
        return coeffientW;
    }

    public void setCoeffientW(int coeffientW) {
        this.coeffientW = coeffientW;
    }

    public int getConstantK() {
        return constantK;
    }

    public void setConstantK(int constantK) {
        this.constantK = constantK;
    }

    public int getCircumferenceL() {
        return circumferenceL;
    }

    public void setCircumferenceL(int circumferenceL) {
        this.circumferenceL = circumferenceL;
    }

    @Override
    public String toString() {
        return "AdaptationCoeff{" +
                "id=" + id +
                ", coeffientW=" + coeffientW +
                ", constantK=" + constantK +
                ", circumferenceL=" + circumferenceL +
                '}';
    }
}


