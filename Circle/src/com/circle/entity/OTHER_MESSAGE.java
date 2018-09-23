package com.circle.entity;

import java.io.Serializable;

public class OTHER_MESSAGE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer omId;

    private String omTitle;

    private Integer omTypeid;

    private String omContent;

    private String omDate;

    private Integer omSort;
    

    @Override
	public String toString() {
		return "OTHER_MESSAGE [omId=" + omId + ", omTitle=" + omTitle
				+ ", omTypeid=" + omTypeid + ", omContent=" + omContent
				+ ", omDate=" + omDate + ", omSort=" + omSort + "]";
	}

	public OTHER_MESSAGE(String omTitle, Integer omTypeid, String omContent,
			String omDate, Integer omSort) {
		super();
		this.omTitle = omTitle;
		this.omTypeid = omTypeid;
		this.omContent = omContent;
		this.omDate = omDate;
		this.omSort = omSort;
	}

	public OTHER_MESSAGE() {
		super();
	}

	public OTHER_MESSAGE(Integer omId, String omTitle, Integer omTypeid,
			String omContent, String omDate, Integer omSort) {
		super();
		this.omId = omId;
		this.omTitle = omTitle;
		this.omTypeid = omTypeid;
		this.omContent = omContent;
		this.omDate = omDate;
		this.omSort = omSort;
	}

	public Integer getOmId() {
        return omId;
    }

    public void setOmId(Integer omId) {
        this.omId = omId;
    }

    public String getOmTitle() {
        return omTitle;
    }

    public void setOmTitle(String omTitle) {
        this.omTitle = omTitle == null ? null : omTitle.trim();
    }

    public Integer getOmTypeid() {
        return omTypeid;
    }

    public void setOmTypeid(Integer omTypeid) {
        this.omTypeid = omTypeid;
    }

    public String getOmContent() {
        return omContent;
    }

    public void setOmContent(String omContent) {
        this.omContent = omContent == null ? null : omContent.trim();
    }

    public String getOmDate() {
        return omDate;
    }

    public void setOmDate(String omDate) {
        this.omDate = omDate == null ? null : omDate.trim();
    }

    public Integer getOmSort() {
        return omSort;
    }

    public void setOmSort(Integer omSort) {
        this.omSort = omSort;
    }
}