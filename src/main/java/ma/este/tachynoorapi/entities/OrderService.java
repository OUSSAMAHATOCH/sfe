package ma.este.tachynoorapi.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity

public class OrderService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private int orderNumber;
    @Enumerated(EnumType.STRING)
    private InterventionType typeIntervention;
    private String reqCustomer;
    private String vehicleControl;
    private boolean autorisation;
    @OneToOne(cascade = CascadeType.ALL)
    private Client client;
    @OneToOne(cascade = CascadeType.ALL)
    private Vehicle vehicle;
    private boolean createForm;

    public OrderService() {
    }

    public OrderService(Date date, int orderNumber, InterventionType typeIntervention, String reqCustomer, String vehicleControl, boolean autorisation, Client client, Vehicle vehicle, boolean createForm) {
        this.date = date;
        this.orderNumber = orderNumber;
        this.typeIntervention = typeIntervention;
        this.reqCustomer = reqCustomer;
        this.vehicleControl = vehicleControl;
        this.autorisation = autorisation;
        this.client = client;
        this.vehicle = vehicle;
        this.createForm = createForm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }




    public String getReqCustomer() {
        return reqCustomer;
    }

    public void setReqCustomer(String reqCustomer) {
        this.reqCustomer = reqCustomer;
    }

    public String getVehicleControl() {
        return vehicleControl;
    }

    public void setVehicleControl(String vehicleControl) {
        this.vehicleControl = vehicleControl;
    }

    public boolean isAutorisation() {
        return autorisation;
    }

    public void setAutorisation(boolean autorisation) {
        this.autorisation = autorisation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public InterventionType getTypeIntervention() {
        return typeIntervention;
    }

    public void setTypeIntervention(InterventionType typeIntervention) {
        this.typeIntervention = typeIntervention;
    }

    public boolean isCreateForm() {
        return createForm;
    }

    public void setCreateForm(boolean createForm) {
        this.createForm = createForm;
    }
}
