package ma.este.tachynoorapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class SpeedAndActivityTest1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String variatorSpeed;
    private double chronoSpeed;
    private double gap;
    private boolean compliant;


    public SpeedAndActivityTest1() {
    }

    public SpeedAndActivityTest1(String variatorSpeed, double chronoSpeed, double gap, boolean compliant) {
        this.variatorSpeed = variatorSpeed;
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

    public String getVariatorSpeed() {
        return variatorSpeed;
    }

    public void setVariatorSpeed(String variatorSpeed) {
        this.variatorSpeed = variatorSpeed;
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
        return "SpeedAndActivityTest1{" +
                "id=" + id +
                ", variatorSpeed='" + variatorSpeed + '\'' +
                ", ChronoSpeed=" + chronoSpeed +
                ", gap=" + gap +
                ", compliant=" + compliant +
                '}';
    }
}
