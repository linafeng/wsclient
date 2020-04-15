package com.fiona.ws.pms.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class XmlHelper {
	public static void main(String[] args) {
		Document doc=DocumentHelper.createDocument();
		Element element=doc.addElement("GetRestaurantUtilisation","http://www.avenista.net/");
		element.setText("");
		System.out.println(doc.asXML());
		
		
	}
	public static String xmlWrapper(String wrapper,String content) {
		Document doc=DocumentHelper.createDocument();
		Element element=doc.addElement(wrapper,"http://www.avenista.net/");
		
		element.setText("");
		String xml=doc.asXML();			
		xml=xml.substring(xml.indexOf(wrapper)-1);//去掉标签头
		String temp=xml.substring(0,xml.length()-3-wrapper.length());
		xml=temp+content+"</"+wrapper+">";
		return xml;
	}

}
