package sdkd.com.eb.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Orderform entity. @author MyEclipse Persistence Tools
 */

public class Orderform implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Commonuser commonuser;
	private Orderstate orderstate;
	private Paymethod paymethod;
	private String orderReceiverName;
	private String orderReceiverAdd;
	private Timestamp orderCreatTime;
	private Float orderMoney;
	private Set orderdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orderform() {
	}

	/** full constructor */
	public Orderform(Commonuser commonuser, Orderstate orderstate,
			Paymethod paymethod, String orderReceiverName,
			String orderReceiverAdd, Timestamp orderCreatTime,
			Float orderMoney, Set orderdetails) {
		this.commonuser = commonuser;
		this.orderstate = orderstate;
		this.paymethod = paymethod;
		this.orderReceiverName = orderReceiverName;
		this.orderReceiverAdd = orderReceiverAdd;
		this.orderCreatTime = orderCreatTime;
		this.orderMoney = orderMoney;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Commonuser getCommonuser() {
		return this.commonuser;
	}

	public void setCommonuser(Commonuser commonuser) {
		this.commonuser = commonuser;
	}

	public Orderstate getOrderstate() {
		return this.orderstate;
	}

	public void setOrderstate(Orderstate orderstate) {
		this.orderstate = orderstate;
	}

	public Paymethod getPaymethod() {
		return this.paymethod;
	}

	public void setPaymethod(Paymethod paymethod) {
		this.paymethod = paymethod;
	}

	public String getOrderReceiverName() {
		return this.orderReceiverName;
	}

	public void setOrderReceiverName(String orderReceiverName) {
		this.orderReceiverName = orderReceiverName;
	}

	public String getOrderReceiverAdd() {
		return this.orderReceiverAdd;
	}

	public void setOrderReceiverAdd(String orderReceiverAdd) {
		this.orderReceiverAdd = orderReceiverAdd;
	}

	public Timestamp getOrderCreatTime() {
		return this.orderCreatTime;
	}

	public void setOrderCreatTime(Timestamp orderCreatTime) {
		this.orderCreatTime = orderCreatTime;
	}

	public Float getOrderMoney() {
		return this.orderMoney;
	}

	public void setOrderMoney(Float orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

}