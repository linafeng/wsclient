package com.fiona.ws.pms;

public class TestShip {
	private static String url="http://10.236.11.152/AvenistaPMSGuestBookings.asmx";

	public static void main(String[] args) {
		String sendContent="<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <soap:Header>\r\n" + 
				"    <SecuredWebServiceHeader xmlns=\"http://www.avenista.net/\">\r\n" + 
				"      <UserName>shoresidedevtest</UserName>\r\n" + 
				"      <Password>shoresidedevtest</Password>\r\n" + 
				"    </SecuredWebServiceHeader>\r\n" + 
				"  </soap:Header>\r\n" + 
				"  <soap:Body>\r\n" + 
				"    <GetShipInformation xmlns=\"http://www.avenista.net/\" />\r\n" + 
				"  </soap:Body>\r\n" + 
				"</soap:Envelope>";
		String contentType=HttpUtil.TYPE_XML;
		String sendPostRequest = HttpUtil.sendPostRequest(url, sendContent, contentType, null);
		System.out.println(sendPostRequest);

	}

}
