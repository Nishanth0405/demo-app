package com.demo.webapp.repository;

import com.demo.webapp.data.UserInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepo  extends ReactiveMongoRepository<UserInfo,String > {
}
