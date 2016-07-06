package sdkd.com.eb.model;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private Usertype usertype;
	private String loginName;
	private String userTel;
	private String userAdd;
	private String password;
	private String idcard;
	private Timestamp bornDay;
	private String email;
	private Commonuser commonuser;
	private Admin admin;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Usertype usertype, String loginName, String userTel,
			String userAdd, String password, String idcard, Timestamp bornDay,
			String email, Commonuser commonuser, Admin admin) {
		this.usertype = usertype;
		this.loginName = loginName;
		this.userTel = userTel;
		this.userAdd = userAdd;
		this.password = password;
		this.idcard = idcard;
		this.bornDay = bornDay;
		this.email = email;
		this.commonuser = commonuser;
		this.admin = admin;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Usertype getUsertype() {
		return this.usertype;
	}

	public void setUsertype(Usertype usertype) {
		this.usertype = usertype;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserTel() {
		return this.userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAdd() {
		return this.userAdd;
	}

	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Timestamp getBornDay() {
		return this.bornDay;
	}

	public void setBornDay(Timestamp bornDay) {
		this.bornDay = bornDay;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Commonuser getCommonuser() {
		return this.commonuser;
	}

	public void setCommonuser(Commonuser commonuser) {
		this.commonuser = commonuser;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}