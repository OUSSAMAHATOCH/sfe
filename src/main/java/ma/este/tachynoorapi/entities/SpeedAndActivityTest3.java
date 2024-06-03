package ma.este.tachynoorapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SpeedAndActivityTest3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double chronoSpeed;
    private double gap;
    private boolean compliant;

    public SpeedAndActivityTest3(double chronoSpeed, double gap, boolean compliant) {
        this.chronoSpeed = chronoSpeed;
        this.gap = gap;
        this.compliant = compliant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getChronoSpeed() {
        return chronoSpeed;
    }

    public void setChronoSpeed(double chronoSpeed) {
        this.chronoSpeed = chronoSpeed;
    }

    public double getGap() {
        return gap;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    public boolean isCompliant() {
        return compliant;
    }

    public void setCompliant(boolean compliant) {
        this.compliant = compliant;
    }

    public SpeedAndActivityTest3() {
    }

    @Override
    public String toString() {
        return "SpeedAndActivityTest3{" +
                "id=" + id +
                ", ChronoSpeed=" + chronoSpeed +
                ", gap=" + gap +
                ", compliant=" + compliant +
                '}';
    }

}
