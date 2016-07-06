package sdkd.com.eb.model;

import java.sql.Timestamp;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer newsId;
	private Admin admin;
	private String newsTitle;
	private String newsContent;
	private Timestamp newsCreateTime;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(Admin admin, String newsTitle, String newsContent,
			Timestamp newsCreateTime) {
		this.admin = admin;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.newsCreateTime = newsCreateTime;
	}

	// Property accessors

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsContent() {
		return this.newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public Timestamp getNewsCreateTime() {
		return this.newsCreateTime;
	}

	public void setNewsCreateTime(Timestamp newsCreateTime) {
		this.newsCreateTime = newsCreateTime;
	}

}