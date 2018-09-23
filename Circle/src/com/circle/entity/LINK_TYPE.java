package com.circle.entity;

import java.io.Serializable;

public class LINK_TYPE  implements Serializable{
    private Integer ltId;

    private Integer ltSort;

    private String ltNmae;
    

    public LINK_TYPE() {
		super();
	}

	public LINK_TYPE(Integer ltSort, String ltNmae) {
		super();
		this.ltSort = ltSort;
		this.ltNmae = ltNmae;
	}

	public LINK_TYPE(Integer ltId, Integer ltSort, String ltNmae) {
		super();
		this.ltId = ltId;
		this.ltSort = ltSort;
		this.ltNmae = ltNmae;
	}

	@Override
	public String toString() {
		return "LINK_TYPE [ltId=" + ltId + ", ltSort=" + ltSort + ", ltNmae="
				+ ltNmae + "]";
	}

	public Integer getLtId() {
        return ltId;
    }

    public void setLtId(Integer ltId) {
        this.ltId = ltId;
    }

    public Integer getLtSort() {
        return ltSort;
    }

    public void setLtSort(Integer ltSort) {
        this.ltSort = ltSort;
    }

    public String getLtNmae() {
        return ltNmae;
    }

    public void setLtNmae(String ltNmae) {
        this.ltNmae = ltNmae == null ? null : ltNmae.trim();
    }
}