/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zwend.baseapp.bo;

import com.zwend.baseapp.model.Product;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface ProductBo {
    public List<Product> findAllProduct();
}
