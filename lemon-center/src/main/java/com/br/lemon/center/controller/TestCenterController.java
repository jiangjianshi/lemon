package com.br.lemon.center.controller;

import com.br.lemon.center.enums.WxUser;
import com.br.lemon.center.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bairong on 2018/12/16.
 */

@RestController
@RequestMapping("/test")
public class TestCenterController {

    @Autowired
    private TestService testService;

    @RequestMapping("/get")
    public List<WxUser> test(){

        return testService.test(1);
    }
}
