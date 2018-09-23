package com.circle.entity;

import java.io.Serializable;

public class Users implements Serializable {
	private int id;
	private String name;
	private String pwd;
	private String reclog;
	private String ip;
	private String addr;

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", reclog=" + reclog + ", ip=" + ip + ", addr=" + addr + "]";
	}

	public Users(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	public Users() {
		super();
	}

	public Users(String name, String pwd, String reclog, String ip, String addr) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.reclog = reclog;
		this.ip = ip;
		this.addr = addr;
	}

	public Users(int id, String name, String pwd, String reclog, String ip,
			String addr) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.reclog = reclog;
		this.ip = ip;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getReclog() {
		return reclog;
	}

	public void setReclog(String reclog) {
		this.reclog = reclog;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
