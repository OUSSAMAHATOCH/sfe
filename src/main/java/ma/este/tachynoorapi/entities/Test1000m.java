package ma.este.tachynoorapi.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

@Entity
public class Test1000m {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean compliantBanc;
    private boolean compliantChrono;
    private String gapBanc;
    private String gapChrono;
    private String speedChrono;
    private String distanceChrono;
    private String speedBanc;
    private String distanceBanc;

    public Test1000m() {}

    public Test1000m( boolean compliantBanc, boolean compliantChrono, String gapBanc, String gapChrono, String speedChrono, String distanceChrono, String speedBanc, String distanceBanc) {

        this.compliantBanc = compliantBanc;
        this.compliantChrono = compliantChrono;
        this.gapBanc = gapBanc;
        this.gapChrono = gapChrono;
        this.speedChrono = speedChrono;
        this.distanceChrono = distanceChrono;
        this.speedBanc = speedBanc;
        this.distanceBanc = distanceBanc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public boolean isCompliantBanc() {
        return compliantBanc;
    }

    public void setCompliantBanc(boolean compliantBanc) {
        this.compliantBanc = compliantBanc;
    }

    public boolean isCompliantChrono() {
        return compliantChrono;
    }

    public void setCompliantChrono(boolean compliantChrono) {
        this.compliantChrono = compliantChrono;
    }

    public String getGapBanc() {
        return gapBanc;
    }

    public void setGapBanc(String gapBanc) {
        this.gapBanc = gapBanc;
    }

    public String getGapChrono() {
        return gapChrono;
    }

    public void setGapChrono(String gapChrono) {
        this.gapChrono = gapChrono;
    }

    public String getSpeedChrono() {
        return speedChrono;
    }

    public void setSpeedChrono(String speedChrono) {
        this.speedChrono = speedChrono;
    }

    public String getDistanceChrono() {
        return distanceChrono;
    }

    public void setDistanceChrono(String distanceChrono) {
        this.distanceChrono = distanceChrono;
    }

    public String getSpeedBanc() {
        return speedBanc;
    }

    public void setSpeedBanc(String speedBanc) {
        this.speedBanc = speedBanc;
    }

    public String getDistanceBanc() {
        return distanceBanc;
    }

    public void setDistanceBanc(String distanceBanc) {
        this.distanceBanc = distanceBanc;
    }


    @Override
    public String toString() {
        return "Test1000m{" +
                "id=" + id +
                ", compliantBanc=" + compliantBanc +
                ", compliantChrono=" + compliantChrono +
                ", gapBanc='" + gapBanc + '\'' +
                ", gapChrono='" + gapChrono + '\'' +
                ", speedChrono='" + speedChrono + '\'' +
                ", distanceChrono='" + distanceChrono + '\'' +
                ", SpeedBanc='" + speedBanc + '\'' +
                ", DistanceBanc='" + distanceBanc + '\'' +
                '}';
    }
}



