package com.br.lemon.center.service.impl;

import com.br.lemon.center.enums.WxUser;
import com.br.lemon.center.mapper.WxUserMapper;
import com.br.lemon.center.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bairong on 2018/12/16.
 */
@Service
@Transactional
public class TestServiceImpl implements TestService{

    @Autowired
    WxUserMapper wxUserMapper;

    @Override
    public List<WxUser> test(Integer uid) {
        System.out.println("----------------------------uid = "+uid);
        return wxUserMapper.selectAll(null, null);
    }
}
