package com.br.lemon.api.service;

import com.br.lemon.api.bo.WxUser;
import com.google.common.collect.Lists;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<WxUserServiceApi>
{

	@Override
	public WxUserServiceApi create(Throwable throwable) {

		return new WxUserServiceApi(){

			@Override
			public List<WxUser> get() {
				return new ArrayList<>();
			}
		};
	}
}
