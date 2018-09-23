package com.circle.entity;

import java.io.Serializable;

public class INVEST_TYPE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer itId;

    private Integer itSort;

    private String itName;

    private Integer itIds;

    public INVEST_TYPE() {
		super();
	}

	public INVEST_TYPE(Integer itSort, String itName, Integer itIds) {
		super();
		this.itSort = itSort;
		this.itName = itName;
		this.itIds = itIds;
	}

	public INVEST_TYPE(Integer itId, Integer itSort, String itName,
			Integer itIds) {
		super();
		this.itId = itId;
		this.itSort = itSort;
		this.itName = itName;
		this.itIds = itIds;
	}

	@Override
	public String toString() {
		return "INVEST_TYPE [itId=" + itId + ", itSort=" + itSort + ", itName="
				+ itName + ", itIds=" + itIds + "]";
	}

	public Integer getItId() {
        return itId;
    }

    public void setItId(Integer itId) {
        this.itId = itId;
    }

    public Integer getItSort() {
        return itSort;
    }

    public void setItSort(Integer itSort) {
        this.itSort = itSort;
    }

    public String getItName() {
        return itName;
    }

    public void setItName(String itName) {
        this.itName = itName == null ? null : itName.trim();
    }

    public Integer getItIds() {
        return itIds;
    }

    public void setItIds(Integer itIds) {
        this.itIds = itIds;
    }
}