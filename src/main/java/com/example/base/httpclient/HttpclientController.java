package com.example.base.httpclient;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.pool.PoolStats;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpclientController {
	@Autowired
	private PoolingHttpClientConnectionManager connectionManager;
	@Autowired
	private CloseableHttpClient httpClient;
	@RequestMapping("/httpclient")
	public String httpClientCall(){
		CloseableHttpResponse response = null;
		try {
			PoolStats poolStats = connectionManager.getTotalStats();
			System.out.println(poolStats.toString());
			HttpGet get = new HttpGet("http://www.google.com");
			response = httpClient.execute(get);
			EntityUtils.toString(response.getEntity());
			return poolStats.toString();
		} catch (Exception e) {
			return e.getMessage();
		} finally{
			if(response!=null){
				try {
					response.close();
				} catch (IOException e) {
					return e.getMessage();
				}
			}
		}
	}
}
