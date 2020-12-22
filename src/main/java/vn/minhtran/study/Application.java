package vn.minhtran.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Test WebSocket configuration
//@ComponentScan(basePackages = "vn.minhtran.study.websocket")
// Test SockJS configuration
//@ComponentScan(basePackages = "vn.minhtran.study.sockjs")
//Test Stomp configuration
@ComponentScan(basePackages = "vn.minhtran.study.stomp")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
