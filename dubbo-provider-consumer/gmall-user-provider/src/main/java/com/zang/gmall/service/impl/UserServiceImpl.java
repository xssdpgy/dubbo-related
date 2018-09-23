package com.zang.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zang.gmall.bean.UserAddress;
import com.zang.gmall.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
        //模拟获取数据过程，这里为简化，自定义两个地址对象
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座9层", "1", "王老师", "010-56253825", "N");
		
		return Arrays.asList(address1, address2);
	}

}
