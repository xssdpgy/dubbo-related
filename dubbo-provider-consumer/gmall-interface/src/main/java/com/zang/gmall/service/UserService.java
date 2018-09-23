package com.zang.gmall.service;

import java.util.List;

import com.zang.gmall.bean.UserAddress;

public interface UserService {
	//按照用户id返回所有的收货地址
	public List<UserAddress> getUserAddressList(String userId);
}
