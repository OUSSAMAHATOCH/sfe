package ma.este.tachynoorapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SpeedAndActivityTest7 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double chronoSpeed;
    private double gap;
    private boolean compliant;

    public SpeedAndActivityTest7() {
    }

    public SpeedAndActivityTest7(double chronoSpeed, double gap, boolean compliant) {
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

    @Override
    public String toString() {
        return "SpeedAndActivityTest6{" +
                "id=" + id +
                ", ChronoSpeed=" + chronoSpeed +
                ", gap=" + gap +
                ", compliant=" + compliant +
                '}';
    }
}
