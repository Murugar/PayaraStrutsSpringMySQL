package com.iqmsoft.payara.struts;

public class UserDAO {
	public boolean checkLogin(User user) {
		return user.getUsername().equals("admin")
				&& user.getPassword().equals("nimda");
	}
}
