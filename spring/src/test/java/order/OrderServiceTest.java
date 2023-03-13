package order;

import hello.spring.AppConfig;
import hello.spring.member.Grade;
import hello.spring.member.Member;
import hello.spring.member.MemberService;
import hello.spring.member.memberServiceImpl;
import hello.spring.order.Order;
import hello.spring.order.OrderService;
import hello.spring.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    AppConfig appConfig= new AppConfig();
    MemberService memberService= appConfig.memberService() ;
    OrderService orderService= appConfig.orderService();

    @Test
    void createOrder(){
        Long memberId=1L;
        Member member=new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);


        Order order= orderService.createOrder(memberId,"itemA",10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}
