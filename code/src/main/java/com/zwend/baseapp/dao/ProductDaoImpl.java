/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zwend.baseapp.dao;

import com.zwend.baseapp.model.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Product> findAllProduct() {
        return getCurrentSession().createCriteria(Product.class).list();
    }
}
