package service;
import org.springframework.stereotype.Service;
import repository.OrderRepository;
import javax.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService{
    public final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    @Transactional
    public OrderService addOrder(OrderService order){
        order = orderRepository.save(order);

        return order;
    }
}
