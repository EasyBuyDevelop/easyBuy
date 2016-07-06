package sdkd.com.eb.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Commonuser entity. @author MyEclipse Persistence Tools
 */

public class Commonuser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private User user;
	private Sex sex;
	private Integer userTypeId;
	private String loginName;
	private String userTel;
	private String userAdd;
	private String password;
	private String idcard;
	private Timestamp bornDay;
	private String email;
	private String vipuserName;
	private Set orderforms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Commonuser() {
	}

	/** minimal constructor */
	public Commonuser(User user, Sex sex) {
		this.user = user;
		this.sex = sex;
	}

	/** full constructor */
	public Commonuser(User user, Sex sex, Integer userTypeId, String loginName,
			String userTel, String userAdd, String password, String idcard,
			Timestamp bornDay, String email, String vipuserName, Set orderforms) {
		this.user = user;
		this.sex = sex;
		this.userTypeId = userTypeId;
		this.loginName = loginName;
		this.userTel = userTel;
		this.userAdd = userAdd;
		this.password = password;
		this.idcard = idcard;
		this.bornDay = bornDay;
		this.email = email;
		this.vipuserName = vipuserName;
		this.orderforms = orderforms;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Sex getSex() {
		return this.sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Integer getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
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

	public String getVipuserName() {
		return this.vipuserName;
	}

	public void setVipuserName(String vipuserName) {
		this.vipuserName = vipuserName;
	}

	public Set getOrderforms() {
		return this.orderforms;
	}

	public void setOrderforms(Set orderforms) {
		this.orderforms = orderforms;
	}

}