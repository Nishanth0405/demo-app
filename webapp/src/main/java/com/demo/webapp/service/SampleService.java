package com.demo.webapp.service;


import com.demo.webapp.data.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import com.demo.webapp.repository.UserInfoRepo;

@Service
@RequiredArgsConstructor
public class SampleService {


    private final UserInfoRepo userRepo;


    public Mono<String> getHealthStatus(){
        return Mono.just("Success");

    }

    public Mono<UserInfo> ListUserInfo(){
        return userRepo.findAll().next();
    }
}
