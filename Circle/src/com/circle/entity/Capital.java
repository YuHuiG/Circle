package com.circle.entity;

import java.io.Serializable;

public class Capital implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer capId;

	private String capTitle;

	private Integer capWayId;

	private Integer capTypeId;

	private Integer capAreaId;

	private Integer capTradeId;

	private Integer capDistrictId;

	private String capImg;

	private Integer capMoneyId;

	private String funtbody;

	private String risk;

	private String product;

	private Double unfrontCharge;

	private String provideMaterial;

	private String capitalStage;

	private String investmentType;

	private String linkman;

	private String conInformation;

	private String ul;

	private String tzyqgs;

	private String tzal;

	private String fbdate;

	private String ll;

	private Integer descId;

	public Capital() {
		super();
	}

	public Capital(String capTitle, Integer capWayId, Integer capTypeId,
			Integer capAreaId, Integer capTradeId, Integer capDistrictId,
			String capImg, Integer capMoneyId, String funtbody, String risk,
			String product, Double unfrontCharge, String provideMaterial,
			String capitalStage, String investmentType, String linkman,
			String conInformation, String ul, String tzyqgs, String tzal,
			String fbdate, String ll, Integer descId) {
		super();
		this.capTitle = capTitle;
		this.capWayId = capWayId;
		this.capTypeId = capTypeId;
		this.capAreaId = capAreaId;
		this.capTradeId = capTradeId;
		this.capDistrictId = capDistrictId;
		this.capImg = capImg;
		this.capMoneyId = capMoneyId;
		this.funtbody = funtbody;
		this.risk = risk;
		this.product = product;
		this.unfrontCharge = unfrontCharge;
		this.provideMaterial = provideMaterial;
		this.capitalStage = capitalStage;
		this.investmentType = investmentType;
		this.linkman = linkman;
		this.conInformation = conInformation;
		this.ul = ul;
		this.tzyqgs = tzyqgs;
		this.tzal = tzal;
		this.fbdate = fbdate;
		this.ll = ll;
		this.descId = descId;
	}

	public Capital(Integer capId, String capTitle, Integer capWayId,
			Integer capTypeId, Integer capAreaId, Integer capTradeId,
			Integer capDistrictId, String capImg, Integer capMoneyId,
			String funtbody, String risk, String product, Double unfrontCharge,
			String provideMaterial, String capitalStage, String investmentType,
			String linkman, String conInformation, String ul, String tzyqgs,
			String tzal, String fbdate, String ll, Integer descId) {
		super();
		this.capId = capId;
		this.capTitle = capTitle;
		this.capWayId = capWayId;
		this.capTypeId = capTypeId;
		this.capAreaId = capAreaId;
		this.capTradeId = capTradeId;
		this.capDistrictId = capDistrictId;
		this.capImg = capImg;
		this.capMoneyId = capMoneyId;
		this.funtbody = funtbody;
		this.risk = risk;
		this.product = product;
		this.unfrontCharge = unfrontCharge;
		this.provideMaterial = provideMaterial;
		this.capitalStage = capitalStage;
		this.investmentType = investmentType;
		this.linkman = linkman;
		this.conInformation = conInformation;
		this.ul = ul;
		this.tzyqgs = tzyqgs;
		this.tzal = tzal;
		this.fbdate = fbdate;
		this.ll = ll;
		this.descId = descId;
	}

	@Override
	public String toString() {
		return "Capital [capId=" + capId + ", capTitle=" + capTitle
				+ ", capWayId=" + capWayId + ", capTypeId=" + capTypeId
				+ ", capAreaId=" + capAreaId + ", capTradeId=" + capTradeId
				+ ", capDistrictId=" + capDistrictId + ", capImg=" + capImg
				+ ", capMoneyId=" + capMoneyId + ", funtbody=" + funtbody
				+ ", risk=" + risk + ", product=" + product
				+ ", unfrontCharge=" + unfrontCharge + ", provideMaterial="
				+ provideMaterial + ", capitalStage=" + capitalStage
				+ ", investmentType=" + investmentType + ", linkman=" + linkman
				+ ", conInformation=" + conInformation + ", ul=" + ul
				+ ", tzyqgs=" + tzyqgs + ", tzal=" + tzal + ", fbdate="
				+ fbdate + ", ll=" + ll + ", descId=" + descId + "]";
	}

	public Integer getCapId() {
		return capId;
	}

	public void setCapId(Integer capId) {
		this.capId = capId;
	}

	public String getCapTitle() {
		return capTitle;
	}

	public void setCapTitle(String capTitle) {
		this.capTitle = capTitle == null ? null : capTitle.trim();
	}

	public Integer getCapWayId() {
		return capWayId;
	}

	public void setCapWayId(Integer capWayId) {
		this.capWayId = capWayId;
	}

	public Integer getCapTypeId() {
		return capTypeId;
	}

	public void setCapTypeId(Integer capTypeId) {
		this.capTypeId = capTypeId;
	}

	public Integer getCapAreaId() {
		return capAreaId;
	}

	public void setCapAreaId(Integer capAreaId) {
		this.capAreaId = capAreaId;
	}

	public Integer getCapTradeId() {
		return capTradeId;
	}

	public void setCapTradeId(Integer capTradeId) {
		this.capTradeId = capTradeId;
	}

	public Integer getCapDistrictId() {
		return capDistrictId;
	}

	public void setCapDistrictId(Integer capDistrictId) {
		this.capDistrictId = capDistrictId;
	}

	public String getCapImg() {
		return capImg;
	}

	public void setCapImg(String capImg) {
		this.capImg = capImg == null ? null : capImg.trim();
	}

	public Integer getCapMoneyId() {
		return capMoneyId;
	}

	public void setCapMoneyId(Integer capMoneyId) {
		this.capMoneyId = capMoneyId;
	}

	public String getFuntbody() {
		return funtbody;
	}

	public void setFuntbody(String funtbody) {
		this.funtbody = funtbody == null ? null : funtbody.trim();
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk == null ? null : risk.trim();
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product == null ? null : product.trim();
	}

	public Double getUnfrontCharge() {
		return unfrontCharge;
	}

	public void setUnfrontCharge(Double unfrontCharge) {
		this.unfrontCharge = unfrontCharge;
	}

	public String getProvideMaterial() {
		return provideMaterial;
	}

	public void setProvideMaterial(String provideMaterial) {
		this.provideMaterial = provideMaterial == null ? null : provideMaterial
				.trim();
	}

	public String getCapitalStage() {
		return capitalStage;
	}

	public void setCapitalStage(String capitalStage) {
		this.capitalStage = capitalStage == null ? null : capitalStage.trim();
	}

	public String getInvestmentType() {
		return investmentType;
	}

	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType == null ? null : investmentType
				.trim();
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman == null ? null : linkman.trim();
	}

	public String getConInformation() {
		return conInformation;
	}

	public void setConInformation(String conInformation) {
		this.conInformation = conInformation == null ? null : conInformation
				.trim();
	}

	public String getUl() {
		return ul;
	}

	public void setUl(String ul) {
		this.ul = ul == null ? null : ul.trim();
	}

	public String getTzyqgs() {
		return tzyqgs;
	}

	public void setTzyqgs(String tzyqgs) {
		this.tzyqgs = tzyqgs == null ? null : tzyqgs.trim();
	}

	public String getTzal() {
		return tzal;
	}

	public void setTzal(String tzal) {
		this.tzal = tzal == null ? null : tzal.trim();
	}

	public String getFbdate() {
		return fbdate;
	}

	public void setFbdate(String fbdate) {
		this.fbdate = fbdate == null ? null : fbdate.trim();
	}

	public String getLl() {
		return ll;
	}

	public void setLl(String ll) {
		this.ll = ll == null ? null : ll.trim();
	}

	public Integer getDescId() {
		return descId;
	}

	public void setDescId(Integer descId) {
		this.descId = descId;
	}
}