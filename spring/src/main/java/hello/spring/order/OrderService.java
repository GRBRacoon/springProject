package hello.spring.order;

import org.springframework.beans.factory.annotation.Autowired;

public interface OrderService {

    Order createOrder (Long memberId,String itemName, int itemPrice);
}
