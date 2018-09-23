package com.circle.entity;

import java.io.Serializable;

public class INVEST_MESSAGE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer imId;

    private String imName;

    private Integer itId;

    private String imLogo;

    private String imInveststage;

    private String imInvestfield;

    private String imBrief;

    private String imCasetext;

    private String imDetail;

    private String imCase;

    private String imGroup;

    private Integer imNum;

    private Integer imSort;
    
    private INVEST_TYPE invest_TYPE;
    

    public INVEST_TYPE getInvest_TYPE() {
		return invest_TYPE;
	}

	public void setInvest_TYPE(INVEST_TYPE invest_TYPE) {
		this.invest_TYPE = invest_TYPE;
	}

	public INVEST_MESSAGE() {
		super();
	}

	public INVEST_MESSAGE(String imName, Integer itId, String imLogo,
			String imInveststage, String imInvestfield, String imBrief,
			String imCasetext, String imDetail, String imCase, String imGroup,
			Integer imNum, Integer imSort) {
		super();
		this.imName = imName;
		this.itId = itId;
		this.imLogo = imLogo;
		this.imInveststage = imInveststage;
		this.imInvestfield = imInvestfield;
		this.imBrief = imBrief;
		this.imCasetext = imCasetext;
		this.imDetail = imDetail;
		this.imCase = imCase;
		this.imGroup = imGroup;
		this.imNum = imNum;
		this.imSort = imSort;
	}

	public INVEST_MESSAGE(Integer imId, String imName, Integer itId,
			String imLogo, String imInveststage, String imInvestfield,
			String imBrief, String imCasetext, String imDetail, String imCase,
			String imGroup, Integer imNum, Integer imSort) {
		super();
		this.imId = imId;
		this.imName = imName;
		this.itId = itId;
		this.imLogo = imLogo;
		this.imInveststage = imInveststage;
		this.imInvestfield = imInvestfield;
		this.imBrief = imBrief;
		this.imCasetext = imCasetext;
		this.imDetail = imDetail;
		this.imCase = imCase;
		this.imGroup = imGroup;
		this.imNum = imNum;
		this.imSort = imSort;
	}

	@Override
	public String toString() {
		return "INVEST_MESSAGE [imId=" + imId + ", imName=" + imName
				+ ", itId=" + itId + ", imLogo=" + imLogo + ", imInveststage="
				+ imInveststage + ", imInvestfield=" + imInvestfield
				+ ", imBrief=" + imBrief + ", imCasetext=" + imCasetext
				+ ", imDetail=" + imDetail + ", imCase=" + imCase
				+ ", imGroup=" + imGroup + ", imNum=" + imNum + ", imSort="
				+ imSort + "]";
	}

	public Integer getImId() {
        return imId;
    }

    public void setImId(Integer imId) {
        this.imId = imId;
    }

    public String getImName() {
        return imName;
    }

    public void setImName(String imName) {
        this.imName = imName == null ? null : imName.trim();
    }

    public Integer getItId() {
        return itId;
    }

    public void setItId(Integer itId) {
        this.itId = itId;
    }

    public String getImLogo() {
        return imLogo;
    }

    public void setImLogo(String imLogo) {
        this.imLogo = imLogo == null ? null : imLogo.trim();
    }

    public String getImInveststage() {
        return imInveststage;
    }

    public void setImInveststage(String imInveststage) {
        this.imInveststage = imInveststage == null ? null : imInveststage.trim();
    }

    public String getImInvestfield() {
        return imInvestfield;
    }

    public void setImInvestfield(String imInvestfield) {
        this.imInvestfield = imInvestfield == null ? null : imInvestfield.trim();
    }

    public String getImBrief() {
        return imBrief;
    }

    public void setImBrief(String imBrief) {
        this.imBrief = imBrief == null ? null : imBrief.trim();
    }

    public String getImCasetext() {
        return imCasetext;
    }

    public void setImCasetext(String imCasetext) {
        this.imCasetext = imCasetext == null ? null : imCasetext.trim();
    }

    public String getImDetail() {
        return imDetail;
    }

    public void setImDetail(String imDetail) {
        this.imDetail = imDetail == null ? null : imDetail.trim();
    }

    public String getImCase() {
        return imCase;
    }

    public void setImCase(String imCase) {
        this.imCase = imCase == null ? null : imCase.trim();
    }

    public String getImGroup() {
        return imGroup;
    }

    public void setImGroup(String imGroup) {
        this.imGroup = imGroup == null ? null : imGroup.trim();
    }

    public Integer getImNum() {
        return imNum;
    }

    public void setImNum(Integer imNum) {
        this.imNum = imNum;
    }

    public Integer getImSort() {
        return imSort;
    }

    public void setImSort(Integer imSort) {
        this.imSort = imSort;
    }
}