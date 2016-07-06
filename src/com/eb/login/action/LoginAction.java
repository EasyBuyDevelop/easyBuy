package com.eb.login.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.eb.login.service.LoginIService;
import com.opensymphony.xwork2.ActionSupport;
import com.tcm.tool.Constants;

public class LoginAction extends ActionSupport implements SessionAware,
		ServletRequestAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HttpServletRequest request;
	private Map<String, Object> session;

	private LoginIService loginIService;

	private String login_name;
	private String password;

	private List<Map<String, Object>> list;

	/**
	 * function: Chinese —— 判断一个人的登录信息是否正确 English —— To judge if one's login
	 * information is right.
	 * 
	 * @return
	 */
	public String login() {
		list = new ArrayList<Map<String,Object>>();
		
		Map map_result = new HashMap<String, Object>();
		
		try {
			System.out.println("进入login()");
			Map map_check = loginIService.infoRight(login_name, password);
			String checkResult = (String) map_check.get("checkResult");
			if (checkResult.equals(Constants._String.LOGIN_CHECK_ALLINFO_RIGHT)) {// 所有信息均正确，登录成功
				map_check.put("loginName", login_name);
				map_check.put("password", password);
				recordUser(map_check);

				map_result.put("result", SUCCESS);
				list.add(map_result);
				
				return (String) map_check.get("userTypeName");
//				return SUCCESS;
				
			} else if (checkResult
					.equals(Constants._String.LOGIN_CHECK_LOGINNAME_ERROR)) {// 用户名不存在
				
				map_result.put("result", ERROR);
				map_result.put("failedLoginCause",Constants._String.LOGIN_CHECK_LOGINNAME_ERROR);
				list.add(map_result);

				return ERROR;

			} else {// 密码错误
				map_result.put("result", ERROR);
				map_result.put("failedLoginCause",Constants._String.LOGIN_CHECK_PASSWORD_EEROR);
				list.add(map_result);

				return ERROR;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR;
		}
		
	}

	/**
	 * function : chinese —— 如果一个管理员登录成功，就将其个人信息记录在session中。 English —— if one
	 * admin login successfully , then regist it.
	 * 
	 * @param adminName
	 * @return
	 */
	public boolean recordUser(Map map) {
		session.put(Constants._String.SESSION_KEY_LOGINNAME, login_name);
		session.put(Constants._String.SESSION_KEY_PASSWORD, password);
		session.put(Constants._String.SESSION_KEY_USERTYPEID, map.get("userTypeId"));

		return true;
	}

	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public LoginIService getLoginIService() {
		return loginIService;
	}

	public void setLoginIService(LoginIService loginIService) {
		this.loginIService = loginIService;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String loginName) {
		login_name = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
