package com.br.lemon.center.mapper;

import com.br.lemon.center.enums.WxUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by jiangjianshi on 18/10/29.
 */
@Repository
public interface WxUserMapper {

    List<WxUser> selectAll(@Param("mobile") String phone, @Param("nickName") String nickName);
}
