package com.circle.entity;

import java.io.Serializable;
import java.sql.Date;

public class ESSAY_MESSAGE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer emId;

    private String emTitle;

    private Integer emSort;

    private Integer emJob;

    private String emJobs;

    private String emImg;

    private String emSource;

    private Date emDate;

    private String emBrief;

    private String emLable;

    private String emDetail;

    private Integer emNum;
    

    public ESSAY_MESSAGE() {
		super();
	}

	public ESSAY_MESSAGE(String emTitle, Integer emSort, Integer emJob,
			String emJobs, String emImg, String emSource, Date emDate,
			String emBrief, String emLable, String emDetail, Integer emNum) {
		super();
		this.emTitle = emTitle;
		this.emSort = emSort;
		this.emJob = emJob;
		this.emJobs = emJobs;
		this.emImg = emImg;
		this.emSource = emSource;
		this.emDate = emDate;
		this.emBrief = emBrief;
		this.emLable = emLable;
		this.emDetail = emDetail;
		this.emNum = emNum;
	}

	public ESSAY_MESSAGE(Integer emId, String emTitle, Integer emSort,
			Integer emJob, String emJobs, String emImg, String emSource,
			Date emDate, String emBrief, String emLable, String emDetail,
			Integer emNum) {
		super();
		this.emId = emId;
		this.emTitle = emTitle;
		this.emSort = emSort;
		this.emJob = emJob;
		this.emJobs = emJobs;
		this.emImg = emImg;
		this.emSource = emSource;
		this.emDate = emDate;
		this.emBrief = emBrief;
		this.emLable = emLable;
		this.emDetail = emDetail;
		this.emNum = emNum;
	}

	@Override
	public String toString() {
		return "ESSAY_MESSAGE [emId=" + emId + ", emTitle=" + emTitle
				+ ", emSort=" + emSort + ", emJob=" + emJob + ", emJobs="
				+ emJobs + ", emImg=" + emImg + ", emSource=" + emSource
				+ ", emDate=" + emDate + ", emBrief=" + emBrief + ", emLable="
				+ emLable + ", emDetail=" + emDetail + ", emNum=" + emNum + "]";
	}

	public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public String getEmTitle() {
        return emTitle;
    }

    public void setEmTitle(String emTitle) {
        this.emTitle = emTitle == null ? null : emTitle.trim();
    }

    public Integer getEmSort() {
        return emSort;
    }

    public void setEmSort(Integer emSort) {
        this.emSort = emSort;
    }

    public Integer getEmJob() {
        return emJob;
    }

    public void setEmJob(Integer emJob) {
        this.emJob = emJob;
    }

    public String getEmJobs() {
        return emJobs;
    }

    public void setEmJobs(String emJobs) {
        this.emJobs = emJobs == null ? null : emJobs.trim();
    }

    public String getEmImg() {
        return emImg;
    }

    public void setEmImg(String emImg) {
        this.emImg = emImg == null ? null : emImg.trim();
    }

    public String getEmSource() {
        return emSource;
    }

    public void setEmSource(String emSource) {
        this.emSource = emSource == null ? null : emSource.trim();
    }

    public Date getEmDate() {
        return emDate;
    }

    public void setEmDate(Date emDate) {
        this.emDate = emDate;
    }

    public String getEmBrief() {
        return emBrief;
    }

    public void setEmBrief(String emBrief) {
        this.emBrief = emBrief == null ? null : emBrief.trim();
    }

    public String getEmLable() {
        return emLable;
    }

    public void setEmLable(String emLable) {
        this.emLable = emLable == null ? null : emLable.trim();
    }

    public String getEmDetail() {
        return emDetail;
    }

    public void setEmDetail(String emDetail) {
        this.emDetail = emDetail == null ? null : emDetail.trim();
    }

    public Integer getEmNum() {
        return emNum;
    }

    public void setEmNum(Integer emNum) {
        this.emNum = emNum;
    }
}