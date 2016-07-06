package sdkd.com.eb.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Usertype entity. @author MyEclipse Persistence Tools
 */

public class Usertype implements java.io.Serializable {

	// Fields

	private Integer userTypeId;
	private String userTypeName;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Usertype() {
	}

	/** full constructor */
	public Usertype(String userTypeName, Set users) {
		this.userTypeName = userTypeName;
		this.users = users;
	}

	// Property accessors

	public Integer getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserTypeName() {
		return this.userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}