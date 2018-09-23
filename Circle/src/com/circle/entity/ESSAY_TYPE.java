package com.circle.entity;

import java.io.Serializable;

public class ESSAY_TYPE  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer etId;

    private Integer etSort;

    private String etName;

    private Integer etIds;
    

    public ESSAY_TYPE() {
		super();
	}

	public ESSAY_TYPE(Integer etSort, String etName, Integer etIds) {
		super();
		this.etSort = etSort;
		this.etName = etName;
		this.etIds = etIds;
	}

	public ESSAY_TYPE(Integer etId, Integer etSort, String etName, Integer etIds) {
		super();
		this.etId = etId;
		this.etSort = etSort;
		this.etName = etName;
		this.etIds = etIds;
	}

	@Override
	public String toString() {
		return "ESSAY_TYPE [etId=" + etId + ", etSort=" + etSort + ", etName="
				+ etName + ", etIds=" + etIds + "]";
	}

	public Integer getEtId() {
        return etId;
    }

    public void setEtId(Integer etId) {
        this.etId = etId;
    }

    public Integer getEtSort() {
        return etSort;
    }

    public void setEtSort(Integer etSort) {
        this.etSort = etSort;
    }

    public String getEtName() {
        return etName;
    }

    public void setEtName(String etName) {
        this.etName = etName == null ? null : etName.trim();
    }

    public Integer getEtIds() {
        return etIds;
    }

    public void setEtIds(Integer etIds) {
        this.etIds = etIds;
    }
}