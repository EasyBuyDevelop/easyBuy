package sdkd.com.eb.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Orderstate entity. @author MyEclipse Persistence Tools
 */

public class Orderstate implements java.io.Serializable {

	// Fields

	private Integer stateId;
	private String stateName;
	private Set orderforms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderstate() {
	}

	/** full constructor */
	public Orderstate(String stateName, Set orderforms) {
		this.stateName = stateName;
		this.orderforms = orderforms;
	}

	// Property accessors

	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Set getOrderforms() {
		return this.orderforms;
	}

	public void setOrderforms(Set orderforms) {
		this.orderforms = orderforms;
	}

}