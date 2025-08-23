package com.demo.webapp.controller;


import com.demo.webapp.data.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import com.demo.webapp.service.SampleService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sample" )
public class SampleController {

    private final SampleService service;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/health")
    public Mono<String> getHealth (){
        return service.getHealthStatus();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/user-info")
    public Mono<UserInfo> getUserInfo (){
        return service.ListUserInfo();
    }
}
