package sdkd.com.eb.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Sex entity. @author MyEclipse Persistence Tools
 */

public class Sex implements java.io.Serializable {

	// Fields

	private Integer sexId;
	private String sexName;
	private Set admins = new HashSet(0);
	private Set commonusers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sex() {
	}

	/** full constructor */
	public Sex(String sexName, Set admins, Set commonusers) {
		this.sexName = sexName;
		this.admins = admins;
		this.commonusers = commonusers;
	}

	// Property accessors

	public Integer getSexId() {
		return this.sexId;
	}

	public void setSexId(Integer sexId) {
		this.sexId = sexId;
	}

	public String getSexName() {
		return this.sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public Set getAdmins() {
		return this.admins;
	}

	public void setAdmins(Set admins) {
		this.admins = admins;
	}

	public Set getCommonusers() {
		return this.commonusers;
	}

	public void setCommonusers(Set commonusers) {
		this.commonusers = commonusers;
	}

}