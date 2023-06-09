package hello.spring;

import hello.spring.discount.DiscountPolicy;
import hello.spring.discount.FixDiscountPolicy;
import hello.spring.member.MemberRepository;
import hello.spring.member.MemberService;
import hello.spring.member.MemoryMemberRepository;
import hello.spring.member.memberServiceImpl;
import hello.spring.order.OrderService;
import hello.spring.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new memberServiceImpl(new MemoryMemberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
