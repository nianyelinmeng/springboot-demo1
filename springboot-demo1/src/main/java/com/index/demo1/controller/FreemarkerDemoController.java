package com.index.demo1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qingsheng.chen@hand-china.com
 *
 */
@Controller
@RequestMapping("/freemarker")
public class FreemarkerDemoController {

    @GetMapping("/demo01.html")
    public String demo01(Model model, @RequestParam String content) {
        model.addAttribute("content", content);
        return "demo01";
    }
}
