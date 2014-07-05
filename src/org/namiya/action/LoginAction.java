package org.namiya.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String password;
	
	public void validate() {
		if(StringUtils.isEmpty(getUserId())) {
			addFieldError("userId", "user ID cannot be blank.");
		}
		if (StringUtils.isEmpty(getPassword())) {
			addFieldError("password",	"Password cannot be blank.");
		}
	} 

	
	public String execute() {
		
		if (getUserId().equals("userId") && getPassword().equals("password")) {
			return SUCCESS;
		}
		return LOGIN;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
