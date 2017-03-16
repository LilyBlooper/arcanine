package io.lloyd.metagross.jaxb.test;

import io.lloyd.metagross.jaxb.bean.MsgHeader;
import io.lloyd.metagross.jaxb.bean.MsgHeaderMsg;
import io.lloyd.metagross.jaxb.bean.MsgHeaderPnt;
import io.lloyd.metagross.jaxb.bean.MsgHeaderStatus;
import io.lloyd.metagross.jaxb.bean.TestMsgRoot;
import io.lloyd.metagross.jaxb.bean.TestMsgRoot.TestMsgBody;
import io.lloyd.metagross.jaxb.bean.TestMsgRoot.TestMsgBody.TestRequest;
import io.lloyd.metagross.jaxb.bean.TestMsgRoot.TestMsgBody.TestRequest.TestRequestListElmt;
import io.lloyd.metagross.jaxb.bean.TestMsgRoot.TestMsgBody.TestResponse;
import io.lloyd.metagross.jaxb.util.JaxbXmlUtil;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CommonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	@Test
	public void testMarshall() throws Exception {
		// ����ͷ
		MsgHeaderMsg msg = new MsgHeaderMsg();
		msg.setCallTyp("callTyle");
		msg.setIp("11.11.11.11");
		msg.setMsgCd("a");
		msg.setRcvAppCd("assa");
		msg.setRcvMbrCd("ccc");
		msg.setSeqNb("saa");
		msg.setSndAppCd("sasa");
		msg.setSndDt("xxx");
		msg.setSndMbrCd("bbb");
		msg.setSndTm("a11111");
		MsgHeaderPnt pnt = new MsgHeaderPnt();
		pnt.setRcvAppCd("1");
		pnt.setRcvMbrCd("sasa");
		pnt.setSndAppCd("xxxx");
		pnt.setSndDt("11111");
		pnt.setSndTm("dddd");
		MsgHeaderStatus status = new MsgHeaderStatus();
		status.setAppCd("!");
		status.setDesc("cxzzzzzzzzz");
		status.setLocation("XH");
		status.setMbrCd("xxxx");
		status.setRetCd("11111");
		MsgHeader header = new MsgHeader();
		header.setMsg(msg);
		header.setPnt(pnt);
		header.setStatus(status);
		// ������
		TestMsgRoot root = new TestMsgRoot();
		TestMsgBody body = new TestMsgBody();
		TestRequestListElmt elmt1 = new TestMsgRoot.TestMsgBody.TestRequest.TestRequestListElmt();
		elmt1.setBar(111);
		elmt1.setFoo("FOO1");
		TestRequestListElmt elmt2 = new TestMsgRoot.TestMsgBody.TestRequest.TestRequestListElmt();
		elmt2.setBar(222);
		elmt2.setFoo("FOO2");
		TestRequestListElmt elmt3 = new TestMsgRoot.TestMsgBody.TestRequest.TestRequestListElmt();
		elmt3.setBar(333);
		elmt3.setFoo("FOO3");
		List<TestRequestListElmt> list = new ArrayList<TestRequestListElmt>();
		list.add(elmt1);
		list.add(elmt2);
		list.add(elmt3);
		TestRequest req = new TestMsgRoot.TestMsgBody.TestRequest();
		TestResponse res = new TestMsgRoot.TestMsgBody.TestResponse();
		req.setElmtList(list);
		req.setCardNo("requestCardNo");
		req.seteAcct("reqAcct");
		res.setCardNo("resCardNo");
		res.setOpnBnkNm("resOpnBnkNm");
		res.setOpnBnkNo("resOpnBnkNo");
		body.setReq(req);
		body.setRes(res);
		root.setBody(body);
		root.setHeader(header);
		System.out.println(JaxbXmlUtil.toXML(root));
	}

	@Test
	public void testUnmarshall() throws Exception {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><transaction><body><req><cardNo>requestCardNo</cardNo><elmts><elmt><bar>111</bar><foo>FOO1</foo></elmt><elmt><bar>222</bar><foo>FOO2</foo></elmt><elmt><bar>333</bar><foo>FOO3</foo></elmt></elmts><eAcct>reqAcct</eAcct></req><res><cardNo>resCardNo</cardNo><opnBnkNm>resOpnBnkNm</opnBnkNm><opnBnkNo>resOpnBnkNo</opnBnkNo></res></body><header><msg><callTyp>callTyle</callTyp><ip>11.11.11.11</ip><msgCd>a</msgCd><rcvAppCd>assa</rcvAppCd><rcvMbrCd>ccc</rcvMbrCd><seqNb>saa</seqNb><sndAppCd>sasa</sndAppCd><sndDt>xxx</sndDt><sndMbrCd>bbb</sndMbrCd><sndTm>a11111</sndTm></msg><pnt><rcvAppCd>1</rcvAppCd><rcvMbrCd>sasa</rcvMbrCd><sndAppCd>xxxx</sndAppCd><sndDt>11111</sndDt><sndTm>dddd</sndTm></pnt><status><appCd>!</appCd><desc>cxzzzzzzzzz</desc><location>XH</location><mbrCd>xxxx</mbrCd><retCd>11111</retCd></status></header></transaction>";
		TestMsgRoot obj = JaxbXmlUtil.fromXML(xml, TestMsgRoot.class);
		TestMsgRoot.TestMsgBody body = obj.getBody();
		TestMsgRoot.TestMsgBody.TestRequest req = body.getReq();
		List<TestMsgRoot.TestMsgBody.TestRequest.TestRequestListElmt> list = req.getElmtList();
		System.out.println(list.get(1).getBar());
		System.out.println(req.getCardNo() + req.geteAcct());
		System.out.println(obj.getBody().getReq().getCardNo());
	}
}
