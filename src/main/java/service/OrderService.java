package service;
import javax.transaction.Transactional;

public interface OrderService {
    @Transactional
    OrderService addOrder(OrderService order);
}
