package com.fiona.ws.pms;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fiona.ws.domain.req.RestaurantUtilisationRequest;
import com.fiona.ws.domain.req.UtilisationRequestOptions;
import com.fiona.ws.pms.HttpResult.Result;
import com.fiona.ws.pms.util.XmlHelper;

public class TestSubmit {
	public static final Logger LOGGER = LoggerFactory.getLogger(TestSubmit.class);

	private static String url="http://10.236.11.152/AvenistaPMSGuestBookings.asmx";
	public static String xmlsample="<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Header><SecuredWebServiceHeader xmlns=\"http://www.avenista.net/\"><UserName>{0}</UserName><Password>{1}</Password></SecuredWebServiceHeader></soap:Header><soap:Body>{2}</soap:Body></soap:Envelope>";
	/*static {
		PropertyConfigurator.configure(".\\src\\log4j.properties");
	}*/
	public static void main(String[] args) throws JAXBException, InterruptedException {
		ExecutorService  executor=Executors.newFixedThreadPool(100);
		//CompletableFuture<Void> future=new CompletableFuture<>();
		System.out.println("-----------------");
		RestaurantUtilisationRequest request=new RestaurantUtilisationRequest();
		request.setRestaurantIDs(new String[] {"WD7"});		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.MILLISECOND, 0);	
		cal.set(Calendar.DAY_OF_MONTH,19);
		cal.set(Calendar.HOUR_OF_DAY, 20);

		request.setDataPoint(cal);
		request.setOptions(UtilisationRequestOptions.AllTimes);
		List<HttpResult> list = new ArrayList<>();
		CountDownLatch latch=new CountDownLatch(50);
		for(int i=0;i<50;i++) {
			int b=i;		
			CompletableFuture<Void> cf = CompletableFuture.runAsync(()->{
				LOGGER.info("线程"+b);
				list.add(getUtl(request));
				latch.countDown();
			}, executor).toCompletableFuture();
			///Thread.sleep(5000);

		}
		latch.await();
		list.stream().forEach(o->{
			LOGGER.info(o.getResult()+" "+o.getResponseTime() );//+" " +o.getRespXml()
		});
		System.out.println("都执行完了");
		executor.shutdownNow();
		

	}
	public static  HttpResult getUtl(RestaurantUtilisationRequest request)  {
		long time1=System.currentTimeMillis();		
		String sendPostRequest;
		try {
			String sendContent =MessageFormat.format(xmlsample, "shoresidedevtest","shoresidedevtest",XmlHelper.xmlWrapper("GetRestaurantUtilisation", TestXml.convertToXMLContent(request)));
			sendPostRequest = HttpUtil.sendPostRequest(url, sendContent, HttpUtil.TYPE_XML, null);
			//System.out.println(sendPostRequest);		
		}catch (Exception e) {
			LOGGER.error(e.getMessage(),e);
			long time2=System.currentTimeMillis();
			return new HttpResult().setResponseTime(BigDecimal.valueOf(time2-time1).divide(BigDecimal.valueOf(1000)))
					.setResult(Result.FAIL);
		}
		long time2=System.currentTimeMillis();
		return new HttpResult().setResponseTime(BigDecimal.valueOf(time2-time1).divide(BigDecimal.valueOf(1000)))
				.setRespXml(sendPostRequest)
				.setResult(Result.SUCCESS);
	}


	public static  void getUtl() throws JAXBException {

		System.out.println("-----------------");
		RestaurantUtilisationRequest request=new RestaurantUtilisationRequest();
		request.setRestaurantIDs(new String[] {"WD7"});		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.MILLISECOND, 0);	
		cal.set(Calendar.DAY_OF_MONTH,19);
		cal.set(Calendar.HOUR_OF_DAY, 20);

		request.setDataPoint(cal);
		request.setOptions(UtilisationRequestOptions.AllTimes);
		System.out.println(TestXml.convertToXMLContent(request));
		String sendContent =MessageFormat.format(xmlsample, "shoresidedevtest","shoresidedevtest",XmlHelper.xmlWrapper("GetRestaurantUtilisation", TestXml.convertToXMLContent(request)));


		System.out.println(sendContent);
		String contentType=HttpUtil.TYPE_XML;
		String sendPostRequest = HttpUtil.sendPostRequest(url, sendContent, contentType, null);
		System.out.println(sendPostRequest);
	}

}
