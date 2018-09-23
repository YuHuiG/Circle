package com.circle.entity;

import java.io.Serializable;

public class CapitalType  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer ccId;

    private Integer ccDesc;

    private String ccName;

    private Integer ccParentId;
    
    

    public CapitalType() {
		super();
	}

	public CapitalType(Integer ccDesc, String ccName, Integer ccParentId) {
		super();
		this.ccDesc = ccDesc;
		this.ccName = ccName;
		this.ccParentId = ccParentId;
	}

	public CapitalType(Integer ccId, Integer ccDesc, String ccName,
			Integer ccParentId) {
		super();
		this.ccId = ccId;
		this.ccDesc = ccDesc;
		this.ccName = ccName;
		this.ccParentId = ccParentId;
	}

	@Override
	public String toString() {
		return "CapitalType [ccId=" + ccId + ", ccDesc=" + ccDesc + ", ccName="
				+ ccName + ", ccParentId=" + ccParentId + "]";
	}

	public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getCcDesc() {
        return ccDesc;
    }

    public void setCcDesc(Integer ccDesc) {
        this.ccDesc = ccDesc;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName == null ? null : ccName.trim();
    }

    public Integer getCcParentId() {
        return ccParentId;
    }

    public void setCcParentId(Integer ccParentId) {
        this.ccParentId = ccParentId;
    }
}