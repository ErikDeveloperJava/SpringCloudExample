package example.spring.cloud.hello.param.service.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @HystrixCommand(fallbackMethod = "failedMethod")
    @GetMapping("/hello-param")
    public String main(@RequestParam("param")String param){
        return "hello " + param;
    }

    //it will be invoked when will happen exception
    private String failedMethod(String param){
        return "please sorry error happened in the server you should try a little later";
    }
}