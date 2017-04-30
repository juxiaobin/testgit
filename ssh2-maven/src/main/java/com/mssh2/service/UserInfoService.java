package com.mssh2.service;

import java.util.List;  

import com.mssh2.entity.UserInfo;

  
/**
 * @author: Shaun
 * @date:   2017年4月28日下午4:04:06
 */
  
public interface UserInfoService {  
    UserInfo load(Integer id);  
  
    UserInfo get(Integer id);  
  
    List<UserInfo> findAll();  
  
    void persist(UserInfo entity);  
  
    Integer save(UserInfo entity);  
  
    void saveOrUpdate(UserInfo entity);  
  
    void delete(Integer id);  
  
    void flush();  
}  
