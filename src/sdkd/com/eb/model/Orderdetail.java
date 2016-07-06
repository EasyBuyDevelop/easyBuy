package sdkd.com.eb.model;

/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */

public class Orderdetail implements java.io.Serializable {

	// Fields

	private Integer detailId;
	private Orderform orderform;
	private Integer productId;
	private Integer orderNum;

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** full constructor */
	public Orderdetail(Orderform orderform, Integer productId, Integer orderNum) {
		this.orderform = orderform;
		this.productId = productId;
		this.orderNum = orderNum;
	}

	// Property accessors

	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public Orderform getOrderform() {
		return this.orderform;
	}

	public void setOrderform(Orderform orderform) {
		this.orderform = orderform;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

}