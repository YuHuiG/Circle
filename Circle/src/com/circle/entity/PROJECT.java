package com.circle.entity;

import java.io.Serializable;

public class PROJECT  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pId;

    private Integer pSort;

    private String pName;

    private Integer pIds;
    

    public PROJECT() {
		super();
	}

	public PROJECT(Integer pSort, String pName, Integer pIds) {
		super();
		this.pSort = pSort;
		this.pName = pName;
		this.pIds = pIds;
	}

	public PROJECT(Integer pId, Integer pSort, String pName, Integer pIds) {
		super();
		this.pId = pId;
		this.pSort = pSort;
		this.pName = pName;
		this.pIds = pIds;
	}

	@Override
	public String toString() {
		return "PROJECT [pId=" + pId + ", pSort=" + pSort + ", pName=" + pName
				+ ", pIds=" + pIds + "]";
	}

	public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getpSort() {
        return pSort;
    }

    public void setpSort(Integer pSort) {
        this.pSort = pSort;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getpIds() {
        return pIds;
    }

    public void setpIds(Integer pIds) {
        this.pIds = pIds;
    }
}