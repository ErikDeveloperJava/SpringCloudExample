package example.spring.cloud.hello.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("hello-param-service")
public interface FeignClientInterface {

    @GetMapping("/hello-param")
    String main(@RequestParam("param")String param);
}