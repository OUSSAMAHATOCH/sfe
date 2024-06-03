package ma.este.tachynoorapi.entities;


import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

@Entity
public class NormalConditions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean vehicleState;
    private int temperature;
    private boolean vehicleEmpty;
    private String tireBrand;
    private int pressureTireGExt;
    private int pressureTireGInt;
    private int pressureTireDExt;
    private int pressureTireDInt;
    private int wearTireGExt;
    private int wearTireGInt;
    private int wearTireDExt;
    private int wearTireDInt;
    private String dimension;

    public NormalConditions() {}

    public NormalConditions( boolean vehicleState, int temperature, boolean vehicleEmpty, String tireBrand, int pressureTireGExt, int pressureTireGInt, int pressureTireDExt, int pressureTireDInt, int wearTireGExt, int wearTireGInt, int wearTireDExt, int wearTireDInt, String dimension) {
        this.vehicleState = vehicleState;
        this.temperature = temperature;
        this.vehicleEmpty = vehicleEmpty;
        this.tireBrand = tireBrand;
        this.pressureTireGExt = pressureTireGExt;
        this.pressureTireGInt = pressureTireGInt;
        this.pressureTireDExt = pressureTireDExt;
        this.pressureTireDInt = pressureTireDInt;
        this.wearTireGExt = wearTireGExt;
        this.wearTireGInt = wearTireGInt;
        this.wearTireDExt = wearTireDExt;
        this.wearTireDInt = wearTireDInt;
        this.dimension = dimension;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVehicleState() {
        return vehicleState;
    }

    public void setVehicleState(boolean vehicleState) {
        this.vehicleState = vehicleState;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isVehicleEmpty() {
        return vehicleEmpty;
    }

    public void setVehicleEmpty(boolean vehicleEmpty) {
        this.vehicleEmpty = vehicleEmpty;
    }

    public String getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }

    public int getPressureTireGExt() {
        return pressureTireGExt;
    }

    public void setPressureTireGExt(int pressureTireGExt) {
        this.pressureTireGExt = pressureTireGExt;
    }

    public int getPressureTireGInt() {
        return pressureTireGInt;
    }

    public void setPressureTireGInt(int pressureTireGInt) {
        this.pressureTireGInt = pressureTireGInt;
    }

    public int getPressureTireDExt() {
        return pressureTireDExt;
    }

    public void setPressureTireDExt(int pressureTireDExt) {
        this.pressureTireDExt = pressureTireDExt;
    }

    public int getPressureTireDInt() {
        return pressureTireDInt;
    }

    public void setPressureTireDInt(int pressureTireDInt) {
        this.pressureTireDInt = pressureTireDInt;
    }

    public int getWearTireGExt() {
        return wearTireGExt;
    }

    public void setWearTireGExt(int wearTireGExt) {
        this.wearTireGExt = wearTireGExt;
    }

    public int getWearTireGInt() {
        return wearTireGInt;
    }

    public void setWearTireGInt(int wearTireGInt) {
        this.wearTireGInt = wearTireGInt;
    }

    public int getWearTireDExt() {
        return wearTireDExt;
    }

    public void setWearTireDExt(int wearTireDExt) {
        this.wearTireDExt = wearTireDExt;
    }

    public int getWearTireDInt() {
        return wearTireDInt;
    }

    public void setWearTireDInt(int wearTireDInt) {
        this.wearTireDInt = wearTireDInt;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "NormalConditions{" +
                "id=" + id +
                ", vehicleState=" + vehicleState +
                ", temperature=" + temperature +
                ", vehicleEmpty=" + vehicleEmpty +
                ", tireBrand='" + tireBrand + '\'' +
                ", pressureTireGExt=" + pressureTireGExt +
                ", pressureTireGInt=" + pressureTireGInt +
                ", pressureTireDExt=" + pressureTireDExt +
                ", pressureTireDInt=" + pressureTireDInt +
                ", wearTireGExt=" + wearTireGExt +
                ", wearTireGInt=" + wearTireGInt +
                ", wearTireDExt=" + wearTireDExt +
                ", wearTireDInt=" + wearTireDInt +
                ", dimension='" + dimension + '\'' +
                '}';
    }
}





