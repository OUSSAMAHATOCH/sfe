package ma.este.tachynoorapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SpeedAndActivityTest5 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String variatorSpeed;
    private double chronoSpeed;
    private double gap;
    private boolean compliant;

    public SpeedAndActivityTest5() {
    }

    public SpeedAndActivityTest5(String variatorSpeed, double chronoSpeed, double gap, boolean compliant) {
        this.variatorSpeed = variatorSpeed;
        this.chronoSpeed = chronoSpeed;
        this.gap = gap;
        this.compliant = compliant;
    }

    public void setVariatorSpeed(String variatorSpeed) {
        this.variatorSpeed = variatorSpeed;
    }

    public void setChronoSpeed(double chronoSpeed) {
        this.chronoSpeed = chronoSpeed;
    }

    public void setGap(double gap) {
        this.gap = gap;
    }

    public void setCompliant(boolean compliant) {
        this.compliant = compliant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVariatorSpeed() {
        return variatorSpeed;
    }

    public double getChronoSpeed() {
        return chronoSpeed;
    }

    public double getGap() {
        return gap;
    }

    public boolean isCompliant() {
        return compliant;
    }

    @Override
    public String toString() {
        return "SpeedAndActivityTest5{" +
                "id=" + id +
                ", variatorSpeed='" + variatorSpeed + '\'' +
                ", ChronoSpeed=" + chronoSpeed +
                ", gap=" + gap +
                ", compliant=" + compliant +
                '}';
    }
}
