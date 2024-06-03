package ma.este.tachynoorapi.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

@Entity

public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String serieNumber;
    private String approvalNumber;
    private boolean voltage;
    private boolean filling;
    private String model;
    private String vmax;
    private String type;
    private int w1;
    private int w2;
    private int w3;
    private int w;
    private int lo;
    private int lg;
    private int lmay;
    private String constantK;
    private int manufactureYear;
    private String approval;

    public Instrument() {
    }

    public Instrument(String brand, String serieNumber, String approvalNumber, boolean voltage, boolean filling, String model, String vmax, String type, int w1, int w2, int w3, int w, int lo, int lg, int lmay,String constantK,int manufactureYear,String approval) {
        this.brand = brand;
        this.serieNumber = serieNumber;
        this.approvalNumber = approvalNumber;
        this.voltage = voltage;
        this.filling = filling;
        this.model = model;
        this.vmax = vmax;
        this.type = type;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w = w;
        this.lo = lo;
        this.lg = lg;
        this.lmay = lmay;
        this.constantK = constantK;
        this.manufactureYear = manufactureYear;
        this.approval = approval;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerieNumber() {
        return serieNumber;
    }

    public void setSerieNumber(String serieNumber) {
        this.serieNumber = serieNumber;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public boolean isVoltage() {
        return voltage;
    }

    public void setVoltage(boolean voltage) {
        this.voltage = voltage;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVmax() {
        return vmax;
    }

    public void setVmax(String vmax) {
        this.vmax = vmax;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getW1() {
        return w1;
    }

    public void setW1(int w1) {
        this.w1 = w1;
    }

    public int getW2() {
        return w2;
    }

    public void setW2(int w2) {
        this.w2 = w2;
    }

    public int getW3() {
        return w3;
    }

    public void setW3(int w3) {
        this.w3 = w3;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public int getLg() {
        return lg;
    }

    public void setLg(int lg) {
        this.lg = lg;
    }

    public int getLmay() {
        return lmay;
    }

    public void setLmay(int lmay) {
        this.lmay = lmay;
    }

    public String getConstantK() {
        return constantK;
    }

    public void setConstantK(String constantK) {
        this.constantK = constantK;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", serieNumber='" + serieNumber + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", voltage=" + voltage +
                ", filling=" + filling +
                ", model='" + model + '\'' +
                ", vmax='" + vmax + '\'' +
                ", type='" + type + '\'' +
                ", w1=" + w1 +
                ", w2=" + w2 +
                ", w3=" + w3 +
                ", w=" + w +
                ", lo=" + lo +
                ", lg=" + lg +
                ", lmay=" + lmay +
                ", constantK='" + constantK + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", approval='" + approval + '\'' +
                '}';
    }
}

