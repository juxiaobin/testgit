package com.mssh2.dao.impl;

import java.util.List;  

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  

import com.mssh2.dao.UserInfoDao;
import com.mssh2.entity.UserInfo;
  
/**
 * @author: Shaun
 * @date:   2017年4月28日下午4:02:08
 */
  
@Repository("userInfoDao")  
public class UserInfoDaoImpl implements UserInfoDao {  
  
    @Autowired  
    private SessionFactory sessionFactory;  
  
    private Session getCurrentSession() {  
        return this.sessionFactory.getCurrentSession();  
    }  
  
    @Override  
    public UserInfo load(Integer id) {  
        return (UserInfo) this.getCurrentSession().load(UserInfo.class, id);  
    }  
  
    @Override  
    public UserInfo get(Integer id) {  
        return (UserInfo) this.getCurrentSession().get(UserInfo.class, id);  
    }  
  
    @SuppressWarnings("unchecked")  
    @Override  
    public List<UserInfo> findAll() {  
        List<UserInfo> userInfos = this.getCurrentSession()  
                .createQuery("from UserInfo").list();  
        return userInfos;  
    }  
  
    @Override  
    public void persist(UserInfo entity) {  
        this.getCurrentSession().persist(entity);  
  
    }  
  
    @Override  
    public Integer save(UserInfo entity) {  
        return (Integer) this.getCurrentSession().save(entity);  
    }  
  
    @Override  
    public void saveOrUpdate(UserInfo entity) {  
        this.getCurrentSession().saveOrUpdate(entity);  
    }  
  
    @Override  
    public void delete(Integer id) {  
        UserInfo entity = this.load(id);  
        this.getCurrentSession().delete(entity);  
    }  
  
    @Override  
    public void flush() {  
        this.getCurrentSession().flush();  
  
    }  
  
}  