/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zwend.baseapp.bo;

import com.zwend.baseapp.dao.ProductDao;
import com.zwend.baseapp.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service("productBo")
public class ProductBoImpl implements ProductBo {

    @Autowired
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> findAllProduct() {
        return productDao.findAllProduct();
    }

}
