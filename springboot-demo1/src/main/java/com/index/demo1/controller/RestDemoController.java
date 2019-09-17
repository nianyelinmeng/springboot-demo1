package com.index.demo1.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/rest")
public class RestDemoController {

    @RequestMapping(method = RequestMethod.GET, path = "/demo1")
//    @GetMapping(path = "/demo1")
    public String demo1() {
        return "Hello World";
    }

    @GetMapping(path = "/demo2/{name}")
    public String demo2(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping(path = "/demo3")
    public String demo3(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping(path = "demo4")
    public String demo4(@RequestBody String name) {
        return "Hello " + name;
    }

    @PostMapping(path = "demo5")
    public String demo5(@RequestParam String name) {
        return "Hello " + name;
    }
}
