package com.circle.entity;

import java.io.Serializable;

public class PROJECT_MESSAGE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pmId;

    private Integer pmSort;

    private String pmJob;

    private String pmAddress;

    private String pmType;

    private String pmMoney;

    private String pmTitle;

    private Integer pmNum;

    private String pmDate;
    
    

    public PROJECT_MESSAGE(Integer pmId, Integer pmSort, String pmJob,
			String pmAddress, String pmType, String pmMoney, String pmTitle,
			Integer pmNum, String pmDate) {
		super();
		this.pmId = pmId;
		this.pmSort = pmSort;
		this.pmJob = pmJob;
		this.pmAddress = pmAddress;
		this.pmType = pmType;
		this.pmMoney = pmMoney;
		this.pmTitle = pmTitle;
		this.pmNum = pmNum;
		this.pmDate = pmDate;
	}

	public PROJECT_MESSAGE() {
		super();
	}

	public PROJECT_MESSAGE(Integer pmSort, String pmJob, String pmAddress,
			String pmType, String pmMoney, String pmTitle, Integer pmNum,
			String pmDate) {
		super();
		this.pmSort = pmSort;
		this.pmJob = pmJob;
		this.pmAddress = pmAddress;
		this.pmType = pmType;
		this.pmMoney = pmMoney;
		this.pmTitle = pmTitle;
		this.pmNum = pmNum;
		this.pmDate = pmDate;
	}

	@Override
	public String toString() {
		return "PROJECT_MESSAGE [pmId=" + pmId + ", pmSort=" + pmSort
				+ ", pmJob=" + pmJob + ", pmAddress=" + pmAddress + ", pmType="
				+ pmType + ", pmMoney=" + pmMoney + ", pmTitle=" + pmTitle
				+ ", pmNum=" + pmNum + ", pmDate=" + pmDate + "]";
	}

	public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public Integer getPmSort() {
        return pmSort;
    }

    public void setPmSort(Integer pmSort) {
        this.pmSort = pmSort;
    }

    public String getPmJob() {
        return pmJob;
    }

    public void setPmJob(String pmJob) {
        this.pmJob = pmJob == null ? null : pmJob.trim();
    }

    public String getPmAddress() {
        return pmAddress;
    }

    public void setPmAddress(String pmAddress) {
        this.pmAddress = pmAddress == null ? null : pmAddress.trim();
    }

    public String getPmType() {
        return pmType;
    }

    public void setPmType(String pmType) {
        this.pmType = pmType == null ? null : pmType.trim();
    }

    public String getPmMoney() {
        return pmMoney;
    }

    public void setPmMoney(String pmMoney) {
        this.pmMoney = pmMoney == null ? null : pmMoney.trim();
    }

    public String getPmTitle() {
        return pmTitle;
    }

    public void setPmTitle(String pmTitle) {
        this.pmTitle = pmTitle == null ? null : pmTitle.trim();
    }

    public Integer getPmNum() {
        return pmNum;
    }

    public void setPmNum(Integer pmNum) {
        this.pmNum = pmNum;
    }

    public String getPmDate() {
        return pmDate;
    }

    public void setPmDate(String pmDate) {
        this.pmDate = pmDate == null ? null : pmDate.trim();
    }
}