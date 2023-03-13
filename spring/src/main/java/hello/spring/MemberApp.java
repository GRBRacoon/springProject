package hello.spring;

import hello.spring.member.Grade;
import hello.spring.member.Member;
import hello.spring.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
        //ApplicationContext로 모든 스프링은 시작
        //Annotation을 사용해서 annotation
        //config에 정보가 있으므로 파라미터에 Appconfig
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);




        Member member= new Member(1L,"memberA", Grade.VIP);




    }
}
