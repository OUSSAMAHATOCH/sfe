package ma.este.tachynoorapi.entities;

import jakarta.persistence.*;
import org.springframework.context.annotation.Lazy;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String cin;
    private String phone;

    public Client() {


    }
    public Client( String name, String address, String cin, String phone) {
        this.name = name;
        this.address = address;
        this.cin = cin;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCin() {
        return cin;
    }
    public String getPhone() {
        return phone;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cin='" + cin + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

