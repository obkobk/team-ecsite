package jp.co.internous.cony.model.domain;

import java.sql.Timestamp;


public class MstCategory {
	
	//ID
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	//カテゴリ名
	private String categoryName;
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	//カテゴリ詳細
	private String categoryDescription;
	
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	public String getCategoryDescription() {
		return categoryDescription;
	}

	//登録日時
	private Timestamp createdAt;
	
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	//更新日時
	private Timestamp updatedAt;
	
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

}
