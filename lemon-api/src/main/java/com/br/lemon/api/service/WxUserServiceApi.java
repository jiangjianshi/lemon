package com.br.lemon.api.service;

import com.br.lemon.api.bo.WxUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by bairong on 2018/12/16.
 */
@FeignClient(value = "SPRINGCLOUD-LEMON",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface WxUserServiceApi {

    @RequestMapping(value = "/test/get", method = RequestMethod.GET)
    List<WxUser> get();
}
