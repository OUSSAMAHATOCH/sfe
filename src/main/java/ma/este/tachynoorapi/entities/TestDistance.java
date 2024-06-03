package ma.este.tachynoorapi.entities;

import jakarta.persistence.*;

@Entity
public class TestDistance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalizerBefore;
    private int totalizerAfter;
    private int beforeAfter;
    private boolean compilant;



    public TestDistance() {
    }

    public TestDistance( int totalizerBefore, int totalizerAfter, int beforeAfter, boolean compilant) {
        this.totalizerBefore = totalizerBefore;
        this.totalizerAfter = totalizerAfter;
        this.beforeAfter = beforeAfter;

        this.compilant = compilant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalizerBefore() {
        return totalizerBefore;
    }

    public void setTotalizerBefore(int totalizerBefore) {
        this.totalizerBefore = totalizerBefore;
    }

    public int getTotalizerAfter() {
        return totalizerAfter;
    }

    public void setTotalizerAfter(int totalizerAfter) {
        this.totalizerAfter = totalizerAfter;
    }

    public int getBeforeAfter() {
        return beforeAfter;
    }

    public void setBeforeAfter(int beforeAfter) {
        this.beforeAfter = beforeAfter;
    }


    public boolean isCompilant() {
        return compilant;
    }

    public void setCompilant(boolean compilant) {
        this.compilant = compilant;
    }

    @Override
    public String toString() {
        return "TestDistance{" +
                "id=" + id +
                ", totalizerBefore=" + totalizerBefore +
                ", totalizerAfter=" + totalizerAfter +
                ", beforeAfter=" + beforeAfter +
                ", compilant=" + compilant +
                '}';
    }


}


