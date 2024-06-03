package ma.este.tachynoorapi.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.springframework.context.annotation.Lazy;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity

public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String registrationNumber;
    private String type;
    private String vinNumber;
    private Date date;

    public Vehicle() {
    }


    public Vehicle(String brand, String registrationNumber, String type, String vinNumber, Date date ) {
        this.brand = brand;
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getType() {
        return type;
    }

    public String getVinNumber() {
        return vinNumber;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", type='" + type + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", date=" + date +
                '}';
    }
}
