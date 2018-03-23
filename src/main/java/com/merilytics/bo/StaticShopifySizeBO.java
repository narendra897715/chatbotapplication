package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tbl_static_shopifysize")
public class StaticShopifySizeBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "native")
	@GeneratedValue(generator = "gen")
	private Integer pkshopifySizeID;

	private Integer pkSizeID;

	private String shopifySize;

	private Boolean status;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getPkSizeID() {
		return pkSizeID;
	}

	public void setPkSizeID(Integer pkSizeID) {
		this.pkSizeID = pkSizeID;
	}

	public Integer getPkshopifySizeID() {
		return pkshopifySizeID;
	}

	public void setPkshopifySizeID(Integer pkshopifySizeID) {
		this.pkshopifySizeID = pkshopifySizeID;
	}

	public String getShopifySize() {
		return shopifySize;
	}

	public void setShopifySize(String shopifySize) {
		this.shopifySize = shopifySize;
	}

}
