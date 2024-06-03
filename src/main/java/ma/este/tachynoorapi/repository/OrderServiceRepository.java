package ma.este.tachynoorapi.repository;


import ma.este.tachynoorapi.entities.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderServiceRepository  extends JpaRepository<OrderService,Long> {
    Optional<OrderService> findByOrderNumber(int orderNumber);
}
