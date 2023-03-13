package hello.spring.scan;

import hello.spring.AppConfig;
import hello.spring.AutoAppConfig;
import hello.spring.member.MemberRepository;
import hello.spring.member.MemberService;
import hello.spring.order.OrderService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AutoAppConfigTest {

    @Test
    void basicScan(){
        ApplicationContext ac =new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);

        //Assertions.assertThat(memberService).isInstanceOf(MemberService.class);

    }
}
