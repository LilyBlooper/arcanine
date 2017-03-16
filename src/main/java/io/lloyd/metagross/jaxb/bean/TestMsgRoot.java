package io.lloyd.metagross.jaxb.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "transaction")
@XmlType(propOrder = { "header", "body" })
public class TestMsgRoot {

	private MsgHeader header;

	private TestMsgBody body;

	@XmlElement(name = "body")
	public TestMsgBody getBody() {
		return body;
	}

	public void setBody(TestMsgBody body) {
		this.body = body;
	}

	@XmlElement(name = "header")
	public MsgHeader getHeader() {
		return header;
	}

	public void setHeader(MsgHeader header) {
		this.header = header;
	}

	/*
	 * ��̬�ڲ��ࣨJAXB ���Ͻӿڣ�ֻ�Ͼ�̬��
	 */
	public static class TestMsgBody {

		private static TestRequest req;

		private static TestResponse res;

		@XmlElement(name = "req")
		public TestRequest getReq() {
			return req;
		}

		public void setReq(TestRequest req) {
			this.req = req;
		}

		@XmlElement(name = "res")
		public TestResponse getRes() {
			return res;
		}

		public void setRes(TestResponse res) {
			this.res = res;
		}

		public static class TestRequest {
			public static class TestRequestListElmt {

				private String foo;

				private int bar;

				@XmlElement(name = "foo")
				public String getFoo() {
					return foo;
				}

				public void setFoo(String foo) {
					this.foo = foo;
				}

				@XmlElement(name = "bar")
				public int getBar() {
					return bar;
				}

				public void setBar(int bar) {
					this.bar = bar;
				}
			}

			/***
			 * ���п���
			 */

			private String cardNo;
			/***
			 * �����˺�
			 */

			private String eAcct;

			private List<TestRequestListElmt> elmtList;

			@XmlElementWrapper(name = "elmts")
			@XmlElement(name = "elmt")
			public List<TestRequestListElmt> getElmtList() {
				return elmtList;
			}

			public void setElmtList(List<TestRequestListElmt> elmtList) {
				this.elmtList = elmtList;
			}

			/**
			 * @return the eAcct
			 */
			@XmlElement(name = "eAcct")
			public String geteAcct() {
				return eAcct;
			}

			/**
			 * @param eAcct
			 *            the eAcct to set
			 */
			public void seteAcct(String eAcct) {
				this.eAcct = eAcct;
			}

			/**
			 * @return the cardNo
			 */
			@XmlElement(name = "cardNo")
			public String getCardNo() {
				return cardNo;
			}

			/**
			 * @param cardNo
			 *            the cardNo to set
			 */
			public void setCardNo(String cardNo) {
				this.cardNo = cardNo;
			}
		}

		public static class TestResponse {
			private String cardNo; // ���п���
			private String opnBnkNo;// �����к�
			private String opnBnkNm;// ��������

			/**
			 * @return the cardNo
			 */
			public String getCardNo() {
				return cardNo;
			}

			/**
			 * @param cardNo
			 *            the cardNo to set
			 */
			public void setCardNo(String cardNo) {
				this.cardNo = cardNo;
			}

			/**
			 * @return the opnBnkNo
			 */
			public String getOpnBnkNo() {
				return opnBnkNo;
			}

			/**
			 * @param opnBnkNo
			 *            the opnBnkNo to set
			 */
			public void setOpnBnkNo(String opnBnkNo) {
				this.opnBnkNo = opnBnkNo;
			}

			/**
			 * @return the opnBnkNm
			 */
			public String getOpnBnkNm() {
				return opnBnkNm;
			}

			/**
			 * @param opnBnkNm
			 *            the opnBnkNm to set
			 */
			public void setOpnBnkNm(String opnBnkNm) {
				this.opnBnkNm = opnBnkNm;
			}
		}
	}
}
