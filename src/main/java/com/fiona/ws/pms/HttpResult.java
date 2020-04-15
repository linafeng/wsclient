package com.fiona.ws.pms;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
@Data
@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
public class HttpResult implements Serializable{

	/**
	 * 
	 */
	public enum Result{
		SUCCESS,FAIL
	}
	private static final long serialVersionUID = 5163391559422566540L;
	private Result result;
	private BigDecimal responseTime;
	private String respXml;
	
	

}
