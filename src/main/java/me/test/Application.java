package me.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(EmilyProperties.class)
public class Application {

    public static void main(String[] args) {
        // 스프링 부트가 제공하는 다양한 커스터마이징 기능을 사용하기 어렵다.
        //SpringApplication.run(Application.class, args);

        //인스턴스로 생성
        //SpringApplication app = new SpringApplication(Application.class);
        //app.setWebApplicationType(WebApplicationType.NONE);
        //app.run(args);

        // 빌더 생성
//        new SpringApplicationBuilder()
//                .sources(SpringApplication.class)
//                .run(args);

        // ApplicationContext 이전에 발생하는 리스너 등록
        SpringApplication app = new SpringApplication(Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

    }
}
