package com.br.lemon.web;

import com.br.lemon.api.bo.WxUser;
import com.br.lemon.api.service.WxUserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jiangjianshi on 18/12/6.
 */
@RestController
public class TestController {

    @Autowired
    private WxUserServiceApi wxUserServiceApi;

    @RequestMapping(value = "/consumer/test/get")
    public String get() {

        List<WxUser> list = wxUserServiceApi.get();
        return "hello:" + list.toString();
    }
}
