package com.fiona.ws.pms;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtil {
	private HttpUtil(){}
	private static boolean debug=false;
	private static final Logger LOGGER = LoggerFactory.getLogger(HttpUtil.class);
	private static final String UTF_8 = "utf-8";

	public static final String TYPE_JSON = "json";
	public static final String TYPE_XML = "xml";

	private static RequestConfig requestConfig;

	static {
		requestConfig = RequestConfig.custom()  
				.setConnectTimeout(1000*60*1).setConnectionRequestTimeout(1000*60*1)
				.setSocketTimeout(1000*60*1).build();
	}

	public static String getDataFromGet(String url){
		HttpGet httpGet = null;
		try {
			httpGet = new HttpGet(url);
			httpGet.setConfig(requestConfig);
			HttpClient client = HttpClientBuilder.create().build();
			HttpResponse response = client.execute(httpGet);
			String content = EntityUtils.toString(response.getEntity(), Charset.forName(UTF_8));
			if(debug) {
				LOGGER.info("the content of the url:{} is {}", url, content);
			}
			return content;
		} catch(ConnectException e1) {
			LOGGER.error("can not connect to the url {}", url);
			LOGGER.error("ConnectException: ",e1);
		} catch(SocketTimeoutException e2) {
			LOGGER.error("can not read content from the url {}", url);
			LOGGER.error("SocketTimeoutException: ",e2);
		} catch (Exception e3) {
			LOGGER.error("error for the url {}", url);
			LOGGER.error("Exception: ",e3);
		} finally {
			if (httpGet != null) {
				httpGet.releaseConnection();
			}
		}
		return null;
	}

	public static String sendPostRequest(String url, String sendContent, String contentType, String authorization) {
		HttpPost httppost = null;
		try {
			httppost = new HttpPost(url);
			httppost.setConfig(requestConfig);
			StringEntity stringEntity = new StringEntity(sendContent);
			httppost.setEntity(stringEntity);
			HttpClient client = HttpClientBuilder.create().build();

			if (StringUtils.equals(contentType, TYPE_JSON)) {
				httppost.addHeader(HTTP.CONTENT_TYPE, "application/json;charset=utf-8");
			} else if (StringUtils.equals(contentType, TYPE_XML)) {
				httppost.addHeader(HTTP.CONTENT_TYPE, "text/xml");
			}

			if (StringUtils.isNotBlank(authorization)) {
				httppost.addHeader("Authorization", authorization);
			}

			HttpResponse response = client.execute(httppost);
			String content = EntityUtils.toString(response.getEntity(), Charset.forName(UTF_8));
			if(debug) {
				LOGGER.info("the content of the url:{} send content:{} is {}", url, sendContent, content);
			}
			return content;
		} catch(ConnectException e1) {
			LOGGER.error("can not connect to the url {} and send content is {}", url, sendContent);
			LOGGER.error("ConnectException: ",e1);
		} catch(SocketTimeoutException e2) {
			LOGGER.error("can not read content from the url {} and send content is {}", url, sendContent);
			LOGGER.error("SocketTimeoutException: ",e2);
		} catch (Exception e3) {
			LOGGER.error("error for the url {} and send content is {}", url, sendContent);
			LOGGER.error("Exception: ",e3);
		} finally {
			if (httppost != null) {
				httppost.releaseConnection();
			}
		}
		return null;
	}

	public static String getDataFromGetWithAuthentication(String url, String host, Integer port, String scheme, String username, String password) {
		HttpGet httpGet = null;
		try {
			httpGet = new HttpGet(url);
			httpGet.setConfig(requestConfig);
			HttpClient client = HttpClientBuilder.create().build();

			HttpHost targetHost = new HttpHost(host, port, scheme);
			CredentialsProvider credsProvider = new BasicCredentialsProvider();
			credsProvider.setCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()), 
					new UsernamePasswordCredentials(username, password));

			// Create AuthCache instance
			AuthCache authCache = new BasicAuthCache();
			// Generate BASIC scheme object and add it to the local auth cache
			BasicScheme basicAuth = new BasicScheme();
			authCache.put(targetHost, basicAuth);

			// Add AuthCache to the execution context
			HttpClientContext context = HttpClientContext.create();
			context.setCredentialsProvider(credsProvider);
			context.setAuthCache(authCache);

			HttpResponse response = client.execute(targetHost, httpGet, context);
			String content = EntityUtils.toString(response.getEntity(), Charset.forName(UTF_8));
			if(debug) {
				LOGGER.info("the content of the url:{} is {}", url, content);
			}
			return content;
		} catch(ConnectException e1) {
			LOGGER.error("can not connect to the url {}", url);
			LOGGER.error("ConnectException: ",e1);
		} catch(SocketTimeoutException e2) {
			LOGGER.error("can not read content from the url {}", url);
			LOGGER.error("SocketTimeoutException: ",e2);
		} catch (Exception e3){
			LOGGER.error("error for the url {}",  url);
			LOGGER.error("Exception: ",e3);
		}finally {
			if (httpGet != null) {
				httpGet.releaseConnection();
			}
		}
		return null;
	}

	public static String getDataFromGetWithAuthentication(String url, String authorization){
		HttpGet httpGet = null;
		try{
			httpGet = new HttpGet(url);
			httpGet.setConfig(requestConfig);
			HttpClient client = HttpClientBuilder.create().build();
			httpGet.addHeader(HTTP.CONTENT_TYPE, "application/xml");
			httpGet.addHeader("Authorization", authorization);

			HttpResponse response = client.execute(httpGet);
			String content = EntityUtils.toString(response.getEntity(),Charset.forName(UTF_8));
			if(debug) {
				LOGGER.info("the content of the url:{} is {}", url, content);
			}
			return content;
		} catch(ConnectException e1) {
			LOGGER.error("can not connect to the url {}", url);
			LOGGER.error("ConnectException: ",e1);
		} catch(SocketTimeoutException e2) {
			LOGGER.error("can not read content from the url {}", url);
			LOGGER.error("SocketTimeoutException: ",e2);
		} catch (Exception e3) {
			LOGGER.error("io error for the url {}", url);
			LOGGER.error("Exception: ",e3);
		}finally{
			if (httpGet != null) {
				httpGet.releaseConnection();
			}
		}
		return null;
	}

	public static String sendFormPostRequest(String url, Map<String, String> params){
		HttpPost httppost = null;
		try {
			httppost = new HttpPost(url);
			httppost.setConfig(requestConfig);
			List<BasicNameValuePair> pairList = new ArrayList<>();
			for(String key : params.keySet()) {
				pairList.add(new BasicNameValuePair(key, params.get(key)));
			}
			httppost.setEntity(new UrlEncodedFormEntity(pairList,"utf-8"));
			HttpClient client = HttpClientBuilder.create().build();
			httppost.addHeader(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
			HttpResponse response = client.execute(httppost);
			String content = EntityUtils.toString(response.getEntity(), Charset.forName("utf-8"));
			return content;
		} catch(ConnectException e1) {
			LOGGER.error("can not connect to the url {} and content is {}", url, params);
			LOGGER.error("ConnectException: ",e1);
		} catch(SocketTimeoutException e2) {
			LOGGER.error("can not read content from the url {} and content is {}", url, params);
			LOGGER.error("SocketTimeoutException: ",e2);
		} catch (Exception e3) {
			LOGGER.error("error for the url {} and content is {}", url, params);
			LOGGER.error("Exception: ",e3);
		} finally {
			if (httppost != null) {
				httppost.releaseConnection();
			}
		}
		return null;
	}

	public static String sendJsonPostRequestByDefineTimeout(String url, String str, Integer timeout){
		HttpPost httppost = null;
		RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout)
				.setConnectionRequestTimeout(timeout)
				.setSocketTimeout(timeout).build();
		try {
			httppost = new HttpPost(url);
			httppost.setConfig(config);
			StringEntity stringEntity = new StringEntity(str,"utf-8");
			httppost.setEntity(stringEntity);
			HttpClient client = HttpClientBuilder.create().build();
			httppost.addHeader(HTTP.CONTENT_TYPE, "application/json;charset=utf-8");
			HttpResponse response = client.execute(httppost);
			String content = EntityUtils.toString(response.getEntity(), Charset.forName(UTF_8));
			if(debug) {
				LOGGER.info("the content of the url:{} is {}", url, content);
			}
			return content;
		} catch(ConnectException e1) {
			LOGGER.error("can not connect to the url {} and content is {}", url, str);
			LOGGER.error("ConnectException: ",e1);
		} catch(SocketTimeoutException e2) {
			LOGGER.error("can not read content from the url {} and content is {}", url, str);
			LOGGER.error("SocketTimeoutException: ",e2);
		} catch (Exception e3) {
			LOGGER.error("error for the url {} and content is {}", url, str);
			LOGGER.error("Exception: ",e3);
		} finally {
			if (httppost != null) {
				httppost.releaseConnection();
			}
		}
		return null;
	}

	public static Boolean isConnectSuccess(String urlStr, Integer timeOut) {
		try {
			URL url = new URL(urlStr);
			URLConnection connection = url.openConnection();
			connection.setConnectTimeout(timeOut*1000);
			connection.connect();
			LOGGER.info("connection success");
			return true;
		} catch (IOException e) {
			LOGGER.error("connection failed ", e);
			return false;
		}
	}




}
