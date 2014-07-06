package org.namiya.action;

import org.apache.commons.lang.StringUtils;
import org.namiya.model.User;
import org.namiya.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	
	public void validate() {
		if(StringUtils.isEmpty(user.getUserId())) {
			addFieldError("userId", "user ID cannot be blank.");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password",	"Password cannot be blank.");
		}
	} 

	
	public String execute() {
		LoginService loginService = new LoginService();
		if (loginService.verifyLogin(user)) {
			return SUCCESS;
		}
		return LOGIN;
}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public User getModel() {
		
		return user;
	}


}
