package example.spring.cloud.hello.service.controller;

import example.spring.cloud.hello.service.feign.FeignClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignClientInterface feignClientInterface;

    @GetMapping("/hello/1")
    public String main(){
        //communicate with other service by ResTemplate
        String url = "http://hello-param-service/hello-param?param=Barev";
        return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("/hello/2")
    public String main1(){
        //communicate with other service by FeignClient
        return feignClientInterface.main("Hajox");
    }

    @GetMapping("/hello/1/**")
    public String main3(){
        //communicate with other service by FeignClient
        return feignClientInterface.main("Hajox");
    }
}