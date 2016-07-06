package com.eb.login.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sdkd.com.eb.model.User;
import sdkd.com.eb.model.UserDAO;

import com.tcm.tool.Constants;



public class LoginService implements LoginIService {
	UserDAO userDAO;

	public Map infoRight(String loginName, String password) {
		Map map_result = new HashMap<String, Object>();
		
		List user_list = null;
		user_list = userDAO.findByLoginName(loginName);
		/*用户名不存在*/
		if(user_list == null){
			map_result.put("checkResult", Constants._String.LOGIN_CHECK_LOGINNAME_ERROR);
			return map_result;
		}
		
		User user = null;
		user = (User) user_list.get(0);
		/*密码错误*/
		if(!user.getPassword().equals(password)){
			map_result.put("checkResult", Constants._String.LOGIN_CHECK_PASSWORD_EEROR);
			return map_result;
		}
		
		/*所有信息均正确*/
		map_result.put("checkResult", Constants._String.LOGIN_CHECK_ALLINFO_RIGHT);
		map_result.put("userTypeName", user.getUsertype().getUserTypeName());
		
		return map_result;
		// TODO Auto-generated method stub
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
