package hello.spring.beanFind;

import hello.spring.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String[] beanDefinitionNames= ac.getBeanDefinitionNames();
        //배열있을때 iter하고 탭 누르면 자동으로 for문 생성
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean= ac.getBean(beanDefinitionName);
            System.out.println("name"+beanDefinitionName+"bean = "+bean);

        }

    }

}
