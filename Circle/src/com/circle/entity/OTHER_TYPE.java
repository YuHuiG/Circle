package com.circle.entity;

import java.io.Serializable;

public class OTHER_TYPE  implements Serializable{
    private Integer otId;

    private Integer otSort;

    private String otName;

    private Integer otIds;
    

    public OTHER_TYPE() {
		super();
	}

	public OTHER_TYPE(Integer otSort, String otName, Integer otIds) {
		super();
		this.otSort = otSort;
		this.otName = otName;
		this.otIds = otIds;
	}

	public OTHER_TYPE(Integer otId, Integer otSort, String otName, Integer otIds) {
		super();
		this.otId = otId;
		this.otSort = otSort;
		this.otName = otName;
		this.otIds = otIds;
	}

	@Override
	public String toString() {
		return "OTHER_TYPE [otId=" + otId + ", otSort=" + otSort + ", otName="
				+ otName + ", otIds=" + otIds + "]";
	}

	public Integer getOtId() {
        return otId;
    }

    public void setOtId(Integer otId) {
        this.otId = otId;
    }

    public Integer getOtSort() {
        return otSort;
    }

    public void setOtSort(Integer otSort) {
        this.otSort = otSort;
    }

    public String getOtName() {
        return otName;
    }

    public void setOtName(String otName) {
        this.otName = otName == null ? null : otName.trim();
    }

    public Integer getOtIds() {
        return otIds;
    }

    public void setOtIds(Integer otIds) {
        this.otIds = otIds;
    }
}