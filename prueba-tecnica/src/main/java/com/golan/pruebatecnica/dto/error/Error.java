package com.golan.pruebatecnica.dto.error;

import java.io.Serializable;

/** Error
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */

public class Error implements Serializable {

	private static final long serialVersionUID = -1360021176413807221L;

	private String status;
	private String title;
	private String detail;

	public Error() {
	}

	public Error(String status, String title, String detail) {
		this.status = status;
		this.title = title;
		this.detail = detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
