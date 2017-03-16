package io.lloyd.metagross.jaxb.bean;

public class MsgHeaderStatus {
	private String retCd;
	private String desc;
	private String location;
	private String mbrCd;

	public String getRetCd() {
		return retCd;
	}

	public void setRetCd(String retCd) {
		this.retCd = retCd;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMbrCd() {
		return mbrCd;
	}

	public void setMbrCd(String mbrCd) {
		this.mbrCd = mbrCd;
	}

	public String getAppCd() {
		return appCd;
	}

	public void setAppCd(String appCd) {
		this.appCd = appCd;
	}

	private String appCd;
}
