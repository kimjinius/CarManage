package org.tukorea.myweb.domain;

public class SaleVO {

	private Integer saleId;
	private Integer saleCarId;
	private String saleCarModel;
	private String saleMemberMobile;
	private String saleMemberName;
	private String saleCarNumber;
	
	public SaleVO(Integer saleCarId, String saleCarModel, String saleMemberMobile, String saleMemberName) {
		this.saleCarId = saleCarId;
		this.saleCarModel = saleCarModel;
		this.saleMemberMobile = saleMemberMobile;
		this.saleMemberName = saleMemberName;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getSaleCarId() {
		return saleCarId;
	}

	public void setSaleCarId(Integer saleCarId) {
		this.saleCarId = saleCarId;
	}

	public String getSaleCarModel() {
		return saleCarModel;
	}

	public void setSaleCarModel(String saleCarModel) {
		this.saleCarModel = saleCarModel;
	}

	public String getSaleMemberMobile() {
		return saleMemberMobile;
	}

	public void setSaleMemberMobile(String saleMemberMobile) {
		this.saleMemberMobile = saleMemberMobile;
	}

	public String getSaleMemberName() {
		return saleMemberName;
	}

	public void setSaleMemberName(String saleMemberName) {
		this.saleMemberName = saleMemberName;
	}

	public String getSaleCarNumber() {
		return saleCarNumber;
	}

	public void setSaleCarNumber(String saleCarNumber) {
		this.saleCarNumber = saleCarNumber;
	}

	@Override
	public String toString() {
		return "SaleVO [saleId=" + saleId + ", saleCarId=" + saleCarId + ", saleCarModel=" + saleCarModel
				+ ", saleMemberMobile=" + saleMemberMobile + ", saleMemberName=" + saleMemberName + ", saleCarNumber="
				+ saleCarNumber + "]";
	}


	


}
