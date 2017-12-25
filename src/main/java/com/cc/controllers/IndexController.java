package com.cc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CC on 2017/12/24.
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "index"})
    public String getIndex() {
        return "index";
    }
}

