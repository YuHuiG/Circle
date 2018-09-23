package com.circle.entity;

import java.io.Serializable;

public class Webbi  implements Serializable{
    private Integer id;

    private String webname;

    private String servicephone;

    private String email;

    private String microblog;

    private String complainthotline;

    private String qrcode;

    private Integer enrollment;

    private Double amounts;

    private Double investorsearn;

    private String websiteopeningdate;

    private String copyright;

    private String antistop;

    private String description;
    

    public Webbi() {
		super();
	}

	public Webbi(String webname, String servicephone, String email,
			String microblog, String complainthotline, String qrcode,
			Integer enrollment, Double amounts, Double investorsearn,
			String websiteopeningdate, String copyright, String antistop,
			String description) {
		super();
		this.webname = webname;
		this.servicephone = servicephone;
		this.email = email;
		this.microblog = microblog;
		this.complainthotline = complainthotline;
		this.qrcode = qrcode;
		this.enrollment = enrollment;
		this.amounts = amounts;
		this.investorsearn = investorsearn;
		this.websiteopeningdate = websiteopeningdate;
		this.copyright = copyright;
		this.antistop = antistop;
		this.description = description;
	}

	public Webbi(Integer id, String webname, String servicephone, String email,
			String microblog, String complainthotline, String qrcode,
			Integer enrollment, Double amounts, Double investorsearn,
			String websiteopeningdate, String copyright, String antistop,
			String description) {
		super();
		this.id = id;
		this.webname = webname;
		this.servicephone = servicephone;
		this.email = email;
		this.microblog = microblog;
		this.complainthotline = complainthotline;
		this.qrcode = qrcode;
		this.enrollment = enrollment;
		this.amounts = amounts;
		this.investorsearn = investorsearn;
		this.websiteopeningdate = websiteopeningdate;
		this.copyright = copyright;
		this.antistop = antistop;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Webbi [id=" + id + ", webname=" + webname + ", servicephone="
				+ servicephone + ", email=" + email + ", microblog="
				+ microblog + ", complainthotline=" + complainthotline
				+ ", qrcode=" + qrcode + ", enrollment=" + enrollment
				+ ", amounts=" + amounts + ", investorsearn=" + investorsearn
				+ ", websiteopeningdate=" + websiteopeningdate + ", copyright="
				+ copyright + ", antistop=" + antistop + ", description="
				+ description + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getServicephone() {
        return servicephone;
    }

    public void setServicephone(String servicephone) {
        this.servicephone = servicephone == null ? null : servicephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMicroblog() {
        return microblog;
    }

    public void setMicroblog(String microblog) {
        this.microblog = microblog == null ? null : microblog.trim();
    }

    public String getComplainthotline() {
        return complainthotline;
    }

    public void setComplainthotline(String complainthotline) {
        this.complainthotline = complainthotline == null ? null : complainthotline.trim();
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public Integer getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Integer enrollment) {
        this.enrollment = enrollment;
    }

    public Double getAmounts() {
        return amounts;
    }

    public void setAmounts(Double amounts) {
        this.amounts = amounts;
    }

    public Double getInvestorsearn() {
        return investorsearn;
    }

    public void setInvestorsearn(Double investorsearn) {
        this.investorsearn = investorsearn;
    }

    public String getWebsiteopeningdate() {
        return websiteopeningdate;
    }

    public void setWebsiteopeningdate(String websiteopeningdate) {
        this.websiteopeningdate = websiteopeningdate == null ? null : websiteopeningdate.trim();
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }

    public String getAntistop() {
        return antistop;
    }

    public void setAntistop(String antistop) {
        this.antistop = antistop == null ? null : antistop.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}