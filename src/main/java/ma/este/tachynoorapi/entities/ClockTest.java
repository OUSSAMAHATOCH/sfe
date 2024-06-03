package ma.este.tachynoorapi.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

@Entity
public class ClockTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    private boolean compliant;
    private int gapSec;
    private int gapMin;


    public ClockTest() {}

    public ClockTest( int value, boolean compliant, int gapSec, int gapMin) {

        this.value = value;
        this.compliant = compliant;
        this.gapSec = gapSec;
        this.gapMin = gapMin;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isCompliant() {
        return compliant;
    }

    public void setCompliant(boolean compliant) {
        this.compliant = compliant;
    }

    public int getGapSec() {
        return gapSec;
    }

    public void setGapSec(int gapSec) {
        this.gapSec = gapSec;
    }

    public int getGapMin() {
        return gapMin;
    }

    public void setGapMin(int gapMin) {
        this.gapMin = gapMin;
    }




    @Override
    public String toString() {
        return "ClockTest{" +
                "id=" + id +
                ", value=" + value +
                ", compliant=" + compliant +
                ", gapSec=" + gapSec +
                ", gapMin=" + gapMin +
                '}';
    }
}
