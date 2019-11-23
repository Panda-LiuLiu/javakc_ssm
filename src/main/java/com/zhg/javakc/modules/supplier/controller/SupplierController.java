package com.zhg.javakc.modules.supplier.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.supplier.entity.SupplierEntity;
import com.zhg.javakc.modules.supplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author LiuLiu
 * @version v0.0.1
 * @date 2019/11/22 17:11
 */
// ##push测试
@Controller
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @RequestMapping("/querySupplier")
    public ModelAndView querySuppelier(SupplierEntity supplierEntity, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("supplier/list");
        Page<SupplierEntity> page = supplierService.querySupplier(supplierEntity,new Page<SupplierEntity>(request,response));
        modelAndView.addObject("page",page);
        return modelAndView;
    }

}
