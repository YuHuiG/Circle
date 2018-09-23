package com.circle.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class INVEST_USER_MESSAGE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer iumId;

    private String iumName;

    private String iumSubhead;

    private String iumHead;

    private String iumInveststage;

    private String iumInvestmethod;

    private String iumArea;

    private String iumAppointmentarea;

    private BigDecimal iumMoney;

    private String iumBrief;

    private String iumCasetext;

    private String iumField;

    private String iumDetail;

    private Integer iumNum;

    private Integer iumSort;

    private Integer itId;
    

    public INVEST_USER_MESSAGE() {
		super();
	}

	public INVEST_USER_MESSAGE(String iumName, String iumSubhead,
			String iumHead, String iumInveststage, String iumInvestmethod,
			String iumArea, String iumAppointmentarea, BigDecimal iumMoney,
			String iumBrief, String iumCasetext, String iumField,
			String iumDetail, Integer iumNum, Integer iumSort, Integer itId) {
		super();
		this.iumName = iumName;
		this.iumSubhead = iumSubhead;
		this.iumHead = iumHead;
		this.iumInveststage = iumInveststage;
		this.iumInvestmethod = iumInvestmethod;
		this.iumArea = iumArea;
		this.iumAppointmentarea = iumAppointmentarea;
		this.iumMoney = iumMoney;
		this.iumBrief = iumBrief;
		this.iumCasetext = iumCasetext;
		this.iumField = iumField;
		this.iumDetail = iumDetail;
		this.iumNum = iumNum;
		this.iumSort = iumSort;
		this.itId = itId;
	}

	public INVEST_USER_MESSAGE(Integer iumId, String iumName,
			String iumSubhead, String iumHead, String iumInveststage,
			String iumInvestmethod, String iumArea, String iumAppointmentarea,
			BigDecimal iumMoney, String iumBrief, String iumCasetext,
			String iumField, String iumDetail, Integer iumNum, Integer iumSort,
			Integer itId) {
		super();
		this.iumId = iumId;
		this.iumName = iumName;
		this.iumSubhead = iumSubhead;
		this.iumHead = iumHead;
		this.iumInveststage = iumInveststage;
		this.iumInvestmethod = iumInvestmethod;
		this.iumArea = iumArea;
		this.iumAppointmentarea = iumAppointmentarea;
		this.iumMoney = iumMoney;
		this.iumBrief = iumBrief;
		this.iumCasetext = iumCasetext;
		this.iumField = iumField;
		this.iumDetail = iumDetail;
		this.iumNum = iumNum;
		this.iumSort = iumSort;
		this.itId = itId;
	}

	public Integer getIumId() {
        return iumId;
    }

    public void setIumId(Integer iumId) {
        this.iumId = iumId;
    }

    public String getIumName() {
        return iumName;
    }

    public void setIumName(String iumName) {
        this.iumName = iumName == null ? null : iumName.trim();
    }

    public String getIumSubhead() {
        return iumSubhead;
    }

    public void setIumSubhead(String iumSubhead) {
        this.iumSubhead = iumSubhead == null ? null : iumSubhead.trim();
    }

    public String getIumHead() {
        return iumHead;
    }

    public void setIumHead(String iumHead) {
        this.iumHead = iumHead == null ? null : iumHead.trim();
    }

    public String getIumInveststage() {
        return iumInveststage;
    }

    public void setIumInveststage(String iumInveststage) {
        this.iumInveststage = iumInveststage == null ? null : iumInveststage.trim();
    }

    public String getIumInvestmethod() {
        return iumInvestmethod;
    }

    public void setIumInvestmethod(String iumInvestmethod) {
        this.iumInvestmethod = iumInvestmethod == null ? null : iumInvestmethod.trim();
    }

    public String getIumArea() {
        return iumArea;
    }

    public void setIumArea(String iumArea) {
        this.iumArea = iumArea == null ? null : iumArea.trim();
    }

    public String getIumAppointmentarea() {
        return iumAppointmentarea;
    }

    public void setIumAppointmentarea(String iumAppointmentarea) {
        this.iumAppointmentarea = iumAppointmentarea == null ? null : iumAppointmentarea.trim();
    }

    public BigDecimal getIumMoney() {
        return iumMoney;
    }

    public void setIumMoney(BigDecimal iumMoney) {
        this.iumMoney = iumMoney;
    }

    public String getIumBrief() {
        return iumBrief;
    }

    public void setIumBrief(String iumBrief) {
        this.iumBrief = iumBrief == null ? null : iumBrief.trim();
    }

    public String getIumCasetext() {
        return iumCasetext;
    }

    public void setIumCasetext(String iumCasetext) {
        this.iumCasetext = iumCasetext == null ? null : iumCasetext.trim();
    }

    public String getIumField() {
        return iumField;
    }

    public void setIumField(String iumField) {
        this.iumField = iumField == null ? null : iumField.trim();
    }

    public String getIumDetail() {
        return iumDetail;
    }

    public void setIumDetail(String iumDetail) {
        this.iumDetail = iumDetail == null ? null : iumDetail.trim();
    }

    public Integer getIumNum() {
        return iumNum;
    }

    public void setIumNum(Integer iumNum) {
        this.iumNum = iumNum;
    }

    public Integer getIumSort() {
        return iumSort;
    }

    public void setIumSort(Integer iumSort) {
        this.iumSort = iumSort;
    }

    public Integer getItId() {
        return itId;
    }

    public void setItId(Integer itId) {
        this.itId = itId;
    }
}