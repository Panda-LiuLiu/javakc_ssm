package com.zhg.javakc.modules.purchase.controller;

/**
 * @author an
 * @version v0.0.1
 * @date 2019/11/22 20:12
 */

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.modules.purchase.service.PurchaseService;
import com.zhg.javakc.modules.test.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 采购价表现层
 */

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @RequestMapping("/query")
    public ModelAndView queryTest(TestEntity testEntity, HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView modelAndView = new ModelAndView("purchase/list");

        return modelAndView;
    }

}
