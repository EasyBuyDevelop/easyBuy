package com.eb.login.service;

import java.util.Map;



public interface LoginIService {
	/**
	 * function ：返回登录类型编码，若return 0，表示登录失败
	 * @param loginName
	 * @param password
	 * @param UserTypeName
	 * @return
	 */
	public Map infoRight(String loginName,String password);
}
