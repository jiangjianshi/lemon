package com.br.lemon.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangjianshi on 18/12/6.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public String get(@PathVariable("id") Long id) {

        return "hello:"+ id;
    }
}
