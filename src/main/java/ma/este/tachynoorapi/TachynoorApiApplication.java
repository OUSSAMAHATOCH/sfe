package ma.este.tachynoorapi;

import ma.este.tachynoorapi.entities.*;
import ma.este.tachynoorapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class TachynoorApiApplication implements CommandLineRunner {

    @Autowired
    private FormRepository formRepository;

    @Autowired
    private OrderServiceRepository orderServiceRepository;

    @Autowired
    private PeriodicFormRepository periodicFormRepository;



    public static void main(String[] args) {
        SpringApplication.run(TachynoorApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Vehicle vehicle = new Vehicle("toyota","00000000","shiHaja","0000000",new Date());
        Technician technician = new Technician("oussama hatoch","oushato","1234",null);
        Client client = new Client("oussama","1230000","00000","0000000000");
        Test1000m test1000m = new Test1000m(false,false,"000","000","000","000","000","000");
        AdaptationCoeff adaptationCoeff = new AdaptationCoeff(0,0,0);
        SpeedAndActivityTest1 speedAndActivityTest1 = new SpeedAndActivityTest1("125" , 0,0,false);
        SpeedAndActivityTest2 speedAndActivityTest2 = new SpeedAndActivityTest2(0,0,false);
        SpeedAndActivityTest3 speedAndActivityTest3 = new SpeedAndActivityTest3( 0,0,false);
        SpeedAndActivityTest4 speedAndActivityTest4 = new SpeedAndActivityTest4("125" , 0,0,false);
        SpeedAndActivityTest5 speedAndActivityTest5 = new SpeedAndActivityTest5("000",0,0,false);
        SpeedAndActivityTest6 speedAndActivityTest6 = new SpeedAndActivityTest6( 0,0,false);
        SpeedAndActivityTest7 speedAndActivityTest7 = new SpeedAndActivityTest7(0,0,false);
        Instrument instrument = new Instrument("000","000","000",false,false,"000","000","000",0,0,0,0,0,0,0,"000",2004,"000");
        ClockTest clockTest = new ClockTest(0,false,0,0);
        NormalConditions normalConditions = new NormalConditions(false,0,false,"ooo",0,0,0,0,0,0,0,0,"000");
        TestDistance testDistance = new TestDistance(0,0,0,false);
        VerificationNormalConditions verificationNormalConditions = new VerificationNormalConditions(false,false,false,false,false,false);
        OrderService orderService = new OrderService(new Date(),10,InterventionType.VERIFICATION,"000","000",false,client,vehicle, false);


        Form form = new Form(new Date(), client, vehicle, normalConditions, adaptationCoeff, test1000m, instrument, clockTest, technician, testDistance, verificationNormalConditions, orderService, 44,speedAndActivityTest1,speedAndActivityTest2,speedAndActivityTest3,speedAndActivityTest4,speedAndActivityTest5,speedAndActivityTest6,speedAndActivityTest7);
       // PeriodicForm periodicForm = new PeriodicForm(new Date(),0,0,client,vehicle,normalConditions,adaptationCoeff, instrument, test1000m,speedAndActivityTests,clockTest,technician,testDistance);
       // periodicFormRepository.save(periodicForm);
        //formRepository.save(form);
        //orderServiceRepository.save(orderService);

















/*
        List<Product> products = productRepository.findAll();
        products.forEach(p ->{
            System.out.println(p.toString());
        } );

        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("**************************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println("****************************");

        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p ->{
            System.out.println(p);
        });

        System.out.println("------------------------");
        List<Product> productList2 = productRepository.search("%C%");
        productList2.forEach(p ->{
            System.out.println(p);
        });
        System.out.println("------------------------");
        List<Product> productList3 = productRepository.findByPriceGreaterThan(2000);
        productList3.forEach(p ->{
            System.out.println(p);
        });

        System.out.println("------------------------");
        List<Product> productList4 = productRepository.searchByPrice(1000);
        productList4.forEach(p ->{
            System.out.println(p);
        });



 */

    }
}
