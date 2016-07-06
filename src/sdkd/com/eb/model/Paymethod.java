package sdkd.com.eb.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Paymethod entity. @author MyEclipse Persistence Tools
 */

public class Paymethod implements java.io.Serializable {

	// Fields

	private Integer payId;
	private String payName;
	private Set orderforms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Paymethod() {
	}

	/** full constructor */
	public Paymethod(String payName, Set orderforms) {
		this.payName = payName;
		this.orderforms = orderforms;
	}

	// Property accessors

	public Integer getPayId() {
		return this.payId;
	}

	public void setPayId(Integer payId) {
		this.payId = payId;
	}

	public String getPayName() {
		return this.payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public Set getOrderforms() {
		return this.orderforms;
	}

	public void setOrderforms(Set orderforms) {
		this.orderforms = orderforms;
	}

}