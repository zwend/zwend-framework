/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zwend.baseapp.config;

import com.zwend.baseapp.bo.ProductBoImpl;
import com.zwend.baseapp.dao.ProductDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Lenovo
 */
@Configuration
public class ProductConfig {

    @Bean
    public ProductBoImpl productBo() {
        return new ProductBoImpl();
    }

    @Bean
    public ProductDaoImpl productDao() {
        return new ProductDaoImpl();
    }

}
