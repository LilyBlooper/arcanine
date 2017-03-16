package io.lloyd.metagross.plain;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Dom4jTest {
	public static void main(String[] args) {
		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><sayHelloResponse xmlns=\"http://tempuri.org/\"><sayHelloResult>hello: tenghaibo</sayHelloResult></sayHelloResponse></soap:Body></soap:Envelope>";
		try {
			Document doc = DocumentHelper.parseText(xml);
			Element rootElmt = doc.getRootElement();
			System.out.println("根节点为： " + rootElmt.getName());
			Element body = rootElmt.element("Body");
			System.out.println("1级节点为： " + body.getName());
			Element response = body.element("sayHelloResponse");
			System.out.println("2级节点为： " + response.getName());
			List nodes = response.elements();
			for (Iterator it = nodes.iterator(); it.hasNext();) {
				Element elm = (Element) it.next();
				System.out.println("子节点为： " + elm.getName());
				System.out.println(("子节点内容为： " + elm.getText()));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
