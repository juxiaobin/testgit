package com.mssh2.service;


import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  

import com.alibaba.fastjson.JSON;  
import com.mssh2.entity.UserInfo;
  
/**
 * @author: Shaun
 * @date:   2017年4月28日下午3:57:58
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-hibernate.xml" })  
public class TestUserService {  
  
    private static final Logger LOGGER = Logger  
            .getLogger(TestUserService.class);  
  
    @Autowired  
    private UserInfoService userInfoService;  
  
    @Test  
    public void save() {  
        UserInfo userInfo = new UserInfo();  
        userInfo.setName("zty");  
        userInfo.setAge(23);  
        userInfo.setTelephone("13212221333");  
        Integer id = userInfoService.save(userInfo);  
        JSON.toJSONString(id);  
    }  
  
}  
