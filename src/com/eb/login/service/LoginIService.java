package com.eb.login.service;

import java.util.Map;



public interface LoginIService {
	/**
	 * function �����ص�¼���ͱ��룬��return 0����ʾ��¼ʧ��
	 * @param loginName
	 * @param password
	 * @param UserTypeName
	 * @return
	 */
	public Map infoRight(String loginName,String password);
}
