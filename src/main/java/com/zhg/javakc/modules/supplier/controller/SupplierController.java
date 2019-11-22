package com.zhg.javakc.modules.supplier.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.supplier.service.SupplierService;
import com.zhg.javakc.modules.test.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author an
 * @version v0.0.1
 * @date 2019/11/21 20:31
 */

@Controller
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @RequestMapping("/query")
    public ModelAndView queryTest()
    {
        ModelAndView modelAndView = new ModelAndView("supplier/list");
        return modelAndView;
    }


    @RequestMapping("/create")
    public ModelAndView save()
    {
        ModelAndView modelAndView = new ModelAndView("supplier/create");
        return modelAndView;
    }
}
