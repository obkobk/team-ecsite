package jp.co.internous.cony.model.domain;

import java.sql.Timestamp;

//商品情報
public class MstProduct {

	//ID
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	//商品名
	private String productName;
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	//商品名かな
	private String productNameKana;
	
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	
	//商品詳細
	private String productDescription;
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	//カテゴリID
	private int categoryId;
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	
	// 価格
	private int price;
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	//画像フルパス
	private String imageFullPath;
	
	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}
	public String getImageFullPath() {
		return imageFullPath;
	}
	
	//発売年月日
	private String releaseDate;
	
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	//発売会社
	private String releaseCompany;
	
	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
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
