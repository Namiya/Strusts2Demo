package org.namiya.service;

import org.namiya.model.User;

public class LoginService {

	public boolean verifyLogin(User user) {
		if (user.getUserId().equals("userId") && user.getPassword().equals("password")) {
			return true;
		}
		return false;
	}
}
