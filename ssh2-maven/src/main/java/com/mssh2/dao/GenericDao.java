package com.mssh2.dao;

import java.io.Serializable;  
import java.util.List;  

  /**
   * @author: Shaun
   * @date:   2017年4月28日下午4:02:39 
   * @param <T>
   * @param <PK>
   * Dao通用接口 
   */
interface GenericDao<T, PK extends Serializable> {  
      
    T load(PK id);  
      
    T get(PK id);  
      
    List<T> findAll();  
      
    void persist(T entity);  
      
    PK save(T entity);  
      
    void saveOrUpdate(T entity);  
      
    void delete(PK id);  
      
    void flush();  
}  