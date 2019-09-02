package example.spring.cloud.join.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class JoinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoinServerApplication.class, args);
    }

}
