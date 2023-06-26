package com.pruebatec.application.dao;
import java.util.List;  
  
  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.query.Query;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import com.pruebatec.application.entities.User;  
  
  
@Repository  
public class user_dao_impl implements user_dao {
    @Autowired  
    private SessionFactory sessionFactory;  
      
    @Override  
    public boolean saveUser(User user) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession();  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
  
    @Override  
    public List<User> getUsers() {  
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<User> query=currentSession.createQuery("from Student", User.class);  
        List<User> list=query.getResultList();  
        return list;  
    }  
  
    @Override  
    public boolean deleteUser(User user) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession();  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
  
    @Override  
    public List<User> getUserByID(User user) {  
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<User> query=currentSession.createQuery("from Users where id=:id", User.class);  
        query.setParameter("id", user.getId());  
        List<User> list=query.getResultList();  
        return list;  
    }  
  
    @Override  
    public boolean updateUser(User user) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession();  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
      
}
