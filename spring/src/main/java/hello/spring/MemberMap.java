package hello.spring;
import hello.spring.member.*;

public class MemberMap {
    public static void main(String[] args) {
        AppConfig appConfig= new AppConfig();

        MemberService memberService=appConfig.memberService();
        Member member =new Member(1L,"memberA",Grade.VIP);
        memberService.join(member);
        Member findmember=memberService.findMember(1L);

        System.out.println("member");
        System.out.println(member.getName());
        System.out.println("findmember");

    }
}

