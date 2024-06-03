package ma.este.tachynoorapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VerificationNormalConditions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean vehicleEmpty ;
    private boolean vehicleState;
    private boolean pressureTire ;
    private boolean temperature ;
    private boolean wearTire ;
    private boolean filling;

    public VerificationNormalConditions() {
    }

    public VerificationNormalConditions(boolean vehicleEmpty, boolean vehicleState, boolean pressureTire, boolean temperature, boolean wearTire, boolean filling) {
        this.vehicleEmpty = vehicleEmpty;
        this.vehicleState = vehicleState;
        this.pressureTire = pressureTire;
        this.temperature = temperature;
        this.wearTire = wearTire;
        this.filling = filling;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVehicleEmpty() {
        return vehicleEmpty;
    }

    public void setVehicleEmpty(boolean vehicleEmpty) {
        this.vehicleEmpty = vehicleEmpty;
    }

    public boolean isVehicleState() {
        return vehicleState;
    }

    public void setVehicleState(boolean vehicleState) {
        this.vehicleState = vehicleState;
    }

    public boolean isPressureTire() {
        return pressureTire;
    }

    public void setPressureTire(boolean pressureTire) {
        this.pressureTire = pressureTire;
    }

    public boolean isTemperature() {
        return temperature;
    }

    public void setTemperature(boolean temperature) {
        this.temperature = temperature;
    }

    public boolean isWearTire() {
        return wearTire;
    }

    public void setWearTire(boolean wearTire) {
        this.wearTire = wearTire;
    }

    public boolean isFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "VerificationNormalConditions{" +
                "id=" + id +
                ", vehicleEmpty=" + vehicleEmpty +
                ", vehicleState=" + vehicleState +
                ", pressureTire=" + pressureTire +
                ", temperature=" + temperature +
                ", wearTire=" + wearTire +
                ", filling=" + filling +
                '}';
    }
}
