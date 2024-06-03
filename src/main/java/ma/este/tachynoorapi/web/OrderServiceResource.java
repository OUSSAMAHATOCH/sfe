package ma.este.tachynoorapi.web;



import ma.este.tachynoorapi.entities.*;
import ma.este.tachynoorapi.repository.OrderServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderServiceResource {

    @Autowired
    private OrderServiceRepository orderServiceRepository;

    @GetMapping("/order")
    public List<OrderService> getOrderService() {
        return orderServiceRepository.findAll();
    }

    @GetMapping("/order/{id}")
    public OrderService getOrderService(@PathVariable Long id){
        return orderServiceRepository.findById(id).get();
    }



    @DeleteMapping("/order/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        orderServiceRepository.deleteById(id);
        return ResponseEntity.ok("Form with ID " + id + " deleted successfully.");
    }



    @PostMapping("/order")
    public OrderService createOrder(@RequestBody OrderService orderService) {
        return orderServiceRepository.save(orderService);
    }

    @PutMapping("/order/{id}")
    public ResponseEntity<String> updateForm(@PathVariable Long id, @RequestBody OrderService updatedOrderService) {
        Optional<OrderService> existingOrderServiceOptional = orderServiceRepository.findById(id);
        if (existingOrderServiceOptional.isPresent()) {

            OrderService existingOrderService = existingOrderServiceOptional.get();
            existingOrderService.setDate(updatedOrderService.getDate());
            existingOrderService.setTypeIntervention(updatedOrderService.getTypeIntervention());
            existingOrderService.setAutorisation(updatedOrderService.isAutorisation());
            existingOrderService.setReqCustomer(updatedOrderService.getReqCustomer());
            existingOrderService.setVehicleControl(updatedOrderService.getVehicleControl());
            existingOrderService.setOrderNumber(updatedOrderService.getOrderNumber());

            Client existingClient = existingOrderService.getClient();
            Client updatedClient = updatedOrderService.getClient();
            existingClient.setAddress(updatedClient.getAddress());
            existingClient.setName(updatedClient.getName());
            existingClient.setPhone(updatedClient.getPhone());
            existingClient.setCin(updatedClient.getCin());


            Vehicle existingVehicle = existingOrderService.getVehicle();
            Vehicle updatedVehicle = updatedOrderService.getVehicle();
            existingVehicle.setBrand(updatedVehicle.getBrand());
            existingVehicle.setType(updatedVehicle.getType());
            existingVehicle.setVinNumber(updatedVehicle.getVinNumber());
            existingVehicle.setRegistrationNumber(updatedVehicle.getRegistrationNumber());
            existingVehicle.setDate(updatedVehicle.getDate());


            orderServiceRepository.save(existingOrderService);


        }
        return null;


    }}
