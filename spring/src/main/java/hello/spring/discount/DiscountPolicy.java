package hello.spring.discount;

import hello.spring.member.Member;

public interface DiscountPolicy {

    /*
    *@return 이 할인이 될 금액.
     */
    int discount(Member member, int price);
}
