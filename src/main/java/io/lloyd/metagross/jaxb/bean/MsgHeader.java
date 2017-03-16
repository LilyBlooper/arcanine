package io.lloyd.metagross.jaxb.bean;

public class MsgHeader {
	private MsgHeaderMsg msg;
	private MsgHeaderPnt pnt;
	private MsgHeaderStatus status;

	public MsgHeaderMsg getMsg() {
		return msg;
	}

	public void setMsg(MsgHeaderMsg msg) {
		this.msg = msg;
	}

	public MsgHeaderPnt getPnt() {
		return pnt;
	}

	public void setPnt(MsgHeaderPnt pnt) {
		this.pnt = pnt;
	}

	public MsgHeaderStatus getStatus() {
		return status;
	}

	public void setStatus(MsgHeaderStatus status) {
		this.status = status;
	}

}
