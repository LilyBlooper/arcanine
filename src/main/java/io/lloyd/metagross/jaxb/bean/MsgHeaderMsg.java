package io.lloyd.metagross.jaxb.bean;

public class MsgHeaderMsg {
	private String msgCd;
	private String callTyp;
	private String seqNb;
	private String sndMbrCd;
	private String sndAppCd;
	private String sndDt;
	private String sndTm;
	private String rcvMbrCd;

	public String getMsgCd() {
		return msgCd;
	}

	public void setMsgCd(String msgCd) {
		this.msgCd = msgCd;
	}

	public String getCallTyp() {
		return callTyp;
	}

	public void setCallTyp(String callTyp) {
		this.callTyp = callTyp;
	}

	public String getSeqNb() {
		return seqNb;
	}

	public void setSeqNb(String seqNb) {
		this.seqNb = seqNb;
	}

	public String getSndMbrCd() {
		return sndMbrCd;
	}

	public void setSndMbrCd(String sndMbrCd) {
		this.sndMbrCd = sndMbrCd;
	}

	public String getSndAppCd() {
		return sndAppCd;
	}

	public void setSndAppCd(String sndAppCd) {
		this.sndAppCd = sndAppCd;
	}

	public String getSndDt() {
		return sndDt;
	}

	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
	}

	public String getSndTm() {
		return sndTm;
	}

	public void setSndTm(String sndTm) {
		this.sndTm = sndTm;
	}

	public String getRcvMbrCd() {
		return rcvMbrCd;
	}

	public void setRcvMbrCd(String rcvMbrCd) {
		this.rcvMbrCd = rcvMbrCd;
	}

	public String getRcvAppCd() {
		return rcvAppCd;
	}

	public void setRcvAppCd(String rcvAppCd) {
		this.rcvAppCd = rcvAppCd;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	private String rcvAppCd;
	private String ip;

}
