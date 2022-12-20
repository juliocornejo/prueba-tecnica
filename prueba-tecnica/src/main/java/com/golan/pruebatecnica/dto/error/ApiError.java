package com.golan.pruebatecnica.dto.error;

import java.io.Serializable;

/** ApiError
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
public class ApiError implements Serializable {
	
	private static final long serialVersionUID = -1360021176413807221L;
	
	private String httpCode;
	private String httpMessage;
	private String moreInformation;

	public ApiError() {
	}

	public ApiError(String httpCode, String httpMessage, String moreInformation) {
		this.httpCode = httpCode;
		this.httpMessage = httpMessage;
		this.moreInformation = moreInformation;
	}

	public String getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getHttpMessage() {
		return httpMessage;
	}

	public void setHttpMessage(String httpMessage) {
		this.httpMessage = httpMessage;
	}

	public String getMoreInformation() {
		return moreInformation;
	}

	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
}
