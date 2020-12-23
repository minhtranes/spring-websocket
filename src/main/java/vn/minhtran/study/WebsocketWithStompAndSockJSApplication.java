package vn.minhtran.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "vn.minhtran.study.stomp")
public class WebsocketWithStompAndSockJSApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketWithStompAndSockJSApplication.class, args);
    }
}
