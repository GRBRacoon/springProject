package hello.spring.discount;

import hello.spring.member.Grade;
import hello.spring.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy {
    private int discountRate=10;


    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP)
        {
            return  price*discountRate/100;
        }
        else{return 0;}
    }
}
