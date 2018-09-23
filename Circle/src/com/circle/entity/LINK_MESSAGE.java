package com.circle.entity;

import java.io.Serializable;

public class LINK_MESSAGE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer lmId;

    private String lmTitle;

    private Integer lmTypeid;

    private String lmImg;

    private String lmUrl;

    private Integer lmSort;
    

    @Override
	public String toString() {
		return "LINK_MESSAGE [lmId=" + lmId + ", lmTitle=" + lmTitle
				+ ", lmTypeid=" + lmTypeid + ", lmImg=" + lmImg + ", lmUrl="
				+ lmUrl + ", lmSort=" + lmSort + "]";
	}

	public LINK_MESSAGE() {
		super();
	}

	public LINK_MESSAGE(String lmTitle, Integer lmTypeid, String lmImg,
			String lmUrl, Integer lmSort) {
		super();
		this.lmTitle = lmTitle;
		this.lmTypeid = lmTypeid;
		this.lmImg = lmImg;
		this.lmUrl = lmUrl;
		this.lmSort = lmSort;
	}

	public LINK_MESSAGE(Integer lmId, String lmTitle, Integer lmTypeid,
			String lmImg, String lmUrl, Integer lmSort) {
		super();
		this.lmId = lmId;
		this.lmTitle = lmTitle;
		this.lmTypeid = lmTypeid;
		this.lmImg = lmImg;
		this.lmUrl = lmUrl;
		this.lmSort = lmSort;
	}

	public Integer getLmId() {
        return lmId;
    }

    public void setLmId(Integer lmId) {
        this.lmId = lmId;
    }

    public String getLmTitle() {
        return lmTitle;
    }

    public void setLmTitle(String lmTitle) {
        this.lmTitle = lmTitle == null ? null : lmTitle.trim();
    }

    public Integer getLmTypeid() {
        return lmTypeid;
    }

    public void setLmTypeid(Integer lmTypeid) {
        this.lmTypeid = lmTypeid;
    }

    public String getLmImg() {
        return lmImg;
    }

    public void setLmImg(String lmImg) {
        this.lmImg = lmImg == null ? null : lmImg.trim();
    }

    public String getLmUrl() {
        return lmUrl;
    }

    public void setLmUrl(String lmUrl) {
        this.lmUrl = lmUrl == null ? null : lmUrl.trim();
    }

    public Integer getLmSort() {
        return lmSort;
    }

    public void setLmSort(Integer lmSort) {
        this.lmSort = lmSort;
    }
}