package com.quectel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 首页
 * @Author: Maxton.Zhang
 * @Date: 2021/7/22 14:04
 * @Version 1.0
 */
@Controller
public class IndexController {
    @GetMapping({"/", "/index"})
    public String index() throws Exception {
        return "index";
    }
}
