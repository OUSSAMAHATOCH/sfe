package ma.este.tachynoorapi.entities;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class PeriodicForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @OneToOne(cascade = CascadeType.ALL)
    private OrderService orderService;
    private int fileNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private Client client;
    @OneToOne(cascade = CascadeType.ALL)
    private Vehicle vehicle;
    @OneToOne(cascade = CascadeType.ALL)
    private NormalConditions normalConditions;
    @OneToOne(cascade = CascadeType.ALL)
    private AdaptationCoeff adaptationCoeff;
    @OneToOne(cascade = CascadeType.ALL)
    private Test1000m test1000m;
    @OneToOne(cascade = CascadeType.ALL)
    private Instrument instrument;
    @OneToOne(cascade =CascadeType.ALL )
    private SpeedAndActivityTest1 speedAndActivityTest1;
    @OneToOne(cascade =CascadeType.ALL )
    private SpeedAndActivityTest2 speedAndActivityTest2;
    @OneToOne(cascade =CascadeType.ALL )
    private SpeedAndActivityTest3 speedAndActivityTest3;
    @OneToOne(cascade =CascadeType.ALL )
    private SpeedAndActivityTest4 speedAndActivityTest4;
    @OneToOne(cascade =CascadeType.ALL )
    private SpeedAndActivityTest5 speedAndActivityTest5;
    @OneToOne(cascade =CascadeType.ALL )
    private SpeedAndActivityTest6 speedAndActivityTest6;
    @OneToOne(cascade =CascadeType.ALL )
    private SpeedAndActivityTest7 speedAndActivityTest7;
    @OneToOne(cascade = CascadeType.ALL)
    private ClockTest clockTest;
    @ManyToOne(cascade = CascadeType.ALL)
    private Technician technician;
    @OneToOne(cascade = CascadeType.ALL)
    private TestDistance testDistance;

    public PeriodicForm() {
    }

    public PeriodicForm(Long id, Date date, OrderService orderService, int fileNumber, Client client, Vehicle vehicle, NormalConditions normalConditions, AdaptationCoeff adaptationCoeff, Test1000m test1000m, Instrument instrument, SpeedAndActivityTest1 speedAndActivityTest1, SpeedAndActivityTest2 speedAndActivityTest2, SpeedAndActivityTest3 speedAndActivityTest3, SpeedAndActivityTest4 speedAndActivityTest4, SpeedAndActivityTest5 speedAndActivityTest5, SpeedAndActivityTest6 speedAndActivityTest6, SpeedAndActivityTest7 speedAndActivityTest7, ClockTest clockTest, Technician technician, TestDistance testDistance) {
        this.id = id;
        this.date = date;
        this.orderService = orderService;
        this.fileNumber = fileNumber;
        this.client = client;
        this.vehicle = vehicle;
        this.normalConditions = normalConditions;
        this.adaptationCoeff = adaptationCoeff;
        this.test1000m = test1000m;
        this.instrument = instrument;
        this.speedAndActivityTest1 = speedAndActivityTest1;
        this.speedAndActivityTest2 = speedAndActivityTest2;
        this.speedAndActivityTest3 = speedAndActivityTest3;
        this.speedAndActivityTest4 = speedAndActivityTest4;
        this.speedAndActivityTest5 = speedAndActivityTest5;
        this.speedAndActivityTest6 = speedAndActivityTest6;
        this.speedAndActivityTest7 = speedAndActivityTest7;
        this.clockTest = clockTest;
        this.technician = technician;
        this.testDistance = testDistance;
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



    public int getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(int fileNumber) {
        this.fileNumber = fileNumber;
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

    public NormalConditions getNormalConditions() {
        return normalConditions;
    }

    public void setNormalConditions(NormalConditions normalConditions) {
        this.normalConditions = normalConditions;
    }

    public AdaptationCoeff getAdaptationCoeff() {
        return adaptationCoeff;
    }

    public void setAdaptationCoeff(AdaptationCoeff adaptationCoeff) {
        this.adaptationCoeff = adaptationCoeff;
    }

    public Test1000m getTest1000m() {
        return test1000m;
    }

    public void setTest1000m(Test1000m test1000m) {
        this.test1000m = test1000m;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


    public ClockTest getClockTest() {
        return clockTest;
    }

    public void setClockTest(ClockTest clockTest) {
        this.clockTest = clockTest;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public TestDistance getTestDistance() {
        return testDistance;
    }

    public void setTestDistance(TestDistance testDistance) {
        this.testDistance = testDistance;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public SpeedAndActivityTest1 getSpeedAndActivityTest1() {
        return speedAndActivityTest1;
    }

    public void setSpeedAndActivityTest1(SpeedAndActivityTest1 speedAndActivityTest1) {
        this.speedAndActivityTest1 = speedAndActivityTest1;
    }

    public SpeedAndActivityTest2 getSpeedAndActivityTest2() {
        return speedAndActivityTest2;
    }

    public void setSpeedAndActivityTest2(SpeedAndActivityTest2 speedAndActivityTest2) {
        this.speedAndActivityTest2 = speedAndActivityTest2;
    }

    public SpeedAndActivityTest3 getSpeedAndActivityTest3() {
        return speedAndActivityTest3;
    }

    public void setSpeedAndActivityTest3(SpeedAndActivityTest3 speedAndActivityTest3) {
        this.speedAndActivityTest3 = speedAndActivityTest3;
    }

    public SpeedAndActivityTest4 getSpeedAndActivityTest4() {
        return speedAndActivityTest4;
    }

    public void setSpeedAndActivityTest4(SpeedAndActivityTest4 speedAndActivityTest4) {
        this.speedAndActivityTest4 = speedAndActivityTest4;
    }

    public SpeedAndActivityTest5 getSpeedAndActivityTest5() {
        return speedAndActivityTest5;
    }

    public void setSpeedAndActivityTest5(SpeedAndActivityTest5 speedAndActivityTest5) {
        this.speedAndActivityTest5 = speedAndActivityTest5;
    }

    public SpeedAndActivityTest6 getSpeedAndActivityTest6() {
        return speedAndActivityTest6;
    }

    public void setSpeedAndActivityTest6(SpeedAndActivityTest6 speedAndActivityTest6) {
        this.speedAndActivityTest6 = speedAndActivityTest6;
    }

    public SpeedAndActivityTest7 getSpeedAndActivityTest7() {
        return speedAndActivityTest7;
    }

    public void setSpeedAndActivityTest7(SpeedAndActivityTest7 speedAndActivityTest7) {
        this.speedAndActivityTest7 = speedAndActivityTest7;
    }

    @Override
    public String toString() {
        return "PeriodicForm{" +
                "id=" + id +
                ", date=" + date +
                ", orderService=" + orderService +
                ", fileNumber=" + fileNumber +
                ", client=" + client +
                ", vehicle=" + vehicle +
                ", normalConditions=" + normalConditions +
                ", adaptationCoeff=" + adaptationCoeff +
                ", test1000m=" + test1000m +
                ", instrument=" + instrument +
                ", speedAndActivityTest1=" + speedAndActivityTest1 +
                ", speedAndActivityTest2=" + speedAndActivityTest2 +
                ", speedAndActivityTest3=" + speedAndActivityTest3 +
                ", speedAndActivityTest4=" + speedAndActivityTest4 +
                ", speedAndActivityTest5=" + speedAndActivityTest5 +
                ", speedAndActivityTest6=" + speedAndActivityTest6 +
                ", speedAndActivityTest7=" + speedAndActivityTest7 +
                ", clockTest=" + clockTest +
                ", technician=" + technician +
                ", testDistance=" + testDistance +
                '}';
    }
}
